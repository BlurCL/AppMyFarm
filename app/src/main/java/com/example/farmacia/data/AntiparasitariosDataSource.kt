package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AntiparasitariosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 200, nombre = "Albendazol 200 mg", principioActivo = "Albendazol",
                categoria = AppDestinations.ANTIPARASITARIOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Albendazol 200 mg.png"), especificacion = "200 mg",
                familiaFarmacologica = "Antihelmíntico de amplio espectro",
                paraQueSirve = "Tratamiento de infecciones causadas por diversos parásitos intestinales y tisulares.",
                contraindicaciones = "Embarazo, hipersensibilidad al principio activo.",
                conQueNoCombinar = "Dexametasona, praziquantel, cimetidina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 201, nombre = "Albendazol 40 mg/ml", principioActivo = "Albendazol",
                categoria = AppDestinations.ANTIPARASITARIOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Albendazol 40 mg-ml.png"), especificacion = "Suspensión oral 40 mg/ml",
                familiaFarmacologica = "Antihelmíntico",
                paraQueSirve = "Infecciones parasitarias en niños y adultos que prefieren forma líquida.",
                contraindicaciones = "Embarazo y lactancia.",
                conQueNoCombinar = "Teofilina, fenitoína, carbamazepina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 202, nombre = "Mebendazol 100 mg", principioActivo = "Mebendazol",
                categoria = AppDestinations.ANTIPARASITARIOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Mebendazol 100 mg.png"), especificacion = "100 mg",
                familiaFarmacologica = "Antihelmíntico",
                paraQueSirve = "Tratamiento de oxiuriasis, ascaridiasis, tricocefalosis y anquilostomiasis.",
                contraindicaciones = "Hipersensibilidad, embarazo.",
                conQueNoCombinar = "Metronidazol (riesgo de síndrome de Stevens-Johnson), cimetidina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 203, nombre = "Mebendazol 100mg/5ml", principioActivo = "Mebendazol",
                categoria = AppDestinations.ANTIPARASITARIOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Mebendazol suspensión oral 100mg-5ml 35ml.png"), especificacion = "Suspensión 100mg/5ml",
                familiaFarmacologica = "Antihelmíntico",
                paraQueSirve = "Infecciones por parásitos intestinales en niños.",
                contraindicaciones = "Niños menores de 2 años.",
                conQueNoCombinar = "Metronidazol, cimetidina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
