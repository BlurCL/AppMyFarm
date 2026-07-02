package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object PsicotropicosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 240, nombre = "Fentermina Clorhidrato 37,5mg", principioActivo = "Fentermina",
                categoria = AppDestinations.PSICOTROPICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Fentarmina Clorhidrato 37,5mg.png"), especificacion = "37,5 mg",
                familiaFarmacologica = "Simpaticomimético / Derivado de anfetamina.",
                paraQueSirve = "Obesidad. Reduce apetito + aumenta gasto energético. Solo 4-12 semanas como máximo, junto a dieta/ejercicio.",
                contraindicaciones = "Hipertensión arterial, cardiopatía, arritmias, ACV previo.\n\nHipertiroidismo, glaucoma.\n\nAnsiedad, agitación, insomnio severo.\n\nEmbarazo, lactancia.\n\nSi tomaste IMAO en últimos 14 días → crisis hipertensiva mortal.\n\nAlergia a anfetaminas.\n\nAbuso de drogas/alcohol.",
                conQueNoCombinar = "IMAO, isocarboxazida: Crisis hipertensiva grave.\n\nOtros anorexígenos, anfetaminas: Riesgo hipertensión pulmonar + cardiopatía.\n\nAntidepresivos ISRS, litio: Síndrome serotoninérgico.\n\nAlcohol: Aumenta efectos adversos cardíacos.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Receta retenida. Punto limpio farmacia. No a basura/inodoro por ser sustancia controlada."
            ),
            Medicamento(
                id = 247, nombre = "Fentermina Clorhidrato 18,75mg", principioActivo = "Fentermina",
                categoria = AppDestinations.PSICOTROPICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Fentarmina Clorhidrato 18,75mg.png"), especificacion = "18,75 mg",
                familiaFarmacologica = "Simpaticomimético / Derivado de anfetamina.",
                paraQueSirve = "Obesidad. Reduce apetito + aumenta gasto energético. Solo 4-12 semanas como máximo, junto a dieta/ejercicio.",
                contraindicaciones = "Hipertensión arterial, cardiopatía, arritmias, ACV previo.\n\nHipertiroidismo, glaucoma.\n\nAnsiedad, agitación, insomnio severo.\n\nEmbarazo, lactancia.\n\nSi tomaste IMAO en últimos 14 días → crisis hipertensiva mortal.\n\nAlergia a anfetaminas.\n\nAbuso de drogas/alcohol.",
                conQueNoCombinar = "IMAO, isocarboxazida: Crisis hipertensiva grave.\n\nOtros anorexígenos, anfetaminas: Riesgo hipertensión pulmonar + cardiopatía.\n\nAntidepresivos ISRS, litio: Síndrome serotoninérgico.\n\nAlcohol: Aumenta efectos adversos cardíacos.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Receta retenida. Punto limpio farmacia. No a basura/inodoro por ser sustancia controlada."
            ),
            Medicamento(
                id = 248, nombre = "Fentermina Clorhidrato 30 mg", principioActivo = "Fentermina",
                categoria = AppDestinations.PSICOTROPICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Fentarmina Clorhidrato 30 mg.png"), especificacion = "30 mg",
                familiaFarmacologica = "Simpaticomimético / Derivado de anfetamina.",
                paraQueSirve = "Obesidad. Reduce apetito + aumenta gasto energético. Solo 4-12 semanas como máximo, junto a dieta/ejercicio.",
                contraindicaciones = "Hipertensión arterial, cardiopatía, arritmias, ACV previo.\n\nHipertiroidismo, glaucoma.\n\nAnsiedad, agitación, insomnio severo.\n\nEmbarazo, lactancia.\n\nSi tomaste IMAO en últimos 14 días → crisis hipertensiva mortal.\n\nAlergia a anfetaminas.\n\nAbuso de drogas/alcohol.",
                conQueNoCombinar = "IMAO, isocarboxazida: Crisis hipertensiva grave.\n\nOtros anorexígenos, anfetaminas: Riesgo hipertensión pulmonar + cardiopatía.\n\nAntidepresivos ISRS, litio: Síndrome serotoninérgico.\n\nAlcohol: Aumenta efectos adversos cardíacos.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Receta retenida. Punto limpio farmacia. No a basura/inodoro por ser sustancia controlada."
            ),
            Medicamento(
                id = 241, nombre = "Zolpidem 10 mg", principioActivo = "Zolpidem",
                categoria = AppDestinations.PSICOTROPICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Zolpidem 10 mg.png"), especificacion = "10 mg",
                familiaFarmacologica = "Z-drug / Imidazopiridina.",
                paraQueSirve = "Insomnio ocasional/transitorio. Solo para conciliar sueño. Máximo 2-4 semanas.",
                contraindicaciones = "Alergia a zolpidem.\n\nMiastenia gravis.\n\nInsuficiencia respiratoria grave / apnea del sueño.\n\nInsuficiencia hepática severa.\n\nEmbarazo/lactancia → seda al bebé.\n\nNiños <18 años.\n\nDepresión mayor sin tratamiento.",
                conQueNoCombinar = "Alcohol, benzos, opioides: Depresión respiratoria, coma, muerte.\n\nKetoconazol, itraconazol: Duplican nivel de zolpidem → sobredosis.\n\nRifampicina: Baja efecto, no duermes.\n\nAntidepresivos sedantes: Potencian somnolencia diurna.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Receta retenida. Punto limpio farmacia. Sustancia controlada."
            ),
            Medicamento(
                id = 249, nombre = "Zolpidem Tartrato 12,5 mg", principioActivo = "Zolpidem",
                categoria = AppDestinations.PSICOTROPICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Zolpidem Tartrato 12,5 mg.png"), especificacion = "12,5 mg Liberación Prolongada",
                familiaFarmacologica = "Z-drug / Imidazopiridina.",
                paraQueSirve = "Insomnio ocasional/transitorio. Solo para conciliar sueño. Máximo 2-4 semanas.",
                contraindicaciones = "Alergia a zolpidem.\n\nMiastenia gravis.\n\nInsuficiencia respiratoria grave / apnea del sueño.\n\nInsuficiencia hepática severa.\n\nEmbarazo/lactancia → seda al bebé.\n\nNiños <18 años.\n\nDepresión mayor sin tratamiento.",
                conQueNoCombinar = "Alcohol, benzos, opioides: Depresión respiratoria, coma, muerte.\n\nKetoconazol, itraconazol: Duplican nivel de zolpidem → sobredosis.\n\nRifampicina: Baja efecto, no duermes.\n\nAntidepresivos sedantes: Potencian somnolencia diurna.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Receta retenida. Punto limpio farmacia. Sustancia controlada."
            ),
            Medicamento(
                id = 242, nombre = "Diazepam 10 mg", principioActivo = "Diazepam",
                categoria = AppDestinations.PSICOTROPICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Diazepam 10 mg.png"), especificacion = "10 mg",
                familiaFarmacologica = "Benzodiazepinas.",
                paraQueSirve = "Se indica para el alivio a corto plazo de la ansiedad severa, espasmos y contracturas musculares, sedación pre-anestésica y manejo de síntomas de abstinencia alcohólica.",
                contraindicaciones = "Mismas contraindicaciones que el clonazepam (alergia, miastenia gravis, insuficiencia respiratoria/hepática severa, glaucoma, embarazo/lactancia y apnea del sueño).\n\nAdicionales: Estados de shock, coma o cuadros de intoxicación alcohólica aguda.",
                conQueNoCombinar = "Alcohol, opioides, Disulfiram, Cimetidina y Omeprazol: Sustancias que potencian de forma peligrosa o prolongan el efecto sedante del diazepam.\n\nRifampicina y Fenitoína: Disminuyen la eficacia y concentración del medicamento en el cuerpo.",
                efectosSecundarios = "Genera sedación, mareos, fatiga y debilidad muscular. Debido a su vida media muy larga en el organismo, provoca un efecto marcado de \"resaca\" al día siguiente y el síndrome de abstinencia puede ser prolongado. Eleva significativamente el riesgo de caídas en adultos mayores.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Manejo estricto: Prohibido verter al alcantarillado o mezclar con desechos domiciliarios comunes.\n\nPuntos de reciclaje: Debe depositarse de forma obligatoria en un punto limpio autorizado dentro de las cadenas de farmacias."
            ),
            Medicamento(
                id = 243, nombre = "Clonazepam 0,5 mg", principioActivo = "Clonazepam",
                categoria = AppDestinations.PSICOTROPICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Clonazepam 0,5 mg.png"), especificacion = "0,5 mg",
                familiaFarmacologica = "Ansiolítico y Anticonvulsivante (Benzodiazepina)",
                paraQueSirve = "Tratamiento y prevención de crisis convulsivas (epilepsia) y manejo de trastornos de ansiedad severos o fobias.",
                conQueNoCombinar = "Alcohol, opioides y otros depresores del SNC: Alto riesgo de provocar depresión respiratoria severa, estado de coma o consecuencias fatales.\n\nKetoconazol y Eritromicina: Elevan los niveles plasmáticos de clonazepam, aumentando su toxicidad.\n\nCarbamazepina y Fenitoína: Disminuyen el efecto del clonazepam, lo que puede desencadenar crisis convulsivas.\n\nClozapina: Incrementa significativamente el riesgo de sufrir un paro respiratorio.\n\nAdvertencia de efectos adversos: Provoca somnolencia, mareos, debilidad, ataxia (falta de coordinación) y confusión. Genera una fuerte dependencia física y psicológica; su retiro abrupto puede gatillar convulsiones graves. En niños y adultos mayores puede ocasionar un efecto paradójico de irritabilidad e hiperactividad.",
                contraindicaciones = "Alergia o hipersensibilidad a las benzodiazepinas.\n\nMiastenia gravis.\n\nInsuficiencia respiratoria o hepática grave.\n\nGlaucoma de ángulo estrecho y síndrome de apnea del sueño severa.\n\nEmbarazo y período de lactancia (existe riesgo crítico de causar síndrome de abstinencia neonatal).",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Manejo estricto por sustancia controlada: No se debe tirar a la basura común ni desechar en el inodoro.\n\nPuntos de reciclaje: Debe ser entregado exclusivamente en los contenedores de puntos limpios o sistemas RETEMA en farmacias autorizadas."
            ),
            Medicamento(
                id = 244, nombre = "Alprazolam 0,5 mg", principioActivo = "Alprazolam",
                categoria = AppDestinations.PSICOTROPICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Alprazolam 0,5 mg.png"), especificacion = "0,5 mg",
                familiaFarmacologica = "Benzodiazepinas.",
                paraQueSirve = "Tratamiento de trastornos de ansiedad crónicos y es el fármaco de elección para el manejo agudo de crisis de pánico (ataques de pánico con o sin agorafobia).",
                contraindicaciones = "Comparte todas las contraindicaciones basales de las benzodiazepinas.\n\nAdicional: Cuadros de depresión grave con tendencias suicidas que no cuenten con un tratamiento psiquiátrico de base.",
                conQueNoCombinar = "Alcohol y Opioides: Máximo riesgo de muerte por paro o depresión respiratoria si se mezclan.\n\nKetoconazol, Itraconazol y Nefazodona: Combinación estrictamente contraindicada. Elevan entre 3 y 4 veces los niveles de alprazolam en la sangre.\n\nCarbamazepina: Disminuye el efecto del alprazolam hasta en un 50%.\n\nAntidepresivos ISRS: Incrementan la somnolencia y sedación central.",
                efectosSecundarios = "Causa somnolencia, mareos, confusión y boca seca. Al tener una vida media corta, posee el mayor potencial de abuso del grupo: genera dependencia de forma muy rápida y provoca un \"rebote de ansiedad\" muy marcado entre dosis, además de un síndrome de abstinencia brutal (psicosis, convulsiones).",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Manejo estricto por psicotrópico: No eliminar a través de tuberías ni basura doméstica.\n\nPuntos de reciclaje: Depositar exclusivamente en los contenedores de puntos limpios o RETEMA en farmacias."
            ),
            Medicamento(
                id = 245, nombre = "Zopiclona 7,5 mg", principioActivo = "Zopiclona",
                categoria = AppDestinations.PSICOTROPICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Zopiclona 7,5 mg.png"), especificacion = "7,5 mg",
                familiaFarmacologica = "Ciclopirrolonas",
                paraQueSirve = "Tratamiento a corto plazo del insomnio crónico o situacional (dificultad para conciliar el sueño, despertares nocturnos o despertar precoz).",
                contraindicaciones = "Alergia o hipersensibilidad a la zopiclona.\n\nMiastenia gravis.\n\nInsuficiencia respiratoria grave o síndrome de apnea del sueño severa.\n\nInsuficiencia hepática severa.\n\nEmbarazo y período de lactancia (se excreta en la leche materna y genera sedación en el lactante).\n\nMenores de 18 años.",
                conQueNoCombinar = "Alcohol, benzodiazepinas y opioides: Está estrictamente contraindicado combinarlos debido al riesgo crítico de depresión respiratoria grave, coma y muerte.\n\nAntifúngicos y antibióticos macrólidos (Ketoconazol, Itraconazol, Eritromicina): Elevan entre 2 y 3 veces los niveles de zopiclona en la sangre, aumentando drásticamente el riesgo de sobredosis.\n\nRifampicina y Carbamazepina: Disminuyen drásticamente el efecto de la zopiclona, anulando su eficacia para conciliar el sueño.\n\nAntidepresivos sedantes: Potencian de forma severa la somnolencia al día siguiente.\n\nAdvertencia de efectos adversos: Es sumamente común (prácticamente el 100% de los usuarios) experimentar un sabor amargo o metálico en la boca y sequedad bucal. Puede generar dependencia y tolerancia si se usa por más de 4 semanas. Presenta riesgo de amnesia anterógrada y conductas complejas en estado de sonambulismo (como comer, caminar o manejar dormido).",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Manejo estricto por sustancia regulada: Al ser un psicotrópico controlado, no debe eliminarse por el inodoro ni arrojarse a los residuos domésticos habituales.\n\nPuntos de reciclaje: Debe depositarse obligatoriamente en los contenedores de puntos limpios o sistemas de recolección RETEMA en farmacias autorizadas."
            ),
            Medicamento(
                id = 250, nombre = "Eszopiclona 3 mg", principioActivo = "Eszopiclona",
                categoria = AppDestinations.PSICOTROPICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Eszopiclona 3 mg.png"), especificacion = "3 mg",
                familiaFarmacologica = "Ciclopirrolonas",
                paraQueSirve = "Tratamiento del insomnio (tanto para la conciliación como para el mantenimiento del sueño). Al ser el componente activo aislado, busca ofrecer una inducción efectiva del sueño con un perfil optimizado.",
                conQueNoCombinar = "Alcohol y Opioides: Combinación de peligro mortal por potenciación de la depresión del sistema nervioso central.\n\nKetoconazol y Claritromicina: Inhiben su metabolismo, elevando peligrosamente sus niveles en el organismo.\n\nRifampicina: Induce su degradación rápida, reduciendo significativamente su efecto hipnótico.\n\nAdvertencia de efectos adversos: Provoca sabor desagradable en la boca, sequedad bucal, dolor de cabeza y somnolencia diurna. Comparte el riesgo grave de provocar conductas complejas sin recordar el evento al día siguiente (manejar dormido, comer o tener actividad sexual en estado de sonambulismo). En casos raros, se ha asociado a la aparición de depresión o ideación suicida.",
                contraindicaciones = "Identicas a la zopiclona: Alergia al componente, miastenia gravis, apnea del sueño grave, insuficiencia hepática severa, embarazo y período de lactancia.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Manejo estricto por sustancia regulada: Prohibido botar a la basura común o verter en desagües.\n\nPuntos de reciclaje: Entrega exclusiva en los contenedores de puntos limpios habilitados en las cadenas de farmacias para asegurar su correcta destrucción."
            ),
            Medicamento(
                id = 246, nombre = "Clotiazepam 10 mg", principioActivo = "Clotiazepam",
                categoria = AppDestinations.PSICOTROPICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Clotiazepam 10mg.png"), especificacion = "10 mg",
                familiaFarmacologica = "Ansiolítico (Benzodiazepina tiazepínica)",
                paraQueSirve = "Se indica principalmente para el tratamiento sintomático de la ansiedad, tensión psíquica e hiperexitabilidad. Ofrece la ventaja de producir menos somnolencia o \"resaca\" al día siguiente en comparación con el lorazepam debido a su vida media más corta.",
                contraindicaciones = "Alergia o hipersensibilidad a las benzodiazepinas.\n\nMiastenia gravis.\n\nInsuficiencia respiratoria grave o apnea del sueño.\n\nInsuficiencia hepática o renal de carácter severo.\n\nGlaucoma de ángulo estrecho.\n\nEmbarazo y lactancia.",
                conQueNoCombinar = "Alcohol, opioides y barbitúricos: Potenciación crítica del efecto sedante y riesgo grave de depresión respiratoria si se mezclan de forma simultánea.\n\nKetoconazol, Probenecid y Anticonvulsivantes: Presenta el mismo perfil de interacciones que el lorazepam, alterando sus niveles plasmáticos o disminuyendo su eficacia según corresponda.\n\nAdvertencia de efectos adversos: Provoca comúnmente somnolencia leve, mareos, fatiga y dolor de cabeza. Al igual que otros fármacos de su familia, genera tolerancia y dependencia física o psicológica con el uso diario continuo en un plazo de 2 a 4 semanas. En adultos mayores, aumenta significativamente el riesgo de confusión y caídas.",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Manejo estricto por sustancia controlada: Está prohibido desecharlo junto a los residuos comunes del hogar o por los desagües.\n\nPuntos de reciclaje: Debe entregarse exclusivamente en los puntos limpios autorizados de las farmacias para su correcta destrucción."
            ),
            Medicamento(
                id = 251, nombre = "Lorazepam 2 mg", principioActivo = "Lorazepam",
                categoria = AppDestinations.PSICOTROPICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Lorazepam 2mg.png"), especificacion = "2 mg",
                familiaFarmacologica = "Ansiolítico (Benzodiazepina)",
                paraQueSirve = "Se utiliza para el alivio a corto plazo de los trastornos de ansiedad, manejo del insomnio asociado a estados de angustia y como coadyuvante en cuadros que requieran sedación y relajación muscular.",
                contraindicaciones = "Alergia o hipersensibilidad a las benzodiazepinas.\n\nMiastenia gravis.\n\nInsuficiencia respiratoria grave o síndrome de apnea del sueño.\n\nInsuficiencia hepática o renal severa.\n\nGlaucoma de ángulo estrecho.\n\nPrimer trimestre de embarazo y período de lactancia (se traspasa por la leche materna y provoca sedación profunda en el lactante).\n\nDepresión grave que no esté bajo tratamiento médico (riesgo de potenciar ideación suicida).",
                conQueNoCombinar = "Alcohol, opioides y otros depresores del SNC: Está estrictamente prohibido mezclarlos, ya que aumenta exponencialmente el riesgo de depresión respiratoria severa, coma y muerte.\n\nAntifúngicos (Ketoconazol, Itraconazol): Elevan los niveles de lorazepam en la sangre, aumentando su toxicidad.\n\nAnticonvulsivantes (Fenitoína, Carbamazepina): Disminuyen el efecto terapéutico del lorazepam.\n\nClozapina: Incrementa severamente el riesgo de sufrir un paro respiratorio.\n\nProbenecid: Prolonga de forma excesiva el tiempo de efecto del lorazepam en el cuerpo.\n\nAdvertencia de efectos adversos: Puede causar somnolencia, mareos, amnesia anterógrada y confusión. En adultos mayores eleva drásticamente el riesgo de caídas y fracturas. Genera tolerancia y dependencia en 2-4 semanas; su suspensión abrupta causa síndrome de abstinencia con convulsiones. En casos raros, puede provocar reacciones paradójicas (agitación o agresividad).",
                tipoReceta = "Se necesita receta médica retenida",
                comoDesechar = "Manejo estricto por sustancia controlada: Al ser un psicotrópico regulado, está prohibido verterlo al inodoro o arrojarlo a la basura domiciliaria común.\n\nPuntos de reciclaje: Debe ser llevado y depositado obligatoriamente en los contenedores especiales para medicamentos en desuso de puntos limpios o RETEMA en farmacias."
            )
        )
    }
}
