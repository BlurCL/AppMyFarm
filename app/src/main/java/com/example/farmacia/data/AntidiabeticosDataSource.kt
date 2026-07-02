package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AntidiabeticosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 19, nombre = "Empagliflozina 10mg", principioActivo = "Empagliflozina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("EMPAGLIFLOZINA 10MG.jpeg"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "Inhibidor selectivo de SGLT2 (Gliflozina)", 
                paraQueSirve = "Reduce la reabsorción de glucosa en el riñón, eliminándola a través de la orina. \n\nINDICACIONES: \n- Diabetes Mellitus Tipo 2 (DM2) para control glucémico.\n- Reducción del riesgo de muerte cardiovascular y hospitalización en insuficiencia cardíaca (independientemente de si hay diabetes o no).\n- Protección renal en pacientes con enfermedad renal crónica.",
                contraindicaciones = "Hipersensibilidad al componente. Pacientes en diálisis o con insuficiencia renal terminal (aunque protege el riñón en etapas tempranas, pierde eficacia para bajar la glucosa en etapas muy avanzadas). Cetoacidosis diabética.",
                conQueNoCombinar = "Diuréticos (aumenta riesgo de deshidratación e hipotensión). Insulina y sulfonilureas (requiere ajuste de dosis para evitar hipoglucemia extrema).", 
                efectosSecundarios = "Infecciones genitales fúngicas (candidiasis), infecciones urinarias, aumento de la micción (poliuria), sed y riesgo raro de cetoacidosis euglucémica.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de Punto Azul en farmacia.",
                datoExtra = "CONSEJO: Mantener una higiene genital rigurosa para prevenir infecciones por hongos debido al azúcar eliminado en la orina. Asegurar una buena hidratación durante el día."
            ),
            Medicamento(
                id = 20, nombre = "Empagliflozina 25mg", principioActivo = "Empagliflozina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("EMPAGLIFLOZINA 25MG.png"), especificacion = "Comprimido de 25 mg",
                familiaFarmacologica = "Inhibidor de SGLT2", 
                paraQueSirve = "Dosis superior para el manejo intensivo de la glucosa en pacientes con DM2 y alto riesgo cardiovascular. Proporciona una potente glucosuria (eliminación de azúcar) que también ayuda a reducir la presión arterial y el peso corporal.",
                contraindicaciones = "Mismas que dosis de 10mg. No se recomienda iniciar si el aclaramiento de creatinina es persistentemente < 30 ml/min para fines de control glucémico.",
                conQueNoCombinar = "Uso concomitante con diuréticos de asa (como Furosemida) requiere precaución por riesgo de hipovolemia (presión baja por pérdida de líquidos).", 
                efectosSecundarios = "Deshidratación en adultos mayores, micosis vaginal o balanitis, estreñimiento.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Llevar a farmacia.",
                datoExtra = "ADVERTENCIA: Si presenta náuseas, dolor abdominal o dificultad respiratoria, suspenda el fármaco y consulte al médico (podría ser cetoacidosis)."
            ),
            Medicamento(
                id = 25, nombre = "Glibenclamida 5mg", principioActivo = "Glibenclamida",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Glibenclamida 5mg.jpeg"), especificacion = "Comprimido de 5 mg",
                familiaFarmacologica = "Sulfonilurea de segunda generación (Secretagogo)", 
                paraQueSirve = "Estimula la secreción de insulina por las células beta del páncreas. Indicado en Diabetes Tipo 2 cuando el manejo con dieta, ejercicio y otros fármacos (como metformina) no es suficiente.",
                contraindicaciones = "Diabetes Tipo 1 (el páncreas ya no produce insulina). Cetoacidosis diabética. Insuficiencia renal o hepática grave. Embarazo y lactancia.",
                conQueNoCombinar = "CRÍTICO: No beber alcohol (efecto Antabus y riesgo de hipoglucemia severa). Miconazol (aumenta efecto hipoglucemiante). Betabloqueantes (pueden enmascarar los síntomas de una baja de azúcar).", 
                efectosSecundarios = "HIPOGLUCEMIA (baja de azúcar) que puede ser grave y prolongada. Aumento de peso, náuseas y reacciones alérgicas cutáneas.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul.",
                datoExtra = "VITAL: Debe tomarse 30 minutos antes del desayuno o de la comida principal. Nunca se salte una comida tras tomar glibenclamida por el riesgo de desmayo por baja de azúcar."
            ),
            Medicamento(
                id = 27, nombre = "Linagliptina 5mg", principioActivo = "Linagliptina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Linagliptina 5mg.jpeg"), especificacion = "Comprimido de 5 mg",
                familiaFarmacologica = "Inhibidor de la enzima DPP-4 (Gliptina)", 
                paraQueSirve = "Aumenta los niveles de hormonas incretinas, estimulando la liberación de insulina de forma dependiente de la glucosa (solo cuando el azúcar sube). No causa hipoglucemia por sí sola. Indicado en DM2.",
                contraindicaciones = "Hipersensibilidad al componente. Antecedente de pancreatitis aguda asociada a inhibidores DPP-4.",
                conQueNoCombinar = "Rifampicina (disminuye la eficacia de la linagliptina).", 
                efectosSecundarios = "Tos, rinofaringitis, y raramente pancreatitis aguda o dolor articular severo.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor autorizado.",
                datoExtra = "VENTAJA CLÍNICA: Es el único fármaco de su familia que NO requiere ajuste de dosis en pacientes con insuficiencia renal o hepática, siendo muy seguro para el riñón."
            ),
            Medicamento(
                id = 28, nombre = "Linagliptina-Metformina 2,5/850mg", principioActivo = "Linagliptina, Metformina clorhidrato",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Linagliptina-clorhidrato de metformina 2,5-850mg.jpeg"), especificacion = "Comprimido",
                familiaFarmacologica = "Combinación de Inhibidor DPP-4 y Biguanida", 
                paraQueSirve = "Tratamiento de doble acción: la Metformina reduce la producción de glucosa en el hígado, y la Linagliptina optimiza la secreción de insulina pancreática. Indicado para pacientes que no logran metas con dosis máximas de metformina sola.",
                contraindicaciones = "Insuficiencia renal moderada-grave (TFG < 30 ml/min). Acidosis metabólica aguda. Deshidratación severa. Alcoholismo crónico.",
                conQueNoCombinar = "Alcohol (riesgo de acidosis láctica). Medios de contraste yodados (suspender 48h antes de radiografías con contraste). Glucocorticoides.", 
                efectosSecundarios = "Malestar estomacal, diarrea, sabor metálico (por metformina) y riesgo de pancreatitis (por linagliptina).",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul.",
                datoExtra = "Debe tomarse con los alimentos para reducir las molestias digestivas propias de la metformina."
            ),
            Medicamento(
                id = 31, nombre = "Metformina clorhidrato 850mg", principioActivo = "Metformina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("METFORMINA clorhidrato 850mg.jpeg"), especificacion = "Comprimido de 850 mg",
                familiaFarmacologica = "Biguanida (Antihiperglucemiante oral)", 
                paraQueSirve = "Fármaco de primera elección en DM2. Mejora la sensibilidad a la insulina, disminuye la absorción intestinal de glucosa y reduce su producción en el hígado. Ayuda a controlar el peso corporal.",
                contraindicaciones = "Falla renal significativa (Creatinina alta o TFG < 30 ml/min). Falla cardíaca o respiratoria inestable. Infecciones graves. Riesgo de acidosis láctica.",
                conQueNoCombinar = "Consumo excesivo de alcohol. Medios de contraste para TAC/Scanner (alto riesgo de falla renal). Otros fármacos nefrotóxicos.", 
                efectosSecundarios = "Náuseas, diarrea, gases y dolor abdominal (especialmente al inicio). Déficit de Vitamina B12 en uso prolongado. Sabor metálico en la boca.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Llevar excedentes a farmacia.",
                datoExtra = "TIP PROFESIONAL: Si los síntomas digestivos son molestos, inicie con dosis bajas y auméntelas gradualmente cada semana, siempre junto con las comidas principales."
            ),
            Medicamento(
                id = 32, nombre = "Metformina clorhidrato 1000mg", principioActivo = "Metformina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Metformina Clorhidrato 1000mg.png"), especificacion = "Comprimido de 1000 mg",
                familiaFarmacologica = "Biguanida", 
                paraQueSirve = "Dosis de mantenimiento habitual para el control intensivo de la glucemia en adultos con DM2. Reduce significativamente las complicaciones a largo plazo de la diabetes.",
                contraindicaciones = "Mismas que dosis de 850mg. Pacientes con cirrosis hepática descompensada.",
                conQueNoCombinar = "Cimetidina y Dolutegravir (pueden aumentar los niveles de metformina).", 
                efectosSecundarios = "Diarrea persistente en algunos pacientes. Acidosis láctica (complicación rara pero mortal caracterizada por debilidad extrema y vómitos).",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor Punto Azul.",
                datoExtra = "No causa hipoglucemia (bajones de azúcar) cuando se usa sola, lo que la hace muy segura."
            ),
            Medicamento(
                id = 52, nombre = "Empagliflozina-Metformina 12,5/1000mg", principioActivo = "Empagliflozina, Metformina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Metformina Clorhidrato 1000mg.png"), especificacion = "Comprimido recubierto",
                familiaFarmacologica = "Combinación de Inhibidor SGLT2 y Biguanida", 
                paraQueSirve = "Potente combinación que ataca la diabetes por dos frentes: el hígado y el riñón. Mejora el control glucémico y ofrece protección probada al corazón y riñones en pacientes de alto riesgo.",
                contraindicaciones = "Insuficiencia renal (TFG < 45 ml/min requiere vigilancia; < 30 ml/min contraindicado). Acidosis láctica previa.",
                conQueNoCombinar = "Alcohol, diuréticos potentes, y medios de contraste.", 
                efectosSecundarios = "Diarrea, infecciones urinarias, riesgo de deshidratación y posible micosis genital.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul.",
                datoExtra = "RECUERDE: Tomar con las comidas para proteger el estómago."
            ),
            Medicamento(
                id = 53, nombre = "Empagliflozina-Metformina 12,5/850mg", principioActivo = "Empagliflozina, Metformina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("empagliflozina 12,5-850mg.jpeg"), especificacion = "Comprimido",
                familiaFarmacologica = "Combinación de Inhibidor SGLT2 y Biguanida", 
                paraQueSirve = "Indicado en el manejo de DM2. Combina los beneficios de pérdida de peso y protección cardiovascular de la empagliflozina con el estándar de oro que es la metformina.",
                contraindicaciones = "Las propias de ambos componentes. Especialmente prohibido en estados de hipoxia (insuficiencia cardíaca aguda o respiratoria grave).",
                conQueNoCombinar = "Sustancias que afecten el riñón.", 
                efectosSecundarios = "Trastornos gastrointestinales y aumento de infecciones micóticas en zona genital.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de farmacia.",
                datoExtra = "Es fundamental informar al médico si va a ser sometido a una cirugía; el fármaco debe suspenderse al menos 48 horas antes."
            ),
            Medicamento(
                id = 64, nombre = "Metformina clorhidrato 500mg", principioActivo = "Metformina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("metformina clorhidrato 500mg.png"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Biguanida", 
                paraQueSirve = "Dosis inicial recomendada para el tratamiento de la DM2 y para el Síndrome de Ovario Poliquístico (uso fuera de indicación oficial común). Ayuda a normalizar la resistencia a la insulina.",
                contraindicaciones = "Mismas que dosis superiores.",
                conQueNoCombinar = "Alcohol.", 
                efectosSecundarios = "Molestias estomacales leves.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul.",
                datoExtra = "Es el fármaco más estudiado y seguro para iniciar el tratamiento de la diabetes."
            ),
            Medicamento(
                id = 65, nombre = "Metformina clorhidrato 750mg XR", principioActivo = "Metformina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("metformina clorhidrato 750mg.png"), especificacion = "Comprimido liberación prolongada",
                familiaFarmacologica = "Biguanida", 
                paraQueSirve = "Versión de liberación extendida (XR/LP). Se libera lentamente en el intestino, lo que reduce drásticamente los efectos secundarios como diarrea y gases en comparación con la metformina normal.",
                contraindicaciones = "Falla renal severa.",
                conQueNoCombinar = "Alcohol.", 
                efectosSecundarios = "Mucho menores que la versión estándar; ocasionalmente náuseas leves.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de medicamentos.",
                datoExtra = "IMPORTANTE: El comprimido debe tragarse entero, NO se debe partir, triturar ni masticar, ya que se dañaría el sistema de liberación prolongada."
            )
        )
    }
}
