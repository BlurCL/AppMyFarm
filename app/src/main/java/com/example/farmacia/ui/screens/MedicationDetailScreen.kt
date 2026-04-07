package com.example.farmacia.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.graphicsLayer
import coil.compose.AsyncImage
import com.example.farmacia.model.Medicamento

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MedicationDetailScreen(
    medicamento: Medicamento,
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
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
            // Imagen del Medicamento
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.5f)
                    .clip(RoundedCornerShape(12.dp)),
                color = Color(0xFFF0F0F0)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    if (medicamento.imagenUrl != null) {
                        // Carga de imagen desde URL para el detalle
                        AsyncImage(
                            model = medicamento.imagenUrl,
                            contentDescription = "Imagen de ${medicamento.nombre}",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Fit
                        )
                    } else {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(0.4f),
                            tint = Color.LightGray
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Ficha Técnica
            Column(modifier = Modifier.fillMaxWidth()) {
                DetailSection(title = "Especificación", content = medicamento.especificacion)
                DetailSection(title = "Para qué sirve", content = medicamento.paraQueSirve)
                DetailSection(title = "Dosis", content = medicamento.dosis)
                
                if (medicamento.grupoFarmacologico.isNotEmpty()) {
                    DetailSection(title = "Grupo farmacológico", content = medicamento.grupoFarmacologico)
                }
                if (medicamento.conQueNoCombinar.isNotEmpty()) {
                    DetailSection(title = "Con qué no combinar", content = medicamento.conQueNoCombinar)
                }
                if (medicamento.comoDesechar.isNotEmpty()) {
                    DetailSection(title = "Cómo desechar", content = medicamento.comoDesechar)
                }
                
                medicamento.efectosSecundarios?.let {
                    if (it.isNotEmpty()) DetailSection(title = "Efectos secundarios", content = it)
                }
                medicamento.precauciones?.let {
                    if (it.isNotEmpty()) DetailSection(title = "Precauciones", content = it)
                }
                
                if (medicamento.datoExtra.isNotEmpty()) {
                    DetailSection(title = "Dato extra", content = medicamento.datoExtra)
                }
                
                medicamento.importante?.let {
                    if (it.isNotEmpty()) DetailSection(title = "Importante", content = it)
                }
            }
        }
    }
}

@Composable
fun DetailSection(title: String, content: String) {
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
        HorizontalDivider(thickness = 0.5.dp, color = Color.LightGray)
    }
}
