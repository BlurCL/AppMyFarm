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
    ANTIPIRETICOS("Antipiréticos", Icons.Default.List),
    ANTIBIOTICOS("Antibióticos", Icons.Default.List),
    ANTICOAGULANTES("Anticoagulantes", Icons.Default.List),
    ANTIEPILEPTICOS("Antiepilépticos", Icons.Default.List),
    ANTIALERGICOS("Antialergicos (Antihistaminicos)", Icons.Default.List),
    ANTIDIABETICOS("Antidiabeticos (Hipoglicemiantes)", Icons.Default.List),
    CORTICOIDES("Corticoides", Icons.Default.List),
    DERMATOLOGICOS("Dermatológicos", Icons.Default.List),
    GASTROINTESTINALES("Gastrointestinales", Icons.Default.List),
    RELAJANTES_MUSCULARES("Relajantes musculares", Icons.Default.List),
    
    // Nuevas Categorías
    ANTIPARASITARIOS("Antiparasitarios", Icons.Default.List),
    HIPOLIPEMIANTES("Hipolipemiantes (Colesterol)", Icons.Default.List),
    RESPIRATORIOS("Respiratorios", Icons.Default.List),
    PSICOTROPICOS("Psicotrópicos (Ansiolíticos e Hipnóticos)", Icons.Default.List),
    HORMONAS("Hormonas y Tiroides", Icons.Default.List),
    ANTIHIPERTENSIVOS("Antihipertensivos", Icons.Default.List),
    ANTIVIRALES("Antivirales", Icons.Default.List),
    ANTIPSICOTICOS("Antipsicóticos", Icons.Default.List)
}
