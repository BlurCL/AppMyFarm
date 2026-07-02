package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object HipolipemiantesDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 210, nombre = "Gemfibrozilo 300 mg", principioActivo = "Gemfibrozilo",
                categoria = AppDestinations.HIPOLIPEMIANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Gemfibrozilo 300 mg.png"), especificacion = "300 mg",
                familiaFarmacologica = "Fibrato",
                paraQueSirve = "Reducción de niveles elevados de triglicéridos y colesterol en sangre.",
                contraindicaciones = "Insuficiencia renal o hepática grave, enfermedad de la vesícula biliar.",
                conQueNoCombinar = "Estatinas (aumenta riesgo de miopatía), repaglinida, anticoagulantes orales.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 211, nombre = "Gemfibrozilo 600 mg", principioActivo = "Gemfibrozilo",
                categoria = AppDestinations.HIPOLIPEMIANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Gemfibrozilo 600 mg.png"), especificacion = "600 mg",
                familiaFarmacologica = "Fibrato",
                paraQueSirve = "Tratamiento de hipertrigliceridemia grave y prevención cardiovascular.",
                contraindicaciones = "Hipersensibilidad, fotosensibilidad conocida a fibratos.",
                conQueNoCombinar = "Simvastatina, lovastatina (riesgo de rabdomiólisis), anticoagulantes.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 212, nombre = "Ciprofibrato 100mg", principioActivo = "Ciprofibrato",
                categoria = AppDestinations.HIPOLIPEMIANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Ciprofibrato 100mg.png"), especificacion = "100 mg",
                familiaFarmacologica = "Fibrato",
                paraQueSirve = "Tratamiento de hiperlipidemias primarias resistentes a tratamiento dietético.",
                contraindicaciones = "Embarazo, lactancia, insuficiencia renal severa.",
                conQueNoCombinar = "Otros fibratos, estatinas, anticoagulantes orales.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 213, nombre = "Atorvastatina 10mg", principioActivo = "Atorvastatina",
                categoria = AppDestinations.HIPOLIPEMIANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Atorvastanina 10mg.png"), especificacion = "10 mg",
                familiaFarmacologica = "Estatina (Inhibidor de la HMG-CoA reductasa)",
                paraQueSirve = "Reducción del colesterol total y colesterol LDL ('malo').",
                contraindicaciones = "Enfermedad hepática activa, embarazo, lactancia.",
                conQueNoCombinar = "Ciclosporina, claritromicina, jugo de pomelo (toronja), gemfibrozilo.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 214, nombre = "Atorvastatina 20mg", principioActivo = "Atorvastatina",
                categoria = AppDestinations.HIPOLIPEMIANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Atorvastanina 20mg.png"), especificacion = "20 mg",
                familiaFarmacologica = "Estatina",
                paraQueSirve = "Prevención de eventos cardiovasculares en pacientes con alto riesgo.",
                contraindicaciones = "Hipersensibilidad, elevaciones persistentes de transaminasas séricas.",
                conQueNoCombinar = "Itraconazol, inhibidores de la proteasa del VIH, eritromicina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
