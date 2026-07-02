package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object RelajantesMuscularesDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 104, 
                nombre = "Ciclobenzaprina Clorhidrato 10mg", 
                principioActivo = "Ciclobenzaprina",
                categoria = AppDestinations.RELAJANTES_MUSCULARES, 
                formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Ciclobenzaprina Clorhidrato 10mg.png"), 
                especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "Relajante muscular de acción central",
                paraQueSirve = "Alivio de espasmos musculares asociados a afecciones agudas y dolorosas del sistema musculoesquelético.",
                contraindicaciones = "Hipersensibilidad, fase aguda post-infarto de miocardio, arritmias.",
                conQueNoCombinar = "Inhibidores de la MAO, alcohol, otros depresores del SNC.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 105, 
                nombre = "Tiocolchicósido 8mg", 
                principioActivo = "Tiocolchicósido",
                categoria = AppDestinations.RELAJANTES_MUSCULARES, 
                formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tiocolchicósido 8mg.png"), 
                especificacion = "Cápsula de 8 mg",
                familiaFarmacologica = "Relajante muscular",
                paraQueSirve = "Tratamiento adyuvante de contracturas musculares dolorosas en patología espinal aguda.",
                contraindicaciones = "Embarazo, lactancia, hipersensibilidad.",
                conQueNoCombinar = "Otros relajantes musculares.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
