package com.example.farmacia.model

import com.example.farmacia.navigation.AppDestinations

enum class FormaFarmaceutica {
    COMPRIMIDO_CAPSULA,
    JARABE_SUSPENSION,
    SOLUCION_ORAL,
    CREMA_UNGUENTO,
    INYECTABLE,
    OTRO
}

data class Medicamento(
    val id: Int,
    val nombre: String,
    val principioActivo: String = "",
    val categoria: AppDestinations,
    val formaFarmaceutica: FormaFarmaceutica,
    val esAINE: Boolean = false,
    val imagenUrl: String? = null,
    val dosis: String = "",
    val familiaFarmacologica: String = "",
    val paraQueSirve: String = "",
    val conQueNoCombinar: String = "",
    val contraindicaciones: String = "", // Renombrado de quienesNoDebenTomar
    val comoDesechar: String = "",
    val especificacion: String = "", 
    val efectosSecundarios: String? = null,
    val datoExtra: String = ""
)
