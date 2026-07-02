package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AntihipertensivosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 280, nombre = "Espironolactona 25 mg", principioActivo = "Espironolactona",
                categoria = AppDestinations.ANTIHIPERTENSIVOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Espironolactona 25mg.png"), especificacion = "25 mg",
                familiaFarmacologica = "Antagonista de la aldosterona (Diurético ahorrador de potasio)",
                paraQueSirve = "Tratamiento de la hipertensión y el edema.",
                contraindicaciones = "Hiperpotasemia, insuficiencia renal grave.",
                conQueNoCombinar = "Suplementos de potasio, otros diuréticos ahorradores de potasio, IECA, ARA-II, AINEs.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 281, nombre = "Furosemida 40 mg", principioActivo = "Furosemida",
                categoria = AppDestinations.ANTIHIPERTENSIVOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Furosemida 40mg.png"), especificacion = "40 mg",
                familiaFarmacologica = "Diurético de asa",
                paraQueSirve = "Tratamiento del edema y la hipertensión.",
                contraindicaciones = "Insuficiencia renal con anuria, hipopotasemia grave.",
                conQueNoCombinar = "Aminoglucósidos (ototoxicidad), litio, digoxina, AINEs, antidiabéticos.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 282, nombre = "Hidroclorotiazida 50 mg", principioActivo = "Hidroclorotiazida",
                categoria = AppDestinations.ANTIHIPERTENSIVOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Hidroclorotiazida 50mg.png"), especificacion = "50 mg",
                familiaFarmacologica = "Diurético tiazídico",
                paraQueSirve = "Tratamiento de la hipertensión arterial.",
                conQueNoCombinar = "Litio, alcohol, barbitúricos, narcóticos, otros antihipertensivos.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 283, nombre = "Enalapril maleato 10 mg", principioActivo = "Enalapril maleato",
                categoria = AppDestinations.ANTIHIPERTENSIVOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Enalapril maleato 10mg.png"), especificacion = "10 mg",
                familiaFarmacologica = "IECA (Inhibidor de la Enzima Convertidora de Angiotensina)",
                paraQueSirve = "Tratamiento de la hipertensión arterial y la insuficiencia cardíaca.",
                contraindicaciones = "Antecedentes de angioedema, embarazo.",
                conQueNoCombinar = "Diuréticos ahorradores de potasio, suplementos de potasio, litio, AINEs.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 284, nombre = "Enalapril maleato 20 mg", principioActivo = "Enalapril maleato",
                categoria = AppDestinations.ANTIHIPERTENSIVOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Enalapil maleato 20 mg.png"), especificacion = "20 mg",
                familiaFarmacologica = "IECA",
                paraQueSirve = "Hipertensión esencial de cualquier grado.",
                conQueNoCombinar = "Alcohol, otros antihipertensivos, oro inyectable.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 285, nombre = "Amlodipino 5 mg", principioActivo = "Amlodipino",
                categoria = AppDestinations.ANTIHIPERTENSIVOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Amlopidino 5mg.png"), especificacion = "5 mg",
                familiaFarmacologica = "Antagonista del calcio (Dihidropiridina)",
                paraQueSirve = "Tratamiento de la hipertensión y la angina de pecho.",
                conQueNoCombinar = "Simvastatina (dosis >20mg), jugo de pomelo, inhibidores potentes de CYP3A4.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 286, nombre = "Amlodipino 10 mg", principioActivo = "Amlodipino",
                categoria = AppDestinations.ANTIHIPERTENSIVOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Amlopidino 10mg.png"), especificacion = "10 mg",
                familiaFarmacologica = "Antagonista del calcio",
                paraQueSirve = "Control de la presión arterial elevada.",
                conQueNoCombinar = "Ciclosporina, tacrolimus, claritromicina.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 287, nombre = "Olmesartán medoxomilo 20 mg", principioActivo = "Olmesartán medoxomilo",
                categoria = AppDestinations.ANTIHIPERTENSIVOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Olmesartan medoxomilo 20mg.png"), especificacion = "20 mg",
                familiaFarmacologica = "ARA-II (Antagonista de los Receptores de Angiotensina II)",
                paraQueSirve = "Tratamiento de la hipertensión arterial.",
                conQueNoCombinar = "Suplementos de potasio, diuréticos ahorradores de potasio, litio, AINEs.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 288, nombre = "Olmesartán + Amlodipino 20/5 mg", principioActivo = "Olmesartán medoxomilo, Amlodipino",
                categoria = AppDestinations.ANTIHIPERTENSIVOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Olmesartan medoxomilo amlodipino 20mg 5mg.png"), especificacion = "20 mg / 5 mg",
                familiaFarmacologica = "Asociación de ARA-II y Antagonista del calcio",
                paraQueSirve = "Tratamiento de la hipertensión esencial.",
                conQueNoCombinar = "Alcohol, pomelo, suplementos de potasio, otros hipotensores.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 289, nombre = "Olmesartán + Hidroclorotiazida 20/12,5 mg", principioActivo = "Olmesartán medoxomilo, Hidroclorotiazida",
                categoria = AppDestinations.ANTIHIPERTENSIVOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("olmesartan medoxomilo hidroclorotiazida 20mg - 12,5mg.png"), especificacion = "20 mg / 12,5 mg",
                familiaFarmacologica = "Asociación de ARA-II y Diurético",
                paraQueSirve = "Control de la presión arterial en pacientes que no responden a la monoterapia.",
                conQueNoCombinar = "Alcohol, litio, medicamentos para la diabetes, resinas de intercambio iónico.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 290, nombre = "Losartán potásico 50 mg", principioActivo = "Losartán potásico",
                categoria = AppDestinations.ANTIHIPERTENSIVOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Losartan potasico 50mg.png"), especificacion = "50 mg",
                familiaFarmacologica = "ARA-II",
                paraQueSirve = "Tratamiento de la hipertensión arterial.",
                conQueNoCombinar = "Fluconazol, rifampicina, suplementos de potasio, litio.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 291, nombre = "Losartán potásico 100 mg", principioActivo = "Losartán potásico",
                categoria = AppDestinations.ANTIHIPERTENSIVOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Losartan potasico 100mg.png"), especificacion = "100 mg",
                familiaFarmacologica = "ARA-II",
                paraQueSirve = "Hipertensión y reducción del riesgo de accidente cerebrovascular.",
                conQueNoCombinar = "Diuréticos que retengan potasio, AINEs, alcohol.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
