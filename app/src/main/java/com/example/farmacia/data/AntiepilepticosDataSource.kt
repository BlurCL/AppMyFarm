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
                familiaFarmacologica = "Análogo del GABA / Anticonvulsivante / Neuromodulador",
                paraQueSirve = "Actúa reduciendo la liberación de neurotransmisores excitadores en el sistema nervioso central. \n\nINDICACIONES: \n- Dolor neuropático periférico y central (neuropatía diabética, neuralgia postherpética).\n- Epilepsia: Tratamiento combinada en crisis parciales con o sin generalización secundaria.\n- Trastorno de Ansiedad Generalizada (TAG) en adultos.\n- Fibromialgia.",
                contraindicaciones = "Hipersensibilidad a la pregabalina. Pacientes con antecedentes de angioedema. Requiere ajuste de dosis estricto en insuficiencia renal (aclaramiento de creatinina < 60 ml/min).",
                conQueNoCombinar = "Alcohol y depresores del SNC (Lorazepam, Oxicodona): Potencian de forma peligrosa la somnolencia y la alteración de la función motora. Medicamentos para la diabetes (Pioglitazona): Aumentan riesgo de edema y aumento de peso.",
                efectosSecundarios = "Somnolencia, mareos (muy frecuentes), aumento de peso, edema periférico, visión borrosa, sequedad de boca y confusión.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Llevar a Punto Azul en farmacia. Sustancia controlada; no verter al alcantarillado.",
                datoExtra = "Se puede tomar con o sin alimentos. La suspensión del tratamiento debe ser gradual durante al menos una semana para evitar síntomas de abstinencia (insomnio, dolor de cabeza, náuseas)."
            ),
            Medicamento(
                id = 102, nombre = "Pregabalina 75mg", principioActivo = "Pregabalina",
                categoria = AppDestinations.ANTIEPILEPTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Pregabalina 75mg.png"), especificacion = "Cápsula de 75 mg",
                familiaFarmacologica = "Análogo del GABA",
                paraQueSirve = "Dosis de inicio común para el dolor neuropático y el trastorno de ansiedad. Permite una titulación gradual para mejorar la tolerancia del paciente a los efectos secundarios iniciales como el mareo.",
                contraindicaciones = "Mismas que la dosis de 150mg. Cuidado especial en pacientes de edad avanzada por riesgo de caídas debido a la somnolencia.",
                conQueNoCombinar = "Alcohol, opioides y benzodiacepinas. Puede potenciar el efecto de la tiazolidinediona.",
                efectosSecundarios = "Mareos, fatiga, irritabilidad, trastornos de la atención y dificultades en la memoria.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia.",
                datoExtra = "No conducir ni manejar maquinaria pesada hasta que sepa cómo le afecta el medicamento, ya que los mareos y la somnolencia son muy comunes al inicio."
            ),
            Medicamento(
                id = 103, nombre = "Pregabalina 50mg", principioActivo = "Pregabalina",
                categoria = AppDestinations.ANTIEPILEPTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Pregabalina 50mg.png"), especificacion = "Cápsula de 50 mg",
                familiaFarmacologica = "Antiepiléptico / Analgésico para dolor neuropático",
                paraQueSirve = "Utilizada para ajustes finos de dosis en pacientes con insuficiencia renal o como dosis inicial muy baja en personas sensibles a los efectos secundarios.",
                contraindicaciones = "Hipersensibilidad. Cuidado en pacientes con insuficiencia cardíaca congestiva (clase NYHA III o IV).",
                conQueNoCombinar = "Depresores del sistema nervioso central.",
                efectosSecundarios = "Ganancia de apetito, euforia, estreñimiento, visión borrosa.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Punto Azul.",
                datoExtra = "Si olvida una dosis, tómela en cuanto se acuerde a menos que sea casi la hora de la siguiente. Nunca duplique la dosis."
            )
        )
    }
}
