package com.example.farmacia.ui.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.with
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.farmacia.model.Medicamento

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun FarmacoCard(
    variantes: List<Medicamento>,
    onClick: (Medicamento) -> Unit
) {
    if (variantes.isEmpty()) return

    // FIX: El currentIndex ahora se reinicia si la lista de variantes cambia
    var currentIndex by remember(variantes) { mutableIntStateOf(0) }
    
    // Aseguramos que el índice nunca se pase del tamaño actual (doble seguridad)
    val safeIndex = currentIndex.coerceIn(0, variantes.size - 1)
    val medicamentoActual = variantes[safeIndex]
    val tieneVariantes = variantes.size > 1

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick(medicamentoActual) },
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.8f)
                    .background(Color.White)
            ) {
                AnimatedContent(
                    targetState = medicamentoActual.imagenUrl,
                    transitionSpec = { fadeIn() with fadeOut() },
                    label = "ImageTransition"
                ) { targetImageUrl ->
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        if (targetImageUrl != null) {
                            AsyncImage(
                                model = targetImageUrl,
                                contentDescription = "Imagen de ${medicamentoActual.nombre}",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Fit
                            )
                        } else {
                            Icon(
                                imageVector = Icons.Default.Info,
                                contentDescription = null,
                                modifier = Modifier.size(64.dp),
                                tint = Color.LightGray
                            )
                        }
                    }
                }

                if (tieneVariantes) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 8.dp),
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
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .padding(8.dp),
                        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.8f),
                        shape = CircleShape
                    ) {
                        Text(
                            text = "${safeIndex + 1}/${variantes.size}",
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = medicamentoActual.nombre,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    textAlign = TextAlign.Center
                )
                
                if (medicamentoActual.especificacion.isNotEmpty()) {
                    Surface(
                        color = MaterialTheme.colorScheme.secondaryContainer,
                        shape = RoundedCornerShape(4.dp),
                        modifier = Modifier.padding(top = 4.dp)
                    ) {
                        Text(
                            text = medicamentoActual.especificacion,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            fontSize = 11.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun SelectorButton(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .size(36.dp)
            .clickable { onClick() },
        shape = CircleShape,
        color = Color.Black.copy(alpha = 0.3f),
        contentColor = Color.White
    ) {
        Box(contentAlignment = Alignment.Center) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(28.dp)
            )
        }
    }
}
