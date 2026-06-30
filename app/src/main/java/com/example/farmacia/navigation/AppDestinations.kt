package com.example.farmacia.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector

enum class AppDestinations(
    val label: String,
    val icon: ImageVector,
) {
    INICIO("Inicio", Icons.Default.Home),
    ANALGESICOS("Analgésicos AINE", Icons.Default.List),
    ANTIPIRETICOS("Antipiréticos", Icons.Default.List), // Aquí irán Paracetamol, Metamizol y Tramadol
    ANTIBIOTICOS("Antibióticos", Icons.Default.List),
    ANTICOAGULANTES("Anticoagulantes", Icons.Default.List),
    ANTIEPILEPTICOS("Antiepilépticos", Icons.Default.List), // Para la Pregabalina
    ANTIALERGICOS("Antialergicos (Antihistaminicos)", Icons.Default.List),
    ANTIDIABETICOS("Antidiabeticos (Hipoglicemiantes)", Icons.Default.List),
    CORTICOIDES("Corticoides", Icons.Default.List),
    DERMATOLOGICOS("Dermatológicos", Icons.Default.List),
    GASTROINTESTINALES("Gastrointestinales", Icons.Default.List),
    RELAJANTES_MUSCULARES("Relajantes musculares", Icons.Default.List)
}
