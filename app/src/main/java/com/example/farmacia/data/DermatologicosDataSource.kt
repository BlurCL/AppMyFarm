package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object DermatologicosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 15, nombre = "Clotrimazol-Betametasona 1/0,05%", principioActivo = "Clotrimazol, Betametasona",
                categoria = AppDestinations.DERMATOLOGICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                imagenUrl = getUrl("Clotrimazol-Betametasona 1-0,05 Crema topica 15g.jpeg"), especificacion = "Crema tópica 15g",
                familiaFarmacologica = "Antimicótico asociado a corticoide", 
                paraQueSirve = "Tratamiento de infecciones fúngicas superficiales inflamatorias (como Tinea pedis, Tinea cruris) donde el alivio del picor y la inflamación es urgente. El Clotrimazol elimina el hongo y la Betametasona reduce la respuesta inflamatoria.",
                contraindicaciones = "Infecciones virales (herpes, varicela), tuberculosis cutánea, sífilis, rosácea y dermatitis perioral. No aplicar en heridas abiertas o mucosas. Hipersensibilidad a imidazoles.",
                conQueNoCombinar = "Evitar el uso simultáneo con otros corticosteroides sistémicos o tópicos potentes sin supervisión. No usar bajo vendajes oclusivos a menos que el médico lo indique.", 
                efectosSecundarios = "Adelgazamiento de la piel (atrofia), estrías, sensación de quemazón, picazón e irritación. El uso prolongado puede causar supresión del eje adrenal.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de medicamentos vencidos (Punto Azul).",
                datoExtra = "No debe usarse por más de 2 semanas seguidas. Aplicar una capa fina solo en la zona afectada."
            ),
            Medicamento(
                id = 45, nombre = "Betametasona + Neomicina 10g", principioActivo = "Betametasona, Neomicina",
                categoria = AppDestinations.DERMATOLOGICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                imagenUrl = getUrl("betametasona + neomicina 10g ungueto dérmico.jpeg"), especificacion = "Ungüento dérmico 10g",
                familiaFarmacologica = "Corticosteroide asociado a antibiótico aminoglucósido", 
                paraQueSirve = "Tratamiento de dermatosis que responden a corticoides cuando existe una infección bacteriana secundaria o riesgo de ella. Útil en eczemas infectados y dermatitis seborreica complicada.",
                contraindicaciones = "Infecciones virales, fúngicas o tuberculosas de la piel. Hipersensibilidad a la neomicina (frecuente) o betametasona. No aplicar en el conducto auditivo si hay sospecha de perforación timpánica.",
                conQueNoCombinar = "Uso extenso con otros aminoglucósidos sistémicos (por riesgo de ototoxicidad y nefrotoxicidad si hay absorción sistémica).", 
                efectosSecundarios = "Dermatitis de contacto alérgica (por neomicina), foliculitis, hipertricosis, hipopigmentación.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul en farmacias.",
                datoExtra = "La neomicina es un sensibilizante común; si la zona se pone más roja o irritada tras la aplicación, suspenda su uso."
            ),
            Medicamento(
                id = 46, nombre = "Betametasona 0,05% 15g", principioActivo = "Betametasona",
                categoria = AppDestinations.DERMATOLOGICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                imagenUrl = getUrl("betametasona 0,05%- 15g ungueto topico.jpeg"), especificacion = "Ungüento tópico 15g",
                familiaFarmacologica = "Corticosteroide tópico de alta potencia", 
                paraQueSirve = "Alivio de las manifestaciones inflamatorias y pruríticas de dermatosis crónicas que no responden a corticoides de baja potencia, como Psoriasis y Eczemas recalcitrantes.",
                contraindicaciones = "Acné vulgar, rosácea, dermatitis perioral, prurito anogenital e infecciones cutáneas primarias (virales, fúngicas o bacterianas) sin tratamiento.",
                conQueNoCombinar = "No utilizar en áreas extensas de la cara o pliegues de la piel (axilas, ingles) por tiempo prolongado debido a la alta tasa de absorción y riesgo de atrofia cutánea.", 
                efectosSecundarios = "Atrofia de la piel, telangiectasias (vasos sanguíneos visibles), estrías y erupciones acneiformes.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Llevar excedentes a farmacia.",
                datoExtra = "Se recomienda su aplicación una o dos veces al día. El uso en niños debe ser muy breve y bajo supervisión estricta."
            ),
            Medicamento(
                id = 57, nombre = "Hidrocortisona crema 1%", principioActivo = "Hidrocortisona",
                categoria = AppDestinations.DERMATOLOGICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                imagenUrl = getUrl("hidrocortisona Crema tópica 1% 15g.jpeg"), especificacion = "Crema tópica 15g",
                familiaFarmacologica = "Corticosteroide tópico de baja potencia (Clase IV)", 
                paraQueSirve = "Alivio temporal de la picazón e inflamación asociadas con irritaciones menores de la piel, picaduras de insectos, dermatitis de contacto y eccema leve. Es el corticoide más seguro para zonas de piel fina.",
                contraindicaciones = "Hipersensibilidad al componente. Lesiones tuberculosas, fúngicas o virales en el sitio de aplicación.",
                conQueNoCombinar = "Evitar el uso de pañales ajustados o calzones de plástico si se aplica en el área del pañal de un niño, ya que actúan como vendajes oclusivos aumentando la absorción sistémica.", 
                efectosSecundarios = "Muy raros a dosis bajas. Ocasionalmente irritación local leve.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor autorizado.",
                datoExtra = "Es el corticoide de elección para uso en la cara o en niños por periodos cortos, debido a su bajo riesgo de efectos sistémicos."
            ),
            Medicamento(
                id = 270, nombre = "Bacitracina con neomicina", principioActivo = "Bacitracina, Neomicina",
                categoria = AppDestinations.DERMATOLOGICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                imagenUrl = getUrl("Bacitracina con neomicina ungueto dérmico.png"), especificacion = "Ungüento dérmico",
                familiaFarmacologica = "Asociación de antibióticos tópicos",
                paraQueSirve = "Prevención y tratamiento de infecciones bacterianas superficiales de la piel en cortes menores, raspaduras y quemaduras leves. La Bacitracina actúa contra Gram-positivos y la Neomicina contra Gram-negativos.",
                contraindicaciones = "Hipersensibilidad conocida a aminoglucósidos. No aplicar en áreas extensas de piel dañada o quemaduras graves por riesgo de absorción sistémica y daño renal o auditivo.",
                conQueNoCombinar = "Otros aminoglucósidos sistémicos y diuréticos potentes como Furosemida.",
                efectosSecundarios = "Reacciones de hipersensibilidad, enrojecimiento, descamación o falla en la cicatrización si hay alergia al componente.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Punto Azul.",
                datoExtra = "No utilizar por más de 7 días. Si la infección persiste, consulte al médico para una terapia sistémica."
            ),
            Medicamento(
                id = 271, nombre = "Clobetasol Propionato 0,05%", principioActivo = "Clobetasol propionato",
                categoria = AppDestinations.DERMATOLOGICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                imagenUrl = getUrl("Clobetasol Propinato ungueto tópico 25g-0,05%.png"), especificacion = "Ungüento tópico 0,05%",
                familiaFarmacologica = "Corticosteroide tópico de MUY alta potencia (Clase I)",
                paraQueSirve = "Tratamiento a corto plazo de las manifestaciones inflamatorias y pruríticas de dermatosis resistentes que no responden a otros corticosteroides, como Psoriasis recalcitrante y Liquen plano severo.",
                contraindicaciones = "Rosácea, acné, infecciones cutáneas no tratadas, dermatitis perioral y niños menores de 12 años. Está estrictamente prohibido su uso en la cara, axilas o ingles.",
                conQueNoCombinar = "No utilizar con vendajes oclusivos. Evitar el uso simultáneo con otros corticoides potentes.",
                efectosSecundarios = "Atrofia cutánea severa, estrías permanentes, hipertricosis e hipopigmentación. Riesgo significativo de supresión suprarrenal si se usa en superficies grandes (>10% del cuerpo).",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Llevar excedentes a Punto Azul. Es un fármaco de alta potencia que requiere manejo cuidadoso.",
                datoExtra = "LIMITACIÓN: El tratamiento no debe exceder las 2 semanas continuas ni una dosis total de 50g por semana."
            ),
            Medicamento(
                id = 272, nombre = "Mupirocina 2%", principioActivo = "Mupirocina",
                categoria = AppDestinations.DERMATOLOGICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                imagenUrl = getUrl("Mupirocina Ungueto tópico 2%.png"), especificacion = "Ungüento tópico 2%",
                familiaFarmacologica = "Antibiótico tópico (Derivado del ácido pseudomónico)",
                paraQueSirve = "Antibiótico producido por Pseudomonas fluorescens que inhibe la síntesis proteica bacteriana. Altamente eficaz contra Staphylococcus aureus (incluyendo cepas resistentes a meticilina) y Streptococcus. Indicado en Impétigo, foliculitis y heridas infectadas.",
                contraindicaciones = "Hipersensibilidad a la mupirocina o al polietilenglicol (PEG). No apto para uso oftálmico ni intranasal (existen presentaciones específicas para ello).",
                conQueNoCombinar = "No mezclar con otras preparaciones tópicas en la misma zona de piel, ya que puede diluirse la concentración del antibiótico y perder eficacia.",
                efectosSecundarios = "Quemazón local, picazón, eritema o sequedad en la zona de aplicación.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia.",
                datoExtra = "Si se usa para el tratamiento del impétigo, se debe aplicar 3 veces al día durante 5 a 10 días."
            )
        )
    }
}
