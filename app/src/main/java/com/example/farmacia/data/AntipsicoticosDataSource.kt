package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AntipsicoticosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 320, nombre = "Quetiapina 25 mg", principioActivo = "Quetiapina",
                categoria = AppDestinations.ANTIPSICOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Quetiapina 25mg.png"), especificacion = "25 mg",
                familiaFarmacologica = "Antipsicótico atípico",
                paraQueSirve = "Tratamiento de la esquizofrenia y trastornos bipolares.",
                contraindicaciones = "Hipersensibilidad, administración concomitante de inhibidores del citocromo P450 3A4.",
                conQueNoCombinar = "Alcohol, otros depresores del SNC, ketoconazol, eritromicina.",
                tipoReceta = "Receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 321, nombre = "Quetiapina 100 mg", principioActivo = "Quetiapina",
                categoria = AppDestinations.ANTIPSICOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Quetiapina 100mg.png"), especificacion = "100 mg",
                familiaFarmacologica = "Antipsicótico atípico",
                paraQueSirve = "Tratamiento de episodios maníacos y depresivos asociados al trastorno bipolar.",
                conQueNoCombinar = "Alcohol, otros sedantes, anticonvulsivantes como fenitoína o carbamazepina.",
                tipoReceta = "Receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 322, nombre = "Quetiapina 200 mg", principioActivo = "Quetiapina",
                categoria = AppDestinations.ANTIPSICOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Quetiapina 200mg.png"), especificacion = "200 mg",
                familiaFarmacologica = "Antipsicótico atípico",
                paraQueSirve = "Control de síntomas psicóticos.",
                conQueNoCombinar = "Alcohol y fármacos que prolonguen el intervalo QT del corazón.",
                tipoReceta = "Receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 323, nombre = "Risperidona 1 mg/ml", principioActivo = "Risperidona",
                categoria = AppDestinations.ANTIPSICOTICOS, formaFarmaceutica = FormaFarmaceutica.SOLUCION_ORAL,
                imagenUrl = getUrl("Risperidona 1mg - ml solucion oral 30 ml.png"), especificacion = "Solución oral 1 mg/ml",
                familiaFarmacologica = "Antipsicótico atípico",
                paraQueSirve = "Tratamiento de la esquizofrenia y episodios maníacos de moderados a graves.",
                conQueNoCombinar = "Alcohol, otros depresores del SNC, levodopa y otros agonistas dopaminérgicos.",
                tipoReceta = "Receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 324, nombre = "Risperidona 1 mg", principioActivo = "Risperidona",
                categoria = AppDestinations.ANTIPSICOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Risperidona 1mg.png"), especificacion = "1 mg",
                familiaFarmacologica = "Antipsicótico",
                paraQueSirve = "Tratamiento de la irritabilidad asociada al trastorno autista.",
                conQueNoCombinar = "Medicamentos que bajen la presión arterial, diuréticos, alcohol.",
                tipoReceta = "Receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 325, nombre = "Risperidona 3 mg", principioActivo = "Risperidona",
                categoria = AppDestinations.ANTIPSICOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Risperidona 3mg.png"), especificacion = "3 mg",
                familiaFarmacologica = "Antipsicótico",
                paraQueSirve = "Control a largo plazo de la esquizofrenia.",
                conQueNoCombinar = "Antidepresivos fluoxetina y paroxetina (pueden aumentar niveles de risperidona).",
                tipoReceta = "Receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 326, nombre = "Haloperidol 1 mg", principioActivo = "Haloperidol",
                categoria = AppDestinations.ANTIPSICOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Haloperidol 1mg.png"), especificacion = "1 mg",
                familiaFarmacologica = "Antipsicótico típico (Butirofenona)",
                paraQueSirve = "Tratamiento de psicosis, agitación psicomotriz y tics (Síndrome de Tourette).",
                contraindicaciones = "Estado de coma, depresión del SNC por alcohol, enfermedad de Parkinson.",
                conQueNoCombinar = "Alcohol, litio, adrenalina, otros depresores del sistema nervioso central.",
                tipoReceta = "Receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 327, nombre = "Haloperidol 5 mg", principioActivo = "Haloperidol",
                categoria = AppDestinations.ANTIPSICOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Haloperidol 5mg.png"), especificacion = "5 mg",
                familiaFarmacologica = "Antipsicótico",
                paraQueSirve = "Control de alucinaciones y delirios en esquizofrenia aguda y crónica.",
                conQueNoCombinar = "Medicamentos que prolonguen el intervalo QT, metildopa, alcohol.",
                tipoReceta = "Receta médica retenida",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
