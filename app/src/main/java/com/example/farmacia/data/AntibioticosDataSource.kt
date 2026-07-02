package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AntibioticosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 1, nombre = "Amoxicilina 500mg", principioActivo = "Amoxicilina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Amoxicilina 500mg"), especificacion = "Cápsula de 500 mg",
                familiaFarmacologica = "Betalactámico (Penicilina de amplio espectro)", 
                paraQueSirve = "Antibiótico bactericida que actúa inhibiendo la síntesis de la pared celular bacteriana al unirse a las proteínas fijadoras de penicilina (PBPs). \n\nUSOS CLÍNICOS: \n- Infecciones del tracto respiratorio superior (faringitis, amigdalitis estreptocócica, sinusitis maxilar aguda).\n- Infecciones del tracto respiratorio inferior (bronquitis bacteriana, neumonía adquirida en la comunidad por S. pneumoniae).\n- Infecciones urogenitales y de la piel.\n- Erradicación de Helicobacter pylori en conjunto con Claritromicina e IBP. \n\nIMPORTANTE: No tiene actividad contra virus. El uso excesivo o incompleto fomenta la aparición de 'superbacterias' resistentes.",
                contraindicaciones = "Hipersensibilidad absoluta a penicilinas. Existe riesgo de reacción alérgica cruzada (10%) en pacientes con alergia documentada a cefalosporinas. \n\nADVERTENCIA CLÍNICA: En pacientes con Mononucleosis Infecciosa (virus Epstein-Barr), el uso de amoxicilina desencadena casi invariablemente un exantema cutáneo morbiliforme severo. Requiere ajuste estricto de dosis en pacientes con aclaramiento de creatinina reducido.",
                conQueNoCombinar = "Alopurinol: Eleva drásticamente el riesgo de erupciones cutáneas severas. \nMetotrexato: La amoxicilina compite por la secreción renal, aumentando la toxicidad del metotrexato. \nAnticonceptivos orales: Posible reducción de la eficacia por alteración de la flora intestinal necesaria para la recirculación de estrógenos. \nTetraciclinas o Cloranfenicol: Antibióticos bacteriostáticos que pueden antagonizar el efecto bactericida de la amoxicilina.", 
                efectosSecundarios = "Diarrea asociada a antibióticos (por disbiosis), náuseas, vómitos, exantema cutáneo y candidiasis mucocutánea (oral o vaginal). En casos raros, puede causar nefritis intersticial o anemia hemolítica inmune.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Llevar restos a contenedores de Punto Azul en farmacias. Nunca descartar en el desagüe, ya que los residuos de antibióticos en el agua seleccionan bacterias resistentes en el medio ambiente.",
                datoExtra = "Se absorbe de forma excelente incluso con alimentos. Lo más crítico es la ADHERENCIA: respetar los intervalos (cada 8 o 12 horas) para mantener la concentración plasmática por encima de la CMI (Concentración Mínima Inhibitoria)."
            ),
            Medicamento(
                id = 4, nombre = "Amoxicilina-Ácido Clavulánico 875/125mg", principioActivo = "Amoxicilina, Ácido Clavulánico",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Amoxicilina-Acido Clavulánico 875mg-125mg .png"), especificacion = "Comprimido",
                familiaFarmacologica = "Betalactámico + Inhibidor de betalactamasas", 
                paraQueSirve = "Combinación sinérgica diseñada para vencer resistencias bacterianas. El Ácido Clavulánico inactiva irreversiblemente las enzimas (betalactamasas) producidas por bacterias que normalmente destruirían a la amoxicilina. \n\nINDICACIONES: Sinusitis bacteriana aguda refractaria, otitis media recurrente en niños, exacerbaciones de EPOC, neumonía bacteriana, infecciones urinarias por E. coli resistente e infecciones de piel secundarias a mordeduras humanas o animales.",
                contraindicaciones = "Alergia a penicilinas. Antecedente previo de ictericia o disfunción hepática (colestasis) asociado específicamente al uso de esta combinación. Pacientes con insuficiencia renal grave (aclaramiento < 30 ml/min) no deben usar la presentación de 875mg.",
                conQueNoCombinar = "Warfarina y otros anticoagulantes: Riesgo elevado de hemorragia al potenciarse el efecto anticoagulante. Alopurinol, Metotrexato y Micofenolato de mofetilo.", 
                efectosSecundarios = "Diarrea líquida profusa (muy común debido al efecto procinético del clavulanato), náuseas, dolor epigástrico, vómitos y micosis vaginal. Raramente hepatitis colestásica.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Contenedor de residuos farmacéuticos.",
                datoExtra = "REGLA DE ORO: Tomar justo al inicio de una comida principal. Esto cumple dos funciones: mejora significativamente la absorción del ácido clavulánico y minimiza los efectos adversos gastrointestinales (náuseas y diarrea)."
            ),
            Medicamento(
                id = 12, nombre = "Claritromicina 500mg", principioActivo = "Claritromicina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Claritromicina 500mg"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Macrólido (Inhibidor de la subunidad 50S)", 
                paraQueSirve = "Antibiótico bacteriostático que inhibe la síntesis de proteínas bacterianas al unirse de forma reversible a la subunidad 50S del ribosoma. \n\nUSOS: Faringoamigdalitis (segunda línea en alérgicos a penicilina), neumonía atípica (Legionella, Mycoplasma), infecciones de piel y tejidos blandos. Es el pilar del tratamiento erradicador de Helicobacter pylori y en la prevención de infecciones por Complejo Mycobacterium Avium.",
                contraindicaciones = "Hipersensibilidad a macrólidos. Antecedentes de arritmias cardíacas o prolongación del intervalo QT (riesgo de Torsade de Pointes). Niveles bajos de potasio o magnesio en sangre. Insuficiencia hepática grave combinada con insuficiencia renal.",
                conQueNoCombinar = "ADVERTENCIA CRÍTICA: Inhibidor potente del citocromo P450 (CYP3A4). Prohibido con Estatinas (riesgo de rabdomiólisis grave), Colchicina (riesgo de muerte), Ergotamina (vasoconstricción severa), Cisaprida, Pimozida y Warfarina.", 
                efectosSecundarios = "Disgeusia (sabor metálico o amargo persistente), náuseas, dolor abdominal, diarrea, cefalea y elevación de enzimas hepáticas. Riesgo de ototoxicidad (pérdida de audición) en dosis altas o tratamientos largos.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor Punto Azul.",
                datoExtra = "Posee un marcado efecto post-antibiótico (PAE), lo que permite que el fármaco siga inhibiendo el crecimiento bacteriano incluso cuando sus niveles plasmáticos han descendido."
            ),
            Medicamento(
                id = 18, nombre = "Doxiciclina 100mg", principioActivo = "Doxiciclina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Doxiciclina 100mg"), especificacion = "Comprimido de 100 mg",
                familiaFarmacologica = "Tetraciclina de segunda generación", 
                paraQueSirve = "Antibiótico de amplio espectro que inhibe la síntesis proteica (subunidad 30S). \n\nUSOS: Tratamiento de elección en Acné vulgar moderado-severo, Rosácea, infecciones por Chlamydia, Rickettsiosis (tifus, fiebre por garrapatas), Cólera y Brucelosis. También se utiliza como profilaxis efectiva contra la Malaria en zonas con resistencia a cloroquina.",
                contraindicaciones = "Embarazo (riesgo de teratogenicidad y toxicidad ósea fetal) y lactancia. Niños menores de 8-12 años: provoca coloración permanente (amarillo-gris) en los dientes y puede detener el crecimiento óseo temporalmente.",
                conQueNoCombinar = "NO TOMAR con lácteos (leche, yogurt), antiácidos, hierro, calcio, bismuto o magnesio. Estos minerales forman quelatos insolubles en el estómago que anulan totalmente la absorción del antibiótico (separar al menos 3 horas).", 
                efectosSecundarios = "Fotosensibilidad extrema (quemaduras solares graves), esofagitis erosiva (úlceras en el esófago), náuseas y posible hipertensión intracraneal benigna.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor Punto Azul.",
                datoExtra = "INDICACIÓN VITAL DE SEGURIDAD: Tomar con un vaso de agua muy grande (200ml) y PERMANECER ERGUIDO (no acostarse) durante al menos 60 minutos para asegurar que el fármaco pase al estómago y no dañe el esófago. Usar bloqueador solar estricto."
            ),
            Medicamento(
                id = 26, nombre = "Levofloxacino 500mg", principioActivo = "Levofloxacino",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Levofloxacino 500mg"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Fluoroquinolona de tercera generación (Respiratoria)", 
                paraQueSirve = "Bactericida potente que inhibe la ADN-girasa y la topoisomerasa IV bacterianas. \n\nINDICACIONES: Reservado para infecciones respiratorias graves (neumonía adquirida en la comunidad), sinusitis aguda, infecciones urinarias complicadas (pielonefritis) y prostatitis crónica bacteriana.",
                contraindicaciones = "Menores de 18 años (daño potencial en cartílagos de crecimiento). Pacientes con epilepsia o antecedentes de convulsiones. Antecedentes personales de tendinitis o rotura de tendones asociados a quinolonas. Miastenia Gravis.",
                conQueNoCombinar = "AINEs (Ibuprofeno, Naproxeno, etc.): Aumenta drásticamente el riesgo de estimulación del SNC y convulsiones. Corticoides (Prednisona): Aumenta críticamente el riesgo de rotura de tendón de Aquiles. Suplementos minerales y antiácidos.", 
                efectosSecundarios = "Riesgo de tendinitis y rotura del tendón de Aquiles (Black Box Warning), prolongación del intervalo QT, diarrea por C. difficile, mareos y fotosensibilidad. Puede causar neuropatía periférica irreversible.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Punto Azul.",
                datoExtra = "ADVERTENCIA DE SEGURIDAD: Si nota dolor súbito, hinchazón o inflamación en algún tendón, o presenta cambios en el estado de ánimo (ansiedad, psicosis, alucinaciones), suspenda el fármaco y consulte de inmediato."
            ),
            Medicamento(
                id = 48, nombre = "Ciprofloxacino 500mg", principioActivo = "Ciprofloxacino",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("ciprofloxacino 500mg.png"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Fluoroquinolona de segunda generación", 
                paraQueSirve = "Eficaz principalmente contra bacterias Gram-negativas aerobias. \n\nINDICACIONES: Infecciones urinarias (Cistitis aguda no complicada, Pielonefritis), Prostatitis, Diarreas bacterianas infecciosas, infecciones óseas y articulares, e infecciones intraabdominales complicadas.",
                contraindicaciones = "Embarazo y lactancia. Niños (salvo casos muy específicos). Hipersensibilidad a quinolonas. Cuidado extremo en pacientes con antecedentes de aneurisma de aorta o válvulas cardíacas con insuficiencia.",
                conQueNoCombinar = "Tizanidina (interacción grave: hipotensión severa), Teofilina (aumenta toxicidad de esta), Warfarina, y lácteos (el calcio anula la absorción; no tomar con leche o yogurt).", 
                efectosSecundarios = "Náuseas, mareos, insomnio, riesgo de lesiones tendinosas, fotosensibilidad y riesgo de diarrea asociada a antibióticos.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Contenedor autorizado.",
                datoExtra = "Se recomienda ingerir abundante líquido durante el tratamiento para prevenir la cristaluria (formación de cristales de medicamento en los riñones)."
            ),
            Medicamento(
                id = 54, nombre = "Flucloxacilina 500mg", principioActivo = "Flucloxacilina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("flucloxacilina 500mg.png"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Penicilina resistente a penicilinasas", 
                paraQueSirve = "Penicilina de espectro reducido dirigida específicamente contra Staphylococcus aureus (productor de betalactamasas). \n\nUSOS: Forúnculos, Ántrax, Abscesos cutáneos, Impétigo, heridas quirúrgicas infectadas, celulitis y osteomielitis estafilocócica.",
                contraindicaciones = "Hipersensibilidad a las penicilinas. Pacientes con antecedentes de daño hepático o ictericia al haber tomado flucloxacilina previamente. Pacientes de edad avanzada tienen mayor riesgo de toxicidad hepática.",
                conQueNoCombinar = "Metotrexato y otros antibióticos bacteriostáticos. No debe mezclarse con alcohol por el riesgo metabólico hepático.", 
                efectosSecundarios = "Malestar gastrointestinal, erupciones tipo urticaria y, en casos raros, hepatitis colestásica que puede manifestarse semanas después de terminar el tratamiento.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor Punto Azul.",
                datoExtra = "IMPORTANTE: Debe tomarse estrictamente con el ESTÓMAGO VACÍO (mínimo 1 hora antes o 2 horas después de comer) porque la comida reduce su absorción en más de un 50%."
            ),
            Medicamento(
                id = 66, nombre = "Nitrofurantoína 100mg", principioActivo = "Nitrofurantoína macrocristales",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("nitrofurantoina macrocristales 100mg.png"), especificacion = "Cápsula de 100 mg",
                familiaFarmacologica = "Nitrofuranos (Antiséptico urinario)", 
                paraQueSirve = "Tratamiento y prevención de Infecciones Urinarias Bajas (Cistitis Aguda No Complicada). El fármaco se filtra rápidamente y se concentra casi exclusivamente en la orina de la vejiga. No es útil para infecciones de los riñones o de la sangre.",
                contraindicaciones = "Insuficiencia renal moderada o grave (aclaramiento de creatinina < 45-60 ml/min): si el riñón no filtra bien, el medicamento no llega a la orina y se vuelve tóxico en sangre. Embarazo a término (semanas 38-42).",
                conQueNoCombinar = "Antiácidos con trisilicato de magnesio (disminuyen su absorción). Probenecid. Medicamentos que alcalinizan la orina (disminuyen su efecto antiséptico).", 
                efectosSecundarios = "Náuseas y vómitos (muy comunes), mareos, coloración amarillo intenso o marrón de la orina (inofensivo) y riesgo de toxicidad pulmonar (fibrosis) en tratamientos preventivos crónicos.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul.",
                datoExtra = "CONSEJO PRÁCTICO: Tomar junto con comida o leche. Esto cumple dos funciones: reduce significativamente las náuseas y mejora mucho la absorción del antibiótico."
            ),
            Medicamento(
                id = 5, nombre = "Azitromicina 500mg", principioActivo = "Azitromicina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("azitromicina 500mg.png"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Macrólido (Azálido)", 
                paraQueSirve = "Antibiótico de amplio espectro con una farmacocinética única: se acumula dentro de los glóbulos blancos y viaja directamente al sitio de infección. \n\nUSOS: Faringitis, neumonía, y especialmente infecciones de transmisión sexual (Clamidia).",
                contraindicaciones = "Alergia a macrólidos. Insuficiencia hepática grave. Pacientes con antecedentes de arritmias.",
                conQueNoCombinar = "Ergotamina (riesgo de isquemia en extremidades), Warfarina, Digoxina y antiácidos (separar 2 horas).", 
                efectosSecundarios = "Diarrea, náuseas, dolor abdominal y, raramente, alteración del sentido del gusto o del oído (sordera transitoria).",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor autorizado.",
                datoExtra = "Ciclos cortos de 3 días suelen ser equivalentes a 10 días de otros antibióticos debido a su permanencia prolongada en los tejidos corporales."
            ),
            Medicamento(
                id = 35, nombre = "Tetraciclina 500mg", principioActivo = "Tetraciclina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tetraciclina 500mg"), especificacion = "Cápsula de 500 mg",
                familiaFarmacologica = "Tetraciclina", 
                paraQueSirve = "Antibiótico bacteriostático clásico para acné severo y ciertas infecciones bacterianas poco comunes. \n\nMECANISMO: Inhibe la síntesis proteica al unirse a la subunidad 30S del ribosoma.",
                contraindicaciones = "Embarazo, lactancia y niños menores de 12 años (causa coloración permanente de los dientes). Falla renal severa.",
                conQueNoCombinar = "Lácteos, antiácidos, suplementos de hierro (forman complejos no absorbibles).", 
                efectosSecundarios = "Decoloración dental en formación, fotosensibilidad extrema, náuseas y mareos.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul. ADVERTENCIA: Nunca usar tetraciclina vencida, puede causar daño renal grave (Síndrome de Fanconi).",
                datoExtra = "Evitar la exposición directa al sol. Tomar con el estómago vacío y abundante agua."
            ),
            Medicamento(
                id = 9, nombre = "Cefuroxima 500mg", principioActivo = "Cefuroxima",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Cefuroxima 500mg"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Cefalosporina de segunda generación", 
                paraQueSirve = "Antibiótico bactericida con mayor actividad contra bacterias Gram-negativas que las de primera generación. \n\nUSOS: Sinusitis, neumonía bacteriana, infecciones urinarias y tratamiento temprano de la Enfermedad de Lyme.",
                contraindicaciones = "Alergia severa a cefalosporinas or penicilinas.",
                conQueNoCombinar = "Antiácidos e inhibidores de la bomba de protones (Omeprazol): reducen drásticamente la absorción de este fármaco.", 
                efectosSecundarios = "Dolor de cabeza, mareos, diarrea y posible candidiasis.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de farmacia.",
                datoExtra = "A diferencia de la mayoría de los antibióticos, la cefuroxima se absorbe mucho mejor si se toma DESPUÉS de una comida."
            ),
            Medicamento(
                id = 8, nombre = "Cefradina 500mg", principioActivo = "Cefradina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Cefradina 500mg"), especificacion = "Cápsula de 500 mg",
                familiaFarmacologica = "Cefalosporina de primera generación", 
                paraQueSirve = "Tratamiento de infecciones del tracto respiratorio, piel y tracto urinario causadas por microorganismos sensibles.",
                contraindicaciones = "Hipersensibilidad a las cefalosporinas.",
                conQueNoCombinar = "Probenecid, antibióticos bacteriostáticos.", 
                efectosSecundarios = "Náuseas, diarrea, mareos y rash cutáneo.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul.",
                datoExtra = "Es muy estable al ácido del estómago, por lo que se puede tomar con o sin alimentos."
            ),
            Medicamento(
                id = 7, nombre = "Cefadroxilo 250mg/5ml", principioActivo = "Cefadroxilo",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Cefadroxilo jarabe 250mg-5ml frasco 60 ml suspension oral.png"), especificacion = "Suspensión oral",
                familiaFarmacologica = "Cefalosporina de primera generación", 
                paraQueSirve = "Infecciones pediátricas de piel (impétigo) y del tracto urinario. Muy bien tolerada en niños.",
                contraindicaciones = "Alergia conocida a cefalosporinas o penicilinas.",
                conQueNoCombinar = "Otros fármacos que puedan dañar el riñón.", 
                efectosSecundarios = "Diarrea leve, náuseas y posible dermatitis del pañal.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Llevar el frasco con restos a la farmacia.",
                datoExtra = "Agitar bien antes de usar. Se puede administrar con leche o alimentos para mejorar la tolerancia."
            ),
            Medicamento(
                id = 51, nombre = "Cloxacilina 500mg", principioActivo = "Cloxacilina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("cloxacilina 500 mg.png"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Penicilina resistente a penicilinasa", 
                paraQueSirve = "Específico para infecciones por estafilococos productores de penicilinasa (piel, huesos).",
                contraindicaciones = "Alergia conocida a las penicilinas.",
                conQueNoCombinar = "Antibióticos bacteriostáticos.", 
                efectosSecundarios = "Trastornos digestivos, reacciones alérgicas.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Punto Azul.",
                datoExtra = "Tomar preferentemente con el estómago vacío para asegurar la absorción."
            ),
            Medicamento(
                id = 39, nombre = "Amoxicilina 750mg", principioActivo = "Amoxicilina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Amoxicilina 750mg.jpeg"), especificacion = "Comprimido de 750 mg",
                familiaFarmacologica = "Betalactámico", 
                paraQueSirve = "Dosis de alta concentración para infecciones respiratorias severas en adultos que requieren una posología de dos veces al día.",
                contraindicaciones = "Alergia a penicilinas.",
                conQueNoCombinar = "Alopurinol.", 
                efectosSecundarios = "Diarrea, náuseas.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul.",
                datoExtra = "Mantener los intervalos de dosis para asegurar la eficacia del tratamiento."
            ),
            Medicamento(
                id = 2, nombre = "Amoxicilina jarabe 250mg/5ml", principioActivo = "Amoxicilina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Amoxicilina jarabe 250mg-5ml frasco de 60ml suspension oral.png"), especificacion = "Frasco de 60ml",
                familiaFarmacologica = "Betalactámico", 
                paraQueSirve = "Infecciones pediátricas. Preparación: añadir agua hervida fría hasta la marca del frasco.",
                contraindicaciones = "Alergia a penicilinas.",
                conQueNoCombinar = "No mezclar con jugos ácidos.", 
                efectosSecundarios = "Diarrea leve.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto limpio.",
                datoExtra = "Agitar vigorosamente antes de cada administración."
            )
        )
    }
}
