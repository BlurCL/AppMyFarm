package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object CorticoidesDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 16, nombre = "Dexametasona 4mg", principioActivo = "Dexametasona",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Cortyk dexametasona 4mg.jpeg"), especificacion = "Comprimido de 4 mg",
                familiaFarmacologica = "Glucocorticoide sintético de acción prolongada y alta potencia", 
                paraQueSirve = "Potente antiinflamatorio e inmunosupresor. Indicado en: \n- Manejo de edema cerebral.\n- Alivio de náuseas y vómitos inducidos por quimioterapia.\n- Tratamiento de enfermedades autoinmunes severas.\n- Coadyuvante en cuadros inflamatorios agudos del sistema respiratorio y articular.",
                contraindicaciones = "Infecciones sistémicas fúngicas (hongos) no tratadas. Tuberculosis activa. Hipersensibilidad. Prohibido administrar vacunas de virus vivos atenuados durante el tratamiento.",
                conQueNoCombinar = "AINEs (como Ibuprofeno o Aspirina): Aumenta drásticamente el riesgo de úlceras y sangrado gástrico. Antidiabéticos: La dexametasona eleva el azúcar en sangre, anulando el efecto del tratamiento. Diuréticos: Riesgo de pérdida peligrosa de potasio (hipopotasemia).", 
                efectosSecundarios = "Aumento del apetito, insomnio, irritabilidad, aumento de la presión arterial y retención de líquidos (edema). En uso prolongado: Síndrome de Cushing, osteoporosis y cataratas.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul en farmacias.",
                datoExtra = "Es uno de los corticoides más potentes. 0,75mg de dexametasona equivalen a 5mg de prednisona."
            ),
            Medicamento(
                id = 47, nombre = "Betametasona inyectable 4mg/1ml", principioActivo = "Betametasona sodio fosfato",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.INYECTABLE,
                imagenUrl = getUrl("betametasona sodio fosfato 4mg-1ml solucion inyectable.jpeg"), especificacion = "Solución inyectable",
                familiaFarmacologica = "Corticosteroide sistémico de alta potencia y acción rápida", 
                paraQueSirve = "Utilizado para respuestas inmediatas en: \n- Reacciones alérgicas severas (shock anafiláctico).\n- Crisis asmáticas agudas.\n- Status epiléptico (ciertos casos).\n- Maduración pulmonar fetal en riesgo de parto prematuro.\n- Inyección intraarticular para inflamación severa local.",
                contraindicaciones = "Hipersensibilidad. Infecciones virales activas (como herpes o varicela) sin tratamiento. Infecciones micóticas sistémicas.",
                conQueNoCombinar = "Anticoagulantes orales (puede alterar el efecto). Vacunas vivas. Inhibidores del citocromo CYP3A4.", 
                efectosSecundarios = "Sensación de calor o rubor tras la inyección, mareos, palpitaciones y aumento transitorio de la glucosa.",
                tipoReceta = "Se necesita receta médica (Uso clínico)",
                comoDesechar = "Contenedor de material cortopunzante (residuo clínico).",
                datoExtra = "La presentación de 'fosfato' es de acción rápida e inicio inmediato, ideal para urgencias."
            ),
            Medicamento(
                id = 56, nombre = "Hidrocortisona 20mg", principioActivo = "Hidrocortisona",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("hidrocortisona 20mg.jpeg"), especificacion = "Comprimido de 20 mg",
                familiaFarmacologica = "Glucocorticoide de acción corta (Bioidéntico al cortisol)", 
                paraQueSirve = "Terapia de reemplazo hormonal en pacientes cuya glándula suprarrenal no produce suficiente cortisol (Enfermedad de Addison). También usado en el manejo de tiroiditis y afecciones alérgicas agudas.",
                contraindicaciones = "Hipersensibilidad. Infecciones sistémicas graves no tratadas.",
                conQueNoCombinar = "Rifampicina y Fenitoína (reducen la eficacia de la hidrocortisona). Diuréticos ahorradores de potasio.", 
                efectosSecundarios = "A dosis de reemplazo son mínimos. A dosis altas: gastritis, hipertensión y debilidad muscular.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de medicamentos vencidos.",
                datoExtra = "Es el corticoide que más se parece a la hormona natural producida por el cuerpo humano."
            ),
            Medicamento(
                id = 62, nombre = "Metilprednisolona 16mg", principioActivo = "Metilprednisolona",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("medrol metilprednisolona 16mg.jpeg"), especificacion = "Comprimido de 16 mg",
                familiaFarmacologica = "Glucocorticoide sintético de acción intermedia", 
                paraQueSirve = "Efecto antiinflamatorio potente con menor retención de sal que la prednisona. Indicado en: \n- Brotes de Esclerosis Múltiple.\n- Lupus Eritematoso Sistémico.\n- Artritis Reumatoide activa.\n- Sarcoidosis y rechazo de trasplantes.",
                contraindicaciones = "Micosis sistémicas. Hipersensibilidad. Pacientes con úlceras pépticas activas.",
                conQueNoCombinar = "Zumo de pomelo (aumenta niveles de metilprednisolona). Digoxina (riesgo de toxicidad por baja de potasio). Inhibidores de la proteasa (VIH).", 
                efectosSecundarios = "Trastornos del estado de ánimo (euforia o depresión), debilidad de los huesos, estrías cutáneas y mala cicatrización de heridas.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Llevar a Punto Azul en farmacia.",
                datoExtra = "Se recomienda tomar la dosis diaria completa en una sola toma por la mañana para imitar el ritmo natural del cuerpo."
            ),
            Medicamento(
                id = 67, nombre = "Prednisona 20mg", principioActivo = "Prednisona",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("prednisona 20mg.jpeg"), especificacion = "Comprimido de 20 mg",
                familiaFarmacologica = "Glucocorticoide sintético (Profármaco de la prednisolona)", 
                paraQueSirve = "Ampliamente utilizado por su potente acción antiinflamatoria en: \n- Crisis asmáticas y EPOC.\n- Enfermedades reumáticas.\n- Alergias severas y rinitis estacional refractaria.\n- Enfermedad inflamatoria intestinal (Crohn o Colitis Ulcerosa).",
                contraindicaciones = "Osteoporosis grave. Psicosis no controlada. Infecciones virales activas (Varicela/Herpes). Vacunación con virus vivos.",
                conQueNoCombinar = "AINEs: Riesgo extremo de hemorragia gástrica. Alcohol: Aumenta la irritación del estómago. Antidiabéticos orales e Insulina.", 
                efectosSecundarios = "Aumento de peso ('cara de luna llena'), acné, fragilidad capilar, aumento del vello corporal y elevación de la presión ocular (Glaucoma).",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de Punto Azul.",
                datoExtra = "IMPORTANTE: Nunca suspenda este medicamento de forma brusca tras un tratamiento largo (más de 10 días). Debe hacerse una retirada gradual para que la glándula suprarrenal vuelva a trabajar."
            ),
            Medicamento(
                id = 69, nombre = "Prednisona suspensión 20mg/5ml", principioActivo = "Prednisona",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("prednisona suspencion oral 20mg-5ml de 60ml.jpeg"), especificacion = "Suspensión oral de 60ml",
                familiaFarmacologica = "Glucocorticoide sintético", 
                paraQueSirve = "Indicado en pediatría para procesos inflamatorios obstructivos agudos: \n- Laringitis (Crupon).\n- Crisis asmática infantil.\n- Síndrome nefrótico.\n- Reacciones alérgicas agudas (urticaria severa).",
                contraindicaciones = "Infecciones sistémicas por virus o bacterias sin tratamiento previo adecuado.",
                conQueNoCombinar = "Vacunas de virus vivos (como la del Sarampión o Varicela) deben evitarse durante el tratamiento y hasta semanas después.", 
                efectosSecundarios = "Irritabilidad, aumento temporal de la actividad del niño, malestar gástrico y aumento de glucosa en niños diabéticos.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Desechar el sobrante tras el periodo indicado por el pediatra.",
                datoExtra = "CONSEJO: Dar junto con la comida o leche para evitar el sabor amargo persistente y proteger el estómago del niño."
            )
        )
    }
}
