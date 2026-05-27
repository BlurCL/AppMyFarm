package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object DermatologicosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 15, nombre = "Clotrimazol-Betametasona 1/0,05%", principioActivo = "Clotrimazol, Betametasona",
                categoria = AppDestinations.DERMATOLOGICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                imagenUrl = getUrl("Clotrimazol-Betametasona 1-0,05 Crema topica 15g.jpeg"), especificacion = "Crema tópica 15g",
                familiaFarmacologica = "Antimicótico asociado a corticoide", 
                paraQueSirve = "Tratamiento tópico de infecciones fúngicas de la piel que presentan inflamación o prurito.",
                contraindicaciones = "Hipersensibilidad, tuberculosis cutánea, sífilis, infecciones virales (herpes, varicela), rosácea.",
                conQueNoCombinar = "Otros corticosteroides tópicos, vendajes oclusivos (salvo indicación médica).", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 45, nombre = "Betametasona + Neomicina 10g", principioActivo = "Betametasona, Neomicina",
                categoria = AppDestinations.DERMATOLOGICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                imagenUrl = getUrl("betametasona + neomicina 10g ungueto dérmico.jpeg"), especificacion = "Ungüento dérmico 10g",
                familiaFarmacologica = "Corticosteroide asociado a antibiótico aminoglucósido", 
                paraQueSirve = "Tratamiento de dermatosis inflamatorias con infección bacteriana secundaria sensible a neomicina.",
                contraindicaciones = "Hipersensibilidad a los componentes, procesos tuberculosos o virales en la zona a tratar.",
                conQueNoCombinar = "Uso prolongado con otros antibióticos aminoglucósidos sistémicos por riesgo de ototoxicidad.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 46, nombre = "Betametasona 0,05% 15g", principioActivo = "Betametasona",
                categoria = AppDestinations.DERMATOLOGICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                imagenUrl = getUrl("betametasona 0,05%- 15g ungueto topico.jpeg"), especificacion = "Ungüento tópico 15g",
                familiaFarmacologica = "Corticosteroide tópico de alta potencia", 
                paraQueSirve = "Alivio de manifestaciones inflamatorias y pruríticas de dermatosis como psoriasis y eczema.",
                contraindicaciones = "Hipersensibilidad, acné, dermatitis perioral, infecciones cutáneas primarias.",
                conQueNoCombinar = "Uso extenso en la cara o en pliegues de la piel sin supervisión.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 57, nombre = "Hidrocortisona crema 1%", principioActivo = "Hidrocortisona",
                categoria = AppDestinations.DERMATOLOGICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                imagenUrl = getUrl("hidrocortisona Crema tópica 1% 15g.jpeg"), especificacion = "Crema tópica 15g",
                familiaFarmacologica = "Corticosteroide tópico de baja potencia", 
                paraQueSirve = "Alivio temporal de picazón e inflamación por dermatitis, picaduras o alergias leves.",
                contraindicaciones = "Hipersensibilidad, heridas abiertas, zonas con infección fúngica o viral sin tratamiento.",
                conQueNoCombinar = "Uso prolongado bajo vendajes oclusivos en niños.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
