package com.example.farmacia.ui.screens

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import com.example.farmacia.model.Medicamento
import com.example.farmacia.ui.components.SelectorButton

@OptIn(ExperimentalMaterial3Api::class, ExperimentalAnimationApi::class)
@Composable
fun MedicationDetailScreen(
    inicial: Medicamento,
    variantes: List<Medicamento>,
    onBack: () -> Unit
) {
    var currentIndex by remember { 
        mutableIntStateOf(variantes.indexOfFirst { it.id == inicial.id }.coerceAtLeast(0)) 
    }
    val medicamento = variantes[currentIndex]
    val tieneVariantes = variantes.size > 1

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
                ),
                title = { Text(medicamento.nombre) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Volver"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.5f)
                    .clip(RoundedCornerShape(12.dp))
            ) {
                AnimatedContent(
                    targetState = medicamento.imagenUrl,
                    transitionSpec = { fadeIn() togetherWith fadeOut() },
                    label = "ImageTransition"
                ) { targetUrl ->
                    SubcomposeAsyncImage(
                        model = targetUrl,
                        contentDescription = "Imagen de ${medicamento.nombre}",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Fit,
                        loading = {
                            Box(contentAlignment = Alignment.Center) {
                                CircularProgressIndicator(modifier = Modifier.size(40.dp))
                            }
                        },
                        error = {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize().padding(16.dp)
                            ) {
                                Icon(Icons.Default.Info, null, modifier = Modifier.size(48.dp), tint = Color.LightGray)
                                Text("Imagen en proceso", style = MaterialTheme.typography.bodySmall)
                            }
                        }
                    )
                }

                if (tieneVariantes) {
                    Row(
                        modifier = Modifier.fillMaxSize().padding(horizontal = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        SelectorButton(
                            icon = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                            onClick = {
                                currentIndex = if (currentIndex > 0) currentIndex - 1 else variantes.size - 1
                            }
                        )
                        SelectorButton(
                            icon = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            onClick = {
                                currentIndex = (currentIndex + 1) % variantes.size
                            }
                        )
                    }
                    
                    Surface(
                        modifier = Modifier.align(Alignment.BottomEnd).padding(12.dp),
                        color = MaterialTheme.colorScheme.primary,
                        shape = CircleShape
                    ) {
                        Text(
                            text = "${currentIndex + 1} / ${variantes.size}",
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                            style = MaterialTheme.typography.labelMedium,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Nueva etiqueta de especificación unificada (ej: Comprimido)
            if (medicamento.especificacion.isNotEmpty()) {
                Surface(
                    color = Color.White.copy(alpha = 0.6f),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier.padding(bottom = 8.dp)
                ) {
                    Text(
                        text = medicamento.especificacion,
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                        style = MaterialTheme.typography.labelLarge,
                        color = Color(0xFF2E5A69),
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Column(modifier = Modifier.fillMaxWidth()) {
                // 1. Aviso de receta (AHORA PRIMERO)
                medicamento.tipoReceta?.let { receta ->
                    val esRetenida = receta.contains("retenida", ignoreCase = true)
                    Surface(
                        color = if (esRetenida) 
                            MaterialTheme.colorScheme.errorContainer 
                        else 
                            Color.White.copy(alpha = 0.6f),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = if (esRetenida) Icons.Default.Warning else Icons.Default.Info,
                                contentDescription = null,
                                tint = if (esRetenida)
                                    MaterialTheme.colorScheme.error
                                else
                                    Color(0xFF2E5A69)
                            )
                            Spacer(modifier = Modifier.size(12.dp))
                            Text(
                                text = receta,
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Bold,
                                color = if (esRetenida)
                                    MaterialTheme.colorScheme.error
                                else
                                    Color(0xFF2E5A69)
                            )
                        }
                    }
                }

                // 2. Alerta de margen terapéutico (AHORA SEGUNDO)
                if (medicamento.esEstrechoMargen) {
                    Surface(
                        color = MaterialTheme.colorScheme.errorContainer,
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Warning,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.error
                            )
                            Spacer(modifier = Modifier.size(12.dp))
                            Text(
                                text = "El consumo excesivo aumenta el riesgo de intoxicación",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.error
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                DetailSection(title = "Principio Activo", content = medicamento.principioActivo)
                DetailSection(title = "Familia farmacológica", content = medicamento.familiaFarmacologica)
                DetailSection(title = "Para qué sirve", content = medicamento.paraQueSirve)
                DetailSection(title = "Dosis", content = medicamento.dosis)
                DetailSection(title = "Contraindicaciones", content = medicamento.contraindicaciones)
                DetailSection(title = "Con qué no combinar", content = medicamento.conQueNoCombinar)
                DetailSection(title = "Efectos secundarios", content = medicamento.efectosSecundarios ?: "")
                DetailSection(title = "Cómo desechar correctamente", content = medicamento.comoDesechar)
                
                if (medicamento.datoExtra.isNotEmpty()) {
                    DetailSection(title = "Dato clave", content = medicamento.datoExtra)
                }
            }
        }
    }
}

@Composable
fun DetailSection(title: String, content: String) {
    if (content.isEmpty()) return
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = content,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(top = 4.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        HorizontalDivider(thickness = 0.5.dp, color = MaterialTheme.colorScheme.outlineVariant)
    }
}
