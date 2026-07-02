package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AnticoagulantesDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 37, nombre = "Acenocumarol 4mg", principioActivo = "Acenocumarol",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esEstrechoMargen = true,
                imagenUrl = getUrl("acenocumarol 4mg.png"), especificacion = "Comprimido de 4 mg",
                familiaFarmacologica = "Anticoagulante oral antivitamina K (Cumarínico)",
                paraQueSirve = "Impide la formación de factores de coagulación dependientes de la Vitamina K (II, VII, IX y X). \n\nINDICACIONES: \n- Prevención de embolias en Fibrilación Auricular no valvular.\n- Tratamiento y prevención de Trombosis Venosa Profunda (TVP) y Embolia Pulmonar.\n- Pacientes con prótesis valvulares cardíacas mecánicas.",
                contraindicaciones = "Hipersensibilidad a cumarínicos. Diátesis hemorrágica activa. Cirugía reciente del sistema nervioso central u oftalmológica. Úlcera gastroduodenal activa. Hipertensión arterial grave no controlada. Embarazo (riesgo de malformaciones fetales y hemorragia cerebral neonatal).",
                conQueNoCombinar = "ADVERTENCIA: Posee cientos de interacciones. \n- Aumentan su efecto (riesgo de hemorragia): Amiodarona, Fluconazol, Claritromicina, Metronidazol, Omeprazol, Alcohol agudo.\n- Disminuyen su efecto (riesgo de trombos): Carbamazepina, Rifampicina, Hierba de San Juan.\n- AINEs (Aspirina, Ibuprofeno): Aumentan masivamente el riesgo de sangrado digestivo.\n- Alimentos ricos en Vitamina K: Espinacas, acelgas, brócoli, coliflor (deben consumirse de forma estable, sin cambios bruscos).",
                efectosSecundarios = "Hemorragias en cualquier órgano (epistaxis, hematuria, sangrado digestivo), necrosis cutánea (raro) y alopecia.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Llevar a Punto Azul en farmacias. Medicamento de alto riesgo; una ingesta accidental puede ser mortal.",
                datoExtra = "CRÍTICO: Requiere monitoreo constante del INR (tiempo de protrombina). El rango terapéutico suele ser entre 2.0 y 3.0. Nunca cambie la dosis por su cuenta; un cuarto de tableta de diferencia puede causar un derrame cerebral o una trombosis."
            ),
            Medicamento(
                id = 41, nombre = "Apixabán 2,5mg", principioActivo = "Apixaban",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esEstrechoMargen = true,
                imagenUrl = getUrl("apixaban 2,5mg.png"), especificacion = "Comprimido de 2,5 mg",
                familiaFarmacologica = "Anticoagulante oral directo (ACOD). Inhibidor directo del Factor Xa.",
                paraQueSirve = "Bloquea directamente el Factor Xa, clave en la cascada de la coagulación. \n\nUSOS: \n- Prevención de tromboembolismo venoso tras cirugía de reemplazo de cadera o rodilla.\n- Prevención de ictus (ACV) en pacientes con Fibrilación Auricular que tienen factores de riesgo.\n- Tratamiento de TVP y embolia pulmonar en dosis ajustadas.",
                contraindicaciones = "Sangrado activo clínicamente significativo. Enfermedad hepática asociada a coagulopatía. Lesiones orgánicas con alto riesgo de sangrado (úlceras, cánceres con riesgo de sangrado). Insuficiencia renal terminal (requiere precaución extrema).",
                conQueNoCombinar = "No combinar con otros anticoagulantes (Heparina, Warfarina). Inhibidores potentes del CYP3A4 y P-gp (Ketoconazol, Itraconazol, Ritonavir) aumentan mucho su nivel en sangre. Rifampicina y Fenitoína disminuyen su efecto.",
                efectosSecundarios = "Anemia, náuseas, hematomas, hemorragia rectal o gingival. A diferencia del acenocumarol, tiene menos riesgo de hemorragia cerebral.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul de farmacia.",
                datoExtra = "VENTAJA PROFESIONAL: No requiere controles de sangre (INR) periódicos. Sin embargo, se debe evaluar la función renal (creatinina) al menos una vez al año."
            ),
            Medicamento(
                id = 42, nombre = "Apixabán 5mg", principioActivo = "Apixaban",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esEstrechoMargen = true,
                imagenUrl = getUrl("apizaxaban 5mg.png"), especificacion = "Comprimido de 5 mg",
                familiaFarmacologica = "Anticoagulante oral directo (ACOD)",
                paraQueSirve = "Dosis estándar para la prevención de accidentes cerebrovasculares en pacientes con Fibrilación Auricular y para el tratamiento de trombosis venosas agudas.",
                contraindicaciones = "Sangrado activo, insuficiencia hepática grave con riesgo de sangrado. Embarazo y lactancia (no recomendado por falta de estudios).",
                conQueNoCombinar = "AINEs y antiagregantes plaquetarios (Clopidogrel, Aspirina) aumentan significativamente el riesgo de hemorragia sin mejorar la protección.",
                efectosSecundarios = "Sangrado de encías, orina rosada (sangre), moretones espontáneos, fatiga por anemia.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de medicamentos vencidos.",
                datoExtra = "CRITERIOS DE REDUCCIÓN: La dosis se baja a 2,5mg cada 12h si el paciente cumple 2 de 3: Edad ≥80 años, Peso ≤60 kg, o Creatinina sérica ≥1,5 mg/dL."
            ),
            Medicamento(
                id = 70, nombre = "Rivaroxabán 10mg", principioActivo = "Rivaroxaban",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esEstrechoMargen = true,
                imagenUrl = getUrl("rivaroxaban 10mg.png"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "Anticoagulante oral directo (ACOD). Inhibidor del Factor Xa.",
                paraQueSirve = "Prevención de la formación de coágulos en las venas (TEV) tras una cirugía de prótesis de cadera o rodilla. También usado en dosis bajas para protección cardiovascular en enfermedad arterial coronaria.",
                contraindicaciones = "Sangrado activo. Lesiones ulcerosas gastrointestinales actuales. Cirugía cerebral o espinal reciente. Embarazo y lactancia.",
                conQueNoCombinar = "Antifúngicos azólicos (Ketoconazol) y antivirales para VIH (Ritonavir): aumentan peligrosamente el efecto. Rifampicina, Fenobarbital y Hierba de San Juan: anulan el efecto anticoagulante.",
                efectosSecundarios = "Hemorragia gastrointestinal, mareos, dolor en extremidades y hematomas frecuentes.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Llevar a farmacia para depósito en Punto Azul.",
                datoExtra = "A diferencia de las dosis de 15mg y 20mg, la dosis de 10mg puede tomarse con o sin alimentos."
            ),
            Medicamento(
                id = 72, nombre = "Rivaroxabán 20mg", principioActivo = "Rivaroxaban",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esEstrechoMargen = true,
                imagenUrl = getUrl("rivaroxaban 20mg.png"), especificacion = "Comprimido de 20 mg",
                familiaFarmacologica = "Anticoagulante oral directo (ACOD)",
                paraQueSirve = "Tratamiento de la Trombosis Venosa Profunda (TVP) y la Embolia Pulmonar (EP). Prevención de la recurrencia de estas condiciones. Prevención de ictus en pacientes con Fibrilación Auricular.",
                contraindicaciones = "Insuficiencia renal moderada-grave (ajuste de dosis necesario). Sangrado activo. Hepatopatía con riesgo de sangrado.",
                conQueNoCombinar = "Aspirina y otros AINEs. El zumo de pomelo (pomelo) puede aumentar ligeramente los niveles de rivaroxabán, se recomienda evitarlo en grandes cantidades.",
                efectosSecundarios = "Sangrado abundante tras cortes pequeños, sangrado nasal prolongado, orina oscura, debilidad muscular.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de residuos farmacéuticos.",
                datoExtra = "VITAL: Los comprimidos de 15mg y 20mg DEBEN TOMARSE SIEMPRE CON COMIDA para asegurar que el cuerpo absorba el medicamento. Tomarlo en ayunas reduce su eficacia un 40%."
            ),
            Medicamento(
                id = 71, nombre = "Rivaroxabán 2,5mg", principioActivo = "Rivaroxaban",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esEstrechoMargen = true,
                imagenUrl = getUrl("rivaroxaban 2,5mg.png"), especificacion = "Comprimido de 2,5 mg",
                familiaFarmacologica = "Anticoagulante oral directo (ACOD)",
                paraQueSirve = "Usado principalmente en combinación con aspirina para la prevención de eventos aterotrombóticos en pacientes adultos con Enfermedad Arterial Coronaria (EAC) o Enfermedad Arterial Periférica (EAP) con alto riesgo.",
                contraindicaciones = "Hipersensibilidad, sangrado activo o riesgo elevado de hemorragia.",
                conQueNoCombinar = "Otros anticoagulantes. Cuidado con el uso crónico de corticoides.",
                efectosSecundarios = "Aumento del riesgo de sangrado menor.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul.",
                datoExtra = "Esta dosis baja se administra normalmente dos veces al día (cada 12 horas)."
            ),
            Medicamento(
                id = 73, nombre = "Rivaroxabán 15mg", principioActivo = "Rivaroxaban",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esEstrechoMargen = true,
                imagenUrl = getUrl("rivarozaban 15mg.png"), especificacion = "Comprimido de 15 mg",
                familiaFarmacologica = "Anticoagulante oral directo (ACOD)",
                paraQueSirve = "Tratamiento inicial de TVP o EP (generalmente tras los primeros 21 días de tratamiento con dosis superiores) y prevención a largo plazo. También usado en pacientes con insuficiencia renal que requieren anticoagulación por arritmias.",
                contraindicaciones = "Mismas que dosis de 20mg.",
                conQueNoCombinar = "Medicamentos que afectan la coagulación.",
                efectosSecundarios = "Hematomas, sangrado de encías, hemorragia vaginal fuera de ciclo.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Llevar a farmacia.",
                datoExtra = "RECUERDE: Tomar obligatoriamente con una comida principal (desayuno, almuerzo o cena) para su correcta absorción."
            )
        )
    }
}
