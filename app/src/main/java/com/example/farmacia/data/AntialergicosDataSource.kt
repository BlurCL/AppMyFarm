package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AntialergicosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 10, nombre = "Cetirizina solución oral 10mg/ml", principioActivo = "Cetirizina diclorhidrato",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.SOLUCION_ORAL,
                imagenUrl = getUrl("Cetirizina Diclorhidrato Solucion oral 10mg-ml.jpeg"), especificacion = "Gotas/Solución oral",
                familiaFarmacologica = "Antihistamínico de segunda generación (Antagonista H1)", 
                paraQueSirve = "Bloquea los receptores H1 de la histamina. Indicado para el alivio de síntomas nasales y oculares de la rinitis alérgica estacional y permanente, y para el tratamiento de la urticaria crónica idiopática en niños y adultos.",
                contraindicaciones = "Hipersensibilidad a la cetirizina, a la hidroxizina o a cualquier derivado de la piperazina. Insuficiencia renal grave (aclaramiento de creatinina inferior a 10 ml/min).",
                conQueNoCombinar = "Aunque es de segunda generación, debe evitarse el consumo excesivo de alcohol y fármacos depresores del sistema nervioso central, ya que puede potenciar la somnolencia en personas sensibles.", 
                efectosSecundarios = "Somnolencia leve (en algunos pacientes), mareos, cefalea, fatiga y sequedad de boca.",
                comoDesechar = "Depositar en contenedores de Punto Azul en farmacias.",
                datoExtra = "La presentación en gotas permite un ajuste preciso de la dosis según el peso en pacientes pediátricos."
            ),
            Medicamento(
                id = 11, nombre = "Cetirizina 10mg", principioActivo = "Cetirizina diclorhidrato",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Cetirizina diclorhidrato 10mg.jpeg"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "Antihistamínico de segunda generación", 
                paraQueSirve = "Alivio rápido y prolongado de los síntomas de la alergia: estornudos, picazón de nariz y ojos, secreción nasal y ronchas en la piel. No suele causar somnolencia a dosis terapéuticas estándar.",
                contraindicaciones = "Falla renal severa. Hipersensibilidad al componente.",
                conQueNoCombinar = "Teofilina (en dosis altas puede reducir ligeramente el aclaramiento de cetirizina).", 
                efectosSecundarios = "Cansancio, faringitis, mareos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia.",
                datoExtra = "Se recomienda tomar preferentemente por la noche si el paciente experimenta una leve somnolencia diurna."
            ),
            Medicamento(
                id = 13, nombre = "Clorfenamina maleato jarabe 2,5mg/5ml", principioActivo = "Clorfenamina maleato",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Clorfenamina maleato 2,5mg-5ml 100ml jarabe.jpeg"), especificacion = "Suspensión oral",
                familiaFarmacologica = "Antihistamínico de primera generación (Alquilamina)", 
                paraQueSirve = "Antagonista de receptores H1 con potente efecto antialérgico pero alta penetración en el sistema nervioso central. Indicado en reacciones alérgicas agudas, rinitis, conjuntivitis y picaduras de insectos.",
                contraindicaciones = "Niños menores de 2 años. Pacientes con glaucoma de ángulo cerrado, hipertrofia prostática (por su efecto anticolinérgico que puede causar retención urinaria) y durante crisis asmáticas.",
                conQueNoCombinar = "Alcohol, sedantes, tranquilizantes, inhibidores de la MAO y antidepresivos tricíclicos (potencian el efecto sedante y anticolinérgico de forma peligrosa).", 
                efectosSecundarios = "Somnolencia intensa (muy frecuente), visión borrosa, sequedad de mucosas, estreñimiento y mareos.",
                comoDesechar = "Punto Azul.",
                datoExtra = "Debido a su marcado efecto sedante, es muy útil en reacciones alérgicas nocturnas que impiden el descanso del niño."
            ),
            Medicamento(
                id = 14, nombre = "Clorfenamina maleato 4mg", principioActivo = "Clorfenamina maleato",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Clorfenamina maleato 4mg.jpeg"), especificacion = "Comprimido de 4 mg",
                familiaFarmacologica = "Antihistamínico de primera generación", 
                paraQueSirve = "Tratamiento de síntomas alérgicos agudos. Debido a su efecto secundario sedante, a veces se usa para el alivio de síntomas del resfriado común que cursan con mucha secreción nasal y dificultad para dormir.",
                contraindicaciones = "Glaucoma, obstrucción piloroduodenal, riesgo de retención urinaria. No conducir tras su ingesta.",
                conQueNoCombinar = "Depresores del SNC, alcohol.", 
                efectosSecundarios = "Sedación profunda, espesamiento de las secreciones bronquiales, boca seca.",
                comoDesechar = "Contenedor de medicamentos vencidos.",
                datoExtra = "ADVERTENCIA: Evitar su uso en adultos mayores por el alto riesgo de confusión y caídas debido a sus efectos sobre el sistema nervioso."
            ),
            Medicamento(
                id = 17, nombre = "Desloratadina 5mg", principioActivo = "Desloratadina",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Desloratadina 5 mg.jpeg"), especificacion = "Comprimido de 5 mg",
                familiaFarmacologica = "Antihistamínico de tercera generación (Metabolito activo de loratadina)", 
                paraQueSirve = "Antihistamínico de acción prolongada, no sedante. Bloquea selectivamente los receptores H1 periféricos. Indicado para el alivio rápido de los síntomas de la rinitis alérgica y la urticaria (picor y ronchas).",
                contraindicaciones = "Hipersensibilidad a la desloratadina o a la loratadina. Precaución en insuficiencia renal grave.",
                conQueNoCombinar = "No presenta interacciones significativas con el alcohol o alimentos, pero debe evitarse la combinación con Eritromicina o Ketoconazol sin indicación médica, ya que pueden elevar sus niveles plasmáticos.", 
                efectosSecundarios = "Fatiga, boca seca y cefalea (muy infrecuentes).",
                comoDesechar = "Contenedor Punto Azul.",
                datoExtra = "Es uno de los antihistamínicos con menor paso a través de la barrera hematoencefálica, por lo que el riesgo de somnolencia es prácticamente nulo."
            ),
            Medicamento(
                id = 29, nombre = "Loratadina 10mg", principioActivo = "Loratadina",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Loratadina 10mg.jpeg"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "Antihistamínico de segunda generación", 
                paraQueSirve = "Alivio de síntomas de la rinitis alérgica (estornudos, rinorrea) y urticaria idiopática crónica. Acción prolongada de 24 horas con una sola toma al día.",
                contraindicaciones = "Hipersensibilidad al componente. Niños menores de 2 años. Embarazo y lactancia (se excreta en leche materna).",
                conQueNoCombinar = "Inhibidores del citocromo P450 (Cimetidina, Ketoconazol, Eritromicina) pueden aumentar los niveles de loratadina en sangre.", 
                efectosSecundarios = "Poco frecuentes: somnolencia, cefalea, nerviosismo.",
                comoDesechar = "Contenedor de medicamentos vencidos.",
                datoExtra = "En pacientes con daño hepático severo, se recomienda iniciar con una dosis de 10mg cada dos días."
            ),
            Medicamento(
                id = 33, nombre = "Rupatadina 10mg", principioActivo = "Rupatadina",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Rupatadina 10mg.jpeg"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "Antihistamínico de segunda generación con actividad anti-PAF", 
                paraQueSirve = "Doble mecanismo de acción: bloquea los receptores H1 de histamina y los receptores del Factor Activador de Plaquetas (PAF). Muy eficaz en rinitis alérgica y urticaria crónica donde otros antihistamínicos fallan.",
                contraindicaciones = "Insuficiencia renal o hepática (falta de estudios). Hipersensibilidad.",
                conQueNoCombinar = "CRÍTICO: No tomar con zumo de pomelo (pomelo) ya que aumenta 3 veces su nivel en sangre. No combinar con Ketoconazol o Eritromicina.", 
                efectosSecundarios = "Somnolencia, cefalea, astenia (cansancio).",
                comoDesechar = "Punto Azul.",
                datoExtra = "Es especialmente útil en pacientes cuya alergia no responde solo al bloqueo de la histamina."
            ),
            Medicamento(
                id = 58, nombre = "Levocetirizina solución oral 5mg/5ml", principioActivo = "Levocetirizina diclorhidrato",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.SOLUCION_ORAL,
                imagenUrl = getUrl("levocetirizina diclorhidrato 5mg-5ml solucion oral 120 ml.jpeg"), especificacion = "Solución oral 120 ml",
                familiaFarmacologica = "Antihistamínico de tercera generación (Enantiómero activo de cetirizina)", 
                paraQueSirve = "Forma activa de la cetirizina con mayor afinidad por el receptor H1. Indicado para el tratamiento de síntomas asociados a condiciones alérgicas como rinitis alérgica estacional y rinitis alérgica persistente y urticaria crónica.",
                contraindicaciones = "Hipersensibilidad a la levocetirizina o derivados de la piperazina. Enfermedad renal terminal (aclaramiento de creatinina inferior a 10 ml/min).",
                conQueNoCombinar = "Alcohol y otros depresores del sistema nervioso central.", 
                efectosSecundarios = "Sequedad de boca, cefalea, somnolencia, fatiga.",
                comoDesechar = "Contenedor de medicamentos en farmacia.",
                datoExtra = "La levocetirizina tiene la ventaja de ser efectiva a la mitad de la dosis que la cetirizina racémica, reduciendo potencialmente la carga metabólica."
            )
        )
    }
}
