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
    ANALGESICOS("Analgésicos", Icons.Default.List),
    ANTIBIOTICOS("Antibióticos", Icons.Default.List),
    ANTICOAGULANTES("Anticoagulantes", Icons.Default.List),
    ANTIEPILEPTICOS("Antiepilépticos", Icons.Default.List),
    ANTIFUNGICOS("Antifúngicos", Icons.Default.List),
    ANTIHEMORROIDALES("Antihemorroidales", Icons.Default.List),
    ANTIHEPERTENSIVOS("Antihipertensivos", Icons.Default.List),
    ANTIHISTAMINICOS("Antihistamínicos", Icons.Default.List),
    ANTIINFLAMATORIOS("Antiinflamatorios", Icons.Default.List),
    ANTIPIRETIICOS("Antipiréticos", Icons.Default.List),
    ANTIRRETROVIRALES("Antirretrovirales", Icons.Default.List),
    ANTITUSIVOS("Antitusivos", Icons.Default.List),
    ANTIVIRALES("Antivirales", Icons.Default.List),
    ESTABILIZADORES_ANIMO("Estabilizadores del ánimo", Icons.Default.List),
    HIPERTIROIDISMO("Hipertiroidismo", Icons.Default.List),
    HIPOGLICEMIANTES("Hipoglicemiantes", Icons.Default.List),
    HIPOLIPEMIANTES("Hipolipemiantes", Icons.Default.List),
    HIPOTIROIDISMO("Hipertiroidismo", Icons.Default.List),
    INDUCTORES_SUENO("Inductores del sueño", Icons.Default.List),
    NEUROLEPTICOS("Neurolépticos", Icons.Default.List),
    
    // Nuevas categorías usadas en el repositorio
    ANTIALERGICOS("Antialérgicos", Icons.Default.List),
    ANTIDIABETICOS("Antidiabéticos", Icons.Default.List),
    CORTICOIDES("Corticoides", Icons.Default.List),
    DERMATOLOGICOS("Dermatológicos", Icons.Default.List),
    GASTROINTESTINALES("Gastrointestinales", Icons.Default.List)
}
