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
                familiaFarmacologica = "Antihistamínico de segunda generación", 
                paraQueSirve = "Alivio de síntomas nasales y oculares de la rinitis alérgica estacional y perenne, y para la urticaria crónica.",
                contraindicaciones = "Hipersensibilidad, enfermedad renal grave (aclaramiento de creatinina inferior a 10 ml/min).",
                conQueNoCombinar = "Alcohol, depresores del sistema nervioso central.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 11, nombre = "Cetirizina 10mg", principioActivo = "Cetirizina diclorhidrato",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Cetirizina diclorhidrato 10mg.jpeg"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "Antihistamínico de segunda generación", 
                paraQueSirve = "Tratamiento de los síntomas de la rinitis alérgica y la urticaria idiopática crónica.",
                contraindicaciones = "Pacientes con insuficiencia renal grave, hipersensibilidad al principio activo o a la hidroxizina.",
                conQueNoCombinar = "Alcohol, sedantes, tranquilizantes.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 13, nombre = "Clorfenamina maleato jarabe 2,5mg/5ml", principioActivo = "Clorfenamina maleato",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Clorfenamina maleato 2,5mg-5ml 100ml jarabe.jpeg"), especificacion = "Suspensión oral",
                familiaFarmacologica = "Antihistamínico de primera generación", 
                paraQueSirve = "Alivio de síntomas de procesos alérgicos como rinitis, conjuntivitis y picaduras de insectos.",
                contraindicaciones = "Hipersensibilidad, niños menores de 2 años, pacientes con glaucoma o hipertrofia prostática.",
                conQueNoCombinar = "Alcohol, sedantes, inhibidores de la MAO, antidepresivos tricíclicos.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 14, nombre = "Clorfenamina maleato 4mg", principioActivo = "Clorfenamina maleato",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Clorfenamina maleato 4mg.jpeg"), especificacion = "Comprimido de 4 mg",
                familiaFarmacologica = "Antihistamínico de primera generación", 
                paraQueSirve = "Alivio sintomático de alergias, rinitis alérgica, urticaria y fiebre del heno.",
                contraindicaciones = "Pacientes con riesgo de retención urinaria, obstrucción piloroduodenal o hipersensibilidad.",
                conQueNoCombinar = "Alcohol, fármacos depresores del sistema nervioso central.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 17, nombre = "Desloratadina 5mg", principioActivo = "Desloratadina",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Desloratadina 5 mg.jpeg"), especificacion = "Comprimido de 5 mg",
                familiaFarmacologica = "Antihistamínico de tercera generación", 
                paraQueSirve = "Alivio de los síntomas asociados con la rinitis alérgica y la urticaria.",
                contraindicaciones = "Hipersensibilidad a la desloratadina o a la loratadina.",
                conQueNoCombinar = "Inhibidores de CYP3A4 o P-glucoproteína (eritromicina, ketoconazol) sin supervisión médica.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 29, nombre = "Loratadina 10mg", principioActivo = "Loratadina",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Loratadina 10mg.jpeg"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "Antihistamínico de segunda generación", 
                paraQueSirve = "Alivio de síntomas de rinitis alérgica y de urticaria idiopática crónica.",
                contraindicaciones = "Hipersensibilidad al principio activo, niños menores de 2 años, embarazo y lactancia.",
                conQueNoCombinar = "Cimetidina, ketoconazol, eritromicina, alcohol.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 30, nombre = "Loratadina jarabe 5mg/5ml", principioActivo = "Loratadina",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Loratadina 5mg-5ml 100ml jarabe.jpeg"), especificacion = "Suspención oral",
                familiaFarmacologica = "Antihistamínico de segunda generación", 
                paraQueSirve = "Tratamiento sintomático de rinitis alérgica y urticaria en niños y adultos.",
                contraindicaciones = "Hipersensibilidad, insuficiencia hepática grave (ajustar dosis).",
                conQueNoCombinar = "Ketoconazol, eritromicina, cimetidina.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 33, nombre = "Rupatadina 10mg", principioActivo = "Rupatadina",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Rupatadina 10mg.jpeg"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "Antihistamínico", 
                paraQueSirve = "Tratamiento sintomático de la rinitis alérgica y la urticaria en adultos y adolescentes.",
                contraindicaciones = "Hipersensibilidad, pacientes con insuficiencia renal o hepática.",
                conQueNoCombinar = "Zumo de pomelo, inhibidores potentes de CYP3A4 (como ketoconazol o eritromicina).", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 34, nombre = "Rupatadina solución oral 1mg/ml", principioActivo = "Rupatadina",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.SOLUCION_ORAL,
                imagenUrl = getUrl("Rupatidina Solucion oral 1mg-ml 120ml.jpeg"), especificacion = "Frasco 120ml",
                familiaFarmacologica = "Antihistamínico", 
                paraQueSirve = "Tratamiento de la rinitis alérgica y urticaria en pacientes pediátricos (2 a 11 años).",
                contraindicaciones = "Hipersensibilidad, intolerancia a la fructosa (si contiene sorbitol).",
                conQueNoCombinar = "Inhibidores de CYP3A4, zumo de pomelo.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 58, nombre = "Levocetirizina solución oral 5mg/5ml", principioActivo = "Levocetirizina diclorhidrato",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.SOLUCION_ORAL,
                imagenUrl = getUrl("levocetirizina diclorhidrato 5mg-5ml solucion oral 120 ml.jpeg"), especificacion = "Solución oral 120 ml",
                familiaFarmacologica = "Antihistamínico de tercera generación", 
                paraQueSirve = "Alivio de síntomas nasales y oculares de la rinitis alérgica y para la urticaria.",
                contraindicaciones = "Hipersensibilidad, insuficiencia renal grave, lactancia.",
                conQueNoCombinar = "Alcohol, sedantes, tranquilizantes.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 59, nombre = "Levocetirizina gotas 5mg/ml", principioActivo = "Levocetirizina diclorhidrato",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.SOLUCION_ORAL,
                imagenUrl = getUrl("levocetirizina diclorhidrato solucion oral 5mg-ml.jpeg"), especificacion = "Solución oral (Gotas)",
                familiaFarmacologica = "Antihistamínico de tercera generación", 
                paraQueSirve = "Tratamiento de síntomas alérgicos en adultos y niños a partir de 2 años.",
                contraindicaciones = "Hipersensibilidad a levocetirizina o derivados de la piperazina, insuficiencia renal terminal.",
                conQueNoCombinar = "Alcohol, teofilina (en dosis altas).", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 60, nombre = "Levorigotax 5mg", principioActivo = "Levocetirizina diclorhidrato",
                categoria = AppDestinations.ANTIALERGICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("levorigotax levocetirizina diclorhidrato 5mg.jpeg"), especificacion = "Comprimido de 5 mg",
                familiaFarmacologica = "Antihistamínico de tercera generación", 
                paraQueSirve = "Control de síntomas de procesos alérgicos respiratorios y cutáneos.",
                contraindicaciones = "Hipersensibilidad, insuficiencia renal grave.",
                conQueNoCombinar = "Alcohol, depresores del sistema nervioso central.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
