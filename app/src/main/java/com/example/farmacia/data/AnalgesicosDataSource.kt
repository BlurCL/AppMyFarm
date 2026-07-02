package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AnalgesicosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 111, nombre = "Ácido Acetilsalicílico 100mg", principioActivo = "Ácido Acetilsalicílico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Ácido Acetilsalicílico 100mg.png"), especificacion = "Comprimido de 100 mg",
                familiaFarmacologica = "AINE / Antiagregante plaquetario (Salicilato)",
                paraQueSirve = "Inhibe de forma irreversible la enzima ciclooxigenasa (principalmente COX-1 en las plaquetas). A dosis de 100 mg actúa como antiagregante plaquetario, disminuyendo la formación de trombos. Se utiliza principalmente para la prevención secundaria de eventos cardiovasculares, como el infarto agudo de miocardio y el accidente cerebrovascular isquémico, y en algunos casos seleccionados de prevención primaria bajo indicación médica.",
                contraindicaciones = "Úlcera péptica activa, gastritis erosiva, diátesis hemorrágica (facilidad de sangrado) e hipersensibilidad a salicilatos.\n\nADVERTENCIA CRÍTICA: Contraindicado en niños y adolescentes con enfermedades febriles virales (gripe, varicela) por riesgo de Síndrome de Reye, una complicación potencialmente mortal con daño cerebral y hepático agudo.",
                conQueNoCombinar = "Anticoagulantes orales (Warfarina): Aumenta drásticamente el riesgo de hemorragia. Otros AINEs (Ibuprofeno): Pueden interferir con el efecto cardioprotector. Corticoides y alcohol: Elevan el riesgo de daño gástrico severo.",
                efectosSecundarios = "Dispepsia, irritación gástrica, formación de úlceras, aumento del tiempo de sangrado y reacciones de hipersensibilidad (especialmente en pacientes con asma o pólipos nasales).",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia (Punto Azul).",
                datoExtra = "Tomar preferentemente con las comidas o un vaso de leche para reducir la irritación directa sobre la mucosa del estómago."
            ),
            Medicamento(
                id = 112, nombre = "Etoricoxib 90mg", principioActivo = "Etoricoxib",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Etoricoxib 90mg.png"), especificacion = "Comprimido recubierto",
                familiaFarmacologica = "AINE inhibidor selectivo de la COX-2",
                paraQueSirve = "Inhibidor altamente selectivo de la COX-2, lo que reduce la producción de prostaglandinas inflamatorias con menor impacto en la protección gástrica que los AINEs clásicos.\n\nINDICACIONES: Alivio sintomático de la artrosis, artritis reumatoide y espondilitis anquilosante.",
                contraindicaciones = "Insuficiencia cardíaca congestiva (NYHA II-IV), cardiopatía isquémica, enfermedad arterial periférica o enfermedad cerebrovascular. Hipertensión arterial no controlada (>140/90 mmHg). Falla renal o hepática severa.",
                conQueNoCombinar = "Anticoagulantes (aumenta riesgo de sangrado), Litio (eleva niveles tóxicos de litio), Rifampicina (reduce efecto del etoricoxib) y diuréticos (reduce su efecto y aumenta riesgo renal).",
                efectosSecundarios = "Edema (hinchazón) periférico, aumento de la presión arterial, mareos, dolor de cabeza y rara vez eventos trombóticos cardiovasculares en uso prolongado.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul farmacéutico.",
                datoExtra = "Es fundamental monitorizar la presión arterial durante las primeras dos semanas de tratamiento debido al riesgo de hipertensión."
            ),
            Medicamento(
                id = 113, nombre = "Etoricoxib 120mg", principioActivo = "Etoricoxib",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Etoricoxib 120mg.png"), especificacion = "Comprimido recubierto",
                familiaFarmacologica = "AINE inhibidor selectivo de la COX-2",
                paraQueSirve = "Dosis de choque para el manejo de cuadros agudos de gran intensidad.\n\nINDICACIONES: Tratamiento a corto plazo de la artritis gotosa aguda (ataque de gota) y dolor agudo postoperatorio tras cirugía dental.",
                contraindicaciones = "Mismas que el etoricoxib 90mg: Especialmente contraindicado en pacientes con problemas cardíacos o circulatorios previos.",
                conQueNoCombinar = "No usar junto a otros AINEs ni dosis adicionales de analgésicos potentes sin supervisión médica.",
                efectosSecundarios = "Palpitaciones, aumento brusco de presión arterial y trastornos digestivos leves. \n\nLÍMITE DE USO: No exceder los 8 días de tratamiento continuo con esta dosis.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de medicamentos vencidos.",
                datoExtra = "Dosis máxima recomendada solo para situaciones de urgencia inflamatoria."
            ),
            Medicamento(
                id = 115, nombre = "Celecoxib 200mg", principioActivo = "Celecoxib",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Celecoxib 200mg.png"), especificacion = "Cápsula de 200 mg",
                familiaFarmacologica = "AINE inhibidor selectivo de la COX-2",
                paraQueSirve = "Reduce la inflamación y el dolor al bloquear específicamente la enzima COX-2. Indicado en artrosis, artritis reumatoide, dismenorrea primaria (dolor menstrual) y dolor agudo postquirúrgico.",
                contraindicaciones = "Hipersensibilidad a sulfonamidas (alergia a las sulfas), insuficiencia cardíaca, enfermedad isquémica del corazón activa, úlcera gástrica y tercer trimestre de embarazo.",
                conQueNoCombinar = "Fluconazol (eleva niveles de celecoxib), Litio, Warfarina y medicamentos para la presión arterial como enalapril.",
                efectosSecundarios = "Dolor abdominal, dispepsia, insomnio, erupción cutánea y riesgo de eventos cardiovasculares adversos.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Llevar a la farmacia para disposición final.",
                datoExtra = "Es una opción preferida en pacientes con alto riesgo de sangrado digestivo que requieren tratamiento antiinflamatorio prolongado."
            ),
            Medicamento(
                id = 116, nombre = "Ketorolaco trometamol 30mg/1ml inyectable", principioActivo = "Ketorolaco trometamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.INYECTABLE,
                esAINE = true,
                imagenUrl = getUrl("Ketorolaco trometamol 30ml-1ml inyectable.png"), especificacion = "Ampolla de 1 ml",
                familiaFarmacologica = "AINE de potencia analgésica elevada",
                paraQueSirve = "Tratamiento a corto plazo del dolor moderadamente intenso a severo en el periodo postoperatorio inmediato. Su potencia analgésica es comparable a dosis bajas de opioides pero sin los efectos depresores centrales.",
                contraindicaciones = "Úlcera péptica activa, antecedentes de hemorragia gastrointestinal, falla renal moderada a grave, pacientes con asma o pólipos nasales. Contraindicado en el pre-operatorio inmediato por riesgo de hemorragia.\n\nADVERTENCIA: No utilizar por más de 2 días por vía inyectable.",
                conQueNoCombinar = "Otros AINEs (incluida la Aspirina), Pentoxifilina, Probenecid, anticoagulantes y sales de litio.",
                efectosSecundarios = "Dolor en el sitio de aplicación, somnolencia, riesgo elevado de falla renal aguda y sangrado digestivo severo.",
                tipoReceta = "Se necesita receta médica (Uso clínico/hospitalario)",
                comoDesechar = "La jeringa y ampolla deben descartarse en contenedor de punzocortantes (reproceso especializado).",
                datoExtra = "No es un medicamento para dolores comunes o crónicos. Su uso está estrictamente limitado a episodios agudos severos."
            ),
            Medicamento(
                id = 120, nombre = "Diclofenaco 50mg supositorio", principioActivo = "Diclofenaco sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.OTRO,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco sódico 50mg supositorio.png"), especificacion = "Supositorio",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Inhibidor de la COX que proporciona alivio del dolor y la inflamación. La vía rectal es útil cuando el paciente presenta náuseas, vómitos, dificultad para deglutir o tras intervenciones quirúrgicas pediátricas.",
                contraindicaciones = "Hipersensibilidad al diclofenaco o aspirina. Proctitis (inflamación del recto), hemorroides sangrantes, úlcera gástrica activa e insuficiencia cardíaca severa.",
                conQueNoCombinar = "Anticoagulantes orales, Metotrexato, sales de litio y otros AINEs.",
                efectosSecundarios = "Irritación local rectal, diarrea, dolor abdominal tipo cólico y riesgo de sangrado oculto.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de medicamentos en farmacia.",
                datoExtra = "Se recomienda evacuar el intestino antes de la aplicación para asegurar la máxima absorción del fármaco."
            ),
            Medicamento(
                id = 124, nombre = "Diclofenaco 50mg", principioActivo = "Diclofenaco sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco de sodio 50mg.png"), especificacion = "Comprimido",
                familiaFarmacologica = "AINE (Derivado del ácido fenilacético)",
                paraQueSirve = "Potente antiinflamatorio y analgésico. Indicado en ataques de gota, artritis reumatoide, artrosis, espondilitis anquilosante y cuadros inflamatorios agudos musculoesqueléticos.",
                contraindicaciones = "Úlcera gastroduodenal, insuficiencia renal moderada, tercer trimestre de embarazo y pacientes con falla cardíaca congestiva establecida.",
                conQueNoCombinar = "Metotrexato (aumenta niveles tóxicos), alcohol (irrita la mucosa gástrica), diuréticos y fármacos antihipertensivos.",
                efectosSecundarios = "Dolor epigástrico, náuseas, somnolencia y aumento transitorio de enzimas hepáticas.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul.",
                datoExtra = "Tomar con un vaso de agua lleno durante o inmediatamente después de las comidas para proteger la mucosa gástrica."
            ),
            Medicamento(
                id = 125, nombre = "Naproxeno Sódico 550mg", principioActivo = "Naproxeno sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Naproxeno Sódico 550mg.png"), especificacion = "Comprimido de 550 mg",
                familiaFarmacologica = "AINE (Derivado del ácido propiónico)",
                paraQueSirve = "Analgésico y antiinflamatorio con una vida media más larga que el ibuprofeno. Indicado en dolor de intensidad moderada, inflamación post-traumática, dismenorrea severa y migraña aguda.",
                contraindicaciones = "Antecedentes de hemorragia o perforación gastrointestinal por AINEs, insuficiencia cardíaca severa, falla renal severa y embarazo.",
                conQueNoCombinar = "Litio, diuréticos (bajan su efecto), antihipertensivos y corticoides sistémicos.",
                efectosSecundarios = "Mareos, cefalea, ardor de estómago, zumbido de oídos (tinnitus) y mayor riesgo de hemorragia gástrica en adultos mayores.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor autorizado en farmacias.",
                datoExtra = "La presentación sódica se absorbe más rápido que el naproxeno base, siendo ideal para el alivio rápido del dolor agudo."
            ),
            Medicamento(
                id = 130, nombre = "Ibuprofeno 400mg", principioActivo = "Ibuprofeno",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Ibuprofeno 400mg.png"), especificacion = "Comprimido de 400 mg",
                familiaFarmacologica = "AINE (Inhibidor no selectivo de la COX)",
                paraQueSirve = "Alivio del dolor de intensidad leve a moderada como cefaleas (dolor de cabeza), dismenorrea, dolor dental y muscular. También indicado para reducir la fiebre.",
                contraindicaciones = "Úlcera péptica activa, insuficiencia renal o hepática grave. Tercer trimestre de embarazo. Alergia a la aspirina u otros AINEs.",
                conQueNoCombinar = "Metotrexato, Warfarina, otros AINEs y alcohol. Puede reducir el efecto cardioprotector de la Aspirina si se toman juntos.",
                efectosSecundarios = "Dispepsia (indigestión), náuseas, erupciones cutáneas y ocasionalmente mareos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia.",
                datoExtra = "No exceder los 1200mg diarios en automedicación. Tomar siempre con alimentos para minimizar el daño gástrico."
            )
        )
    }
}
