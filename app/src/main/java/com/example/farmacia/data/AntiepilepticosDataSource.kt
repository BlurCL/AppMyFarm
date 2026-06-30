package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AntiepilepticosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 101, nombre = "Pregabalina 150mg", principioActivo = "Pregabalina",
                categoria = AppDestinations.ANTIEPILEPTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Pregabalina 150mg.png"), especificacion = "Cápsula de 150 mg",
                familiaFarmacologica = "Anticonvulsivante / Neuromodulador",
                paraQueSirve = "Dolor neuropático: Ciática, neuralgia post-herpética, neuropatía diabética.",
                contraindicaciones = "Hipersensibilidad, insuficiencia renal severa sin ajuste de dosis.",
                conQueNoCombinar = "Alcohol, lorazepam, oxicodona.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 102, nombre = "Pregabalina 75mg", principioActivo = "Pregabalina",
                categoria = AppDestinations.ANTIEPILEPTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Pregabalina 75mg.png"), especificacion = "Cápsula de 75 mg",
                familiaFarmacologica = "Anticonvulsivante / Neuromodulador",
                paraQueSirve = "Dolor neuropático.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "Alcohol, depresores del SNC.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 103, nombre = "Pregabalina 50mg", principioActivo = "Pregabalina",
                categoria = AppDestinations.ANTIEPILEPTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Pregabalina 50mg.png"), especificacion = "Cápsula de 50 mg",
                familiaFarmacologica = "Antiepiléptico / Analgésico para dolor neuropático",
                paraQueSirve = "Dolor neuropático: Ciática, neuralgia post-herpética, neuropatía diabética.",
                contraindicaciones = "Hipersensibilidad a pregabalina.",
                conQueNoCombinar = "Alcohol.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
