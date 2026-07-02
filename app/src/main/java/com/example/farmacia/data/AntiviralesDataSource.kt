package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AntiviralesDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 300, nombre = "Aciclovir 200 mg", principioActivo = "Aciclovir",
                categoria = AppDestinations.ANTIVIRALES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Aciclovir 200mg.png"), especificacion = "200 mg",
                familiaFarmacologica = "Antiviral (Análogo de nucleósido)",
                paraQueSirve = "Tratamiento de infecciones por virus del herpes simple en la piel y mucosas.",
                contraindicaciones = "Hipersensibilidad al aciclovir o valaciclovir.",
                conQueNoCombinar = "Probenecid, cimetidina, micofenolato de mofetilo (aumentan niveles de aciclovir).",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 301, nombre = "Aciclovir 400 mg", principioActivo = "Aciclovir",
                categoria = AppDestinations.ANTIVIRALES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Aciclovir 400mg.png"), especificacion = "400 mg",
                familiaFarmacologica = "Antiviral",
                paraQueSirve = "Prevención de infecciones recurrentes por herpes simple e infecciones por herpes zóster.",
                conQueNoCombinar = "Medicamentos que afecten la función renal, probenecid.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 302, nombre = "Aciclovir 5% crema", principioActivo = "Aciclovir",
                categoria = AppDestinations.ANTIVIRALES, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                imagenUrl = getUrl("Aciclovir 5% crema dermica.png"), especificacion = "Crema dérmica 5%",
                familiaFarmacologica = "Antiviral tópico",
                paraQueSirve = "Tratamiento de herpes labial y genital inicial y recurrente.",
                conQueNoCombinar = "Otros productos tópicos en la misma zona sin indicación médica.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 303, nombre = "Aciclovir 3% ungüento oftalmico", principioActivo = "Aciclovir",
                categoria = AppDestinations.ANTIVIRALES, formaFarmaceutica = FormaFarmaceutica.OTRO,
                imagenUrl = getUrl("Aciclovir 3% ungueto oftalmico.png"), especificacion = "Ungüento oftálmico 3%",
                familiaFarmacologica = "Antiviral oftálmico",
                paraQueSirve = "Tratamiento de la queratitis por herpes simple.",
                conQueNoCombinar = "Otras pomadas o colirios oftálmicos al mismo tiempo.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 304, nombre = "Valaciclovir 500 mg", principioActivo = "Valaciclovir",
                categoria = AppDestinations.ANTIVIRALES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Valaciclovir 500mg.png"), especificacion = "500 mg",
                familiaFarmacologica = "Antiviral (Profármaco de aciclovir)",
                paraQueSirve = "Tratamiento del herpes zóster y herpes labial.",
                conQueNoCombinar = "Cimetidina, probenecid, medicamentos nefrotóxicos.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 305, nombre = "Oseltamivir 75 mg", principioActivo = "Oseltamivir",
                categoria = AppDestinations.ANTIVIRALES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Oseltamivir 75mg.png"), especificacion = "75 mg",
                familiaFarmacologica = "Inhibidor de la neuraminidasa",
                paraQueSirve = "Tratamiento y prevención de la gripe (influenza) tipo A y B.",
                conQueNoCombinar = "Vacuna viva atenuada contra la gripe (usar 2 semanas antes o 48h después).",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 306, nombre = "Oseltamivir 12 mg/ml", principioActivo = "Oseltamivir",
                categoria = AppDestinations.ANTIVIRALES, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Oseltamivir 12mg - ml solucion oral.png"), especificacion = "Suspensión oral 12 mg/ml",
                familiaFarmacologica = "Antiviral",
                paraQueSirve = "Gripe en niños o pacientes con dificultad para tragar.",
                conQueNoCombinar = "Clorpropamida, metotrexato, fenilbutazona.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 307, nombre = "Emtricitabina + Tenofovir", principioActivo = "Emtricitabina, Tenofovir disoproxil fumarato",
                categoria = AppDestinations.ANTIVIRALES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Emtricitabina - tenofovir disoproxil fumarato.png"), especificacion = "Comprimido",
                familiaFarmacologica = "Antirretroviral (ITRAN)",
                paraQueSirve = "Tratamiento de la infección por VIH-1 y profilaxis pre-exposición (PrEP).",
                contraindicaciones = "Hipersensibilidad, no usar para PrEP en personas con VIH positivo o desconocido.",
                conQueNoCombinar = "Otros medicamentos que contengan emtricitabina, tenofovir, lamivudina o adefovir dipivoxil; AINEs en dosis altas.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
