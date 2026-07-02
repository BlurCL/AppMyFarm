package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AntipireticosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 131, 
                nombre = "Metamizol Sódico Monohidrato 300mg (Dipirona)", 
                principioActivo = "Metamizol sódico",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Metamizol Sódico Monohidrato 300mg(dipirona).png"), 
                especificacion = "Comprimido de 300 mg",
                familiaFarmacologica = "Pirazolona (Analgésico/Antipirético)",
                paraQueSirve = "Dolor severo (postoperatorio, cólicos) y fiebre alta que no responde a otros antitérmicos. Posee efecto relajante sobre la musculatura lisa.",
                contraindicaciones = "Hipersensibilidad a pirazolonas, agranulocitosis previa, porfiria hepática, deficiencia de G6PD.\n\nEvitar en pacientes con presión arterial muy baja (riesgo de choque hipotensivo).",
                conQueNoCombinar = "Ciclosporina (baja niveles en sangre), alcohol (potencia efectos), Metotrexato (aumenta toxicidad hematológica).",
                efectosSecundarios = "Hipotensión, náuseas, reacciones alérgicas. Riesgo muy raro pero grave de agranulocitosis (disminución de glóbulos blancos).",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 132, 
                nombre = "Paracetamol 80mg", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Paracetamol 80mg.png"), 
                especificacion = "Comprimido masticable infantil",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Alivio de la fiebre y el dolor leve a moderado en lactantes y niños pequeños.",
                contraindicaciones = "Hipersensibilidad al paracetamol, insuficiencia hepática grave o hepatitis viral activa.",
                conQueNoCombinar = "Otros productos con paracetamol (riesgo de sobredosis), Rifampicina, Isoniazida, Fenitoína.",
                efectosSecundarios = "Raramente erupciones o alergias. El uso excesivo daña severamente el hígado.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 133, 
                nombre = "Paracetamol 160mg/5ml", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Paracetamol 160mg-5ml 90ml.png"), 
                especificacion = "Suspensión oral 90 ml",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Tratamiento sintomático de la fiebre y el dolor en niños. Fácil dosificación por peso.",
                contraindicaciones = "Daño hepático previo, alergia al paracetamol.",
                conQueNoCombinar = "Anticonvulsivantes inductores hepáticos, alcohol (si se administra en adolescentes).",
                efectosSecundarios = "Malestar estomacal leve, erupciones cutáneas en casos alérgicos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 134, 
                nombre = "Paracetamol 160mg", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Paracetamol 160mg.png"), 
                especificacion = "Comprimido masticable",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Dolor dental, post-vacunación y fiebre en niños.",
                contraindicaciones = "Insuficiencia hepática severa.",
                conQueNoCombinar = "No duplicar dosis con otros jarabes o antigripales que contengan paracetamol.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 135, 
                nombre = "Paracetamol 1g", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Paracetamol 1g.png"), 
                especificacion = "Comprimido de 1 g",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Dolor moderado (muscular, de espalda, dental) y fiebre en adultos. No irrita el estómago.",
                contraindicaciones = "Insuficiencia hepatocelular grave, alcoholismo crónico.",
                conQueNoCombinar = "Alcohol (alto riesgo de daño al hígado), Warfarina (en uso prolongado puede aumentar riesgo de sangrado).",
                efectosSecundarios = "Generalmente seguro. El exceso (>4g al día) puede ser mortal por daño hepático.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 136, 
                nombre = "Paracetamol Jarabe 120mg/5ml", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Paracetamol 120mg-5ml jarabe 100ml.png"), 
                especificacion = "Jarabe 100 ml",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Alivio de síntomas febriles y dolor en niños pequeños.",
                contraindicaciones = "Alergia conocida al componente.",
                conQueNoCombinar = "Metoclopramida (acelera la absorción del paracetamol).",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 137, 
                nombre = "Paracetamol Infantil Gotas 100mg/ml", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.SOLUCION_ORAL,
                imagenUrl = getUrl("Paracetamol infantil solucion oral 15ml 100mg-ml.png"), 
                especificacion = "Frasco gotario 15 ml",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Fiebre y dolor en lactantes. Dosis exacta gota a gota según peso médico.",
                contraindicaciones = "Hipersensibilidad al paracetamol.",
                conQueNoCombinar = "Otros medicamentos hepatotóxicos, Rifampicina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 138, 
                nombre = "Paracetamol 125mg Supositorio", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.OTRO,
                imagenUrl = getUrl("Paracetamol 125 mg supositorio.png"), 
                especificacion = "Supositorio infantil",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Fiebre y dolor cuando el niño tiene vómitos o no puede tragar (vía rectal).",
                contraindicaciones = "Inflamación rectal (proctitis), cirugía anorrectal reciente.",
                conQueNoCombinar = "No usar junto a otras presentaciones de paracetamol por vía oral.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 139, 
                nombre = "Paracetamol 500mg", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Paracetamol 500 mg.png"), 
                especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Dolor de cabeza, estados gripales y fiebre leve a moderada en adultos y niños mayores.",
                contraindicaciones = "Enfermedad hepática, alcoholismo.",
                conQueNoCombinar = "Consumo excesivo de alcohol, otros fármacos que afecten el hígado.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 107, nombre = "Tramadol Clorhidrato 100mg", principioActivo = "Tramadol",
                categoria = AppDestinations.ANTIPIRETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tramadol Clorhidrato 100mg.png"), especificacion = "Comprimido",
                familiaFarmacologica = "Analgésico opioide",
                paraQueSirve = "Alivio del dolor moderado a severo. Actúa sobre receptores específicos del sistema nervioso central.",
                contraindicaciones = "Intoxicación aguda con alcohol, sedantes u otros opioides. Epilepsia no controlada. Insuficiencia respiratoria grave.",
                conQueNoCombinar = "Inhibidores de la MAO, alcohol, benzodiacepinas (riesgo de sedación mortal), antidepresivos (riesgo de convulsiones).",
                efectosSecundarios = "Mareos, náuseas, somnolencia, estreñimiento, sequedad de boca. Puede causar dependencia.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 108, nombre = "Tramadol Clorhidrato-Paracetamol 17,5-325mg", principioActivo = "Tramadol, Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tramadol Clorhidrato-Paracetamol 17,5-325mg.png"), especificacion = "Comprimido",
                familiaFarmacologica = "Analgésico combinado",
                paraQueSirve = "Dolor moderado a severo. La combinación permite usar dosis menores de cada uno con mayor eficacia analgésica.",
                contraindicaciones = "Hipersensibilidad, insuficiencia hepática grave, alcoholismo.",
                conQueNoCombinar = "Alcohol, sedantes centrales, otros productos que contengan paracetamol.",
                efectosSecundarios = "Confusión, somnolencia, sudoración, náuseas.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 109, nombre = "Tramadol Clorhidrato 100mg-ml 10ml solucion gotitas oral", principioActivo = "Tramadol",
                categoria = AppDestinations.ANTIPIRETICOS, formaFarmaceutica = FormaFarmaceutica.SOLUCION_ORAL,
                imagenUrl = getUrl("Tramadol Clorhidrato 100mg-ml 10ml solucion gotitas oral.png"), especificacion = "Frasco gotario de 10 ml",
                familiaFarmacologica = "Analgésico opioide",
                paraQueSirve = "Dolor moderado a intenso. Permite ajustar la dosis gota a gota según la intensidad del dolor.",
                contraindicaciones = "Pacientes con antecedentes de convulsiones, insuficiencia respiratoria severa, embarazo.",
                conQueNoCombinar = "Alcohol, hipnóticos, tranquilizantes, otros opioides.",
                efectosSecundarios = "Dolor de cabeza, somnolencia, fatiga, estreñimiento.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 110, nombre = "Tramadol Clorhidrato 50mg", principioActivo = "Tramadol",
                categoria = AppDestinations.ANTIPIRETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tramadol Clorhidrato 50mg.png"), especificacion = "Cápsula de 50 mg",
                familiaFarmacologica = "Analgésico opioide",
                paraQueSirve = "Dolor agudo o crónico moderadamente intenso.",
                contraindicaciones = "Alergia a los opioides, asma grave, obstrucción intestinal conocida.",
                conQueNoCombinar = "Alcohol, Carbamazepina (reduce el efecto del tramadol).",
                efectosSecundarios = "Náuseas, mareos, boca seca, riesgo de adicción con uso prolongado.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
