package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object GastrointestinalesDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 23, nombre = "Famotidina 20mg", principioActivo = "Famotidina",
                categoria = AppDestinations.GASTROINTESTINALES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Famotidina 20mg"), especificacion = "Comprimido de 20 mg",
                familiaFarmacologica = "Antagonistas de los receptores H2 de histamina, también llamados \"bloqueadores H2\". Sirve para reducir la producción de ácido en el estómago.",
                paraQueSirve = "Tratamiento de la enfermedad por reflujo gastroesofágico y prevención de úlceras duodenales.",
                contraindicaciones = "- Hipersensibilidad a famotidina o a otros bloqueadores H2 como ranitidina, cimetidina.\n" +
                        "- Insuficiencia renal grave: se ajusta la dosis porque se elimina por riñón. Con clearance de creatinina <30 mL/min se da la mitad de dosis o se alarga el intervalo.\n" +
                        "- Precaución en embarazo y lactancia: categoría B, usar solo si el médico lo indica.\n" +
                        "- Precaución en adultos mayores: mayor riesgo de confusión mental.",
                conQueNoCombinar = "| *Ketoconazol, itraconazol* | Famotidina sube el pH gástrico y disminuye la absorción de estos antifúngicos | Separar dosis al menos 2 horas o evitar |\n" +
                        "| *Atazanavir, dasatinib* | Menor absorción de estos antivirales/antineoplásicos por el cambio de pH | Evitar combinar. Consultar médico |\n" +
                        "| *Hierro, vitamina B12* | Disminuye absorción a largo plazo porque necesitas ácido para absorberlos | Suplementar si usas famotidina por meses |\n" +
                        "| *Sucralfato* | Sucralfato reduce absorción de famotidina | Dar famotidina 2 horas antes de sucralfato |\n" +
                        "| *Alcohol* | Aumenta riesgo de irritación gástrica y potencia efectos en SNC | Evitar o moderar consumo |",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 24, nombre = "Famotidina 40mg", principioActivo = "Famotidina",
                categoria = AppDestinations.GASTROINTESTINALES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Famotidina 40mg"), especificacion = "Comprimido de 40 mg",
                familiaFarmacologica = "Antagonistas de los receptores H2 de histamina, también llamados \"bloqueadores H2\". Sirve para reducir la producción de ácido en el estómago.",
                paraQueSirve = "Tratamiento de úlceras gástricas y duodenales benignas y estados hipersecretores patológicos.",
                contraindicaciones = "- Hipersensibilidad a famotidina o a otros bloqueadores H2 como ranitidina, cimetidina.\n" +
                        "- Insuficiencia renal grave: se ajusta la dosis porque se elimina por riñón. Con clearance de creatinina <30 mL/min se da la mitad de dosis o se alarga el intervalo.\n" +
                        "- Precaución en embarazo y lactancia: categoría B, usar solo si el médico lo indica.\n" +
                        "- Precaución en adultos mayores: mayor riesgo de confusión mental.",
                conQueNoCombinar = "| Ketoconazol, itraconazol | Famotidina sube el pH gástrico y disminuye la absorción de estos antifúngicos | Separar dosis al menos 2 horas o evitar |\n" +
                        "| Atazanavir, dasatinib | Menor absorción de estos antivirales/antineoplásicos por el cambio de pH | Evitar combinar. Consultar médico |\n" +
                        "| Hierro, vitamina B12 | Disminuye absorción a largo plazo porque necesitas ácido para absorberlos | Suplementar si usas famotidina por meses |\n" +
                        "| Sucralfato* | Sucralfato reduce absorción de famotidina | Dar famotidina 2 horas antes de sucralfato |\n" +
                        "| Alcohol | Aumenta riesgo de irritación gástrica y potencia efectos en SNC | Evitar o moderar consumo |",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
