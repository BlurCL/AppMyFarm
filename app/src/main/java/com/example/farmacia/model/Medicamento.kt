package com.example.farmacia.model

import com.example.farmacia.navigation.AppDestinations

data class Medicamento(
    val id: Int,
    val nombre: String,
    val principioActivo: String = "",
    val categoria: AppDestinations,
    val imagenUrl: String? = null, // Ahora usamos una URL de internet
    val especificacion: String,
    val dosis: String,
    val paraQueSirve: String,
    val grupoFarmacologico: String = "",
    val conQueNoCombinar: String = "",
    val comoDesechar: String = "",
    val datoExtra: String = "",
    val efectosSecundarios: String? = null,
    val precauciones: String? = null,
    val importante: String? = null
)
