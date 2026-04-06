package com.example.farmacia.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = AzulPetroleo,
    secondary = Turquesa,
    tertiary = AzulCelesteIntenso,
    // Usamos el Gris Verdoso Muy Claro de tu paleta para el fondo
    // Es suave, profesional y hace que las tarjetas blancas resalten
    background = GrisVerdosoMuyClaro, 
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F)
)

@Composable
fun FarmaciaTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}
