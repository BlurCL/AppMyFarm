package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AntipireticosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 131, 
                nombre = "Metamizol Sódico Monohidrato 300mg (Dipirona)", 
                principioActivo = "Metamizol sódico",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Metamizol Sódico Monohidrato 300mg(dipirona).png"), 
                especificacion = "Comprimido de 300 mg",
                familiaFarmacologica = "Pirazolona (Analgésico/Antipirético)",
                paraQueSirve = "Dolor severo y fiebre alta que no responde a otros antitérmicos.",
                contraindicaciones = "Hipersensibilidad, agranulocitosis previa, porfiria hepática.",
                conQueNoCombinar = "Ciclosporina, alcohol.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 132, 
                nombre = "Paracetamol 80mg", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Paracetamol 80mg.png"), 
                especificacion = "Comprimido masticable infantil",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Dolor y fiebre en lactantes y niños pequeños.",
                contraindicaciones = "Hipersensibilidad, insuficiencia hepática grave.",
                conQueNoCombinar = "Rifampicina, Isoniazida, Fenitoína, Carbamazepina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 133, 
                nombre = "Paracetamol 160mg/5ml", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Paracetamol 160mg-5ml 90ml.png"), 
                especificacion = "Suspensión oral 90 ml",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Fiebre y dolor en niños.",
                contraindicaciones = "Insuficiencia hepática.",
                conQueNoCombinar = "Anticonvulsivantes inductores hepáticos, alcohol.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 134, 
                nombre = "Paracetamol 160mg", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Paracetamol 160mg.png"), 
                especificacion = "Comprimido masticable",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Dolor y fiebre en niños.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "Otros productos con paracetamol.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 135, 
                nombre = "Paracetamol 1g", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Paracetamol 1g.png"), 
                especificacion = "Comprimido de 1 g",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Alivio del dolor moderado y reducción de la fiebre en adultos.",
                contraindicaciones = "Insuficiencia hepatocelular grave.",
                conQueNoCombinar = "Alcohol, Warfarina (en dosis altas prolongadas).",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 136, 
                nombre = "Paracetamol Jarabe 120mg/5ml", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Paracetamol 120mg-5ml jarabe 100ml.png"), 
                especificacion = "Jarabe 100 ml",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Alivio de la fiebre y el dolor en niños.",
                contraindicaciones = "Alergia al paracetamol.",
                conQueNoCombinar = "Metoclopramida.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 137, 
                nombre = "Paracetamol Infantil Gotas 100mg/ml", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.SOLUCION_ORAL,
                imagenUrl = getUrl("Paracetamol infantil solucion oral 15ml 100mg-ml.png"), 
                especificacion = "Frasco gotario 15 ml",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Dolor y fiebre en lactantes.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "Rifampicina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 138, 
                nombre = "Paracetamol 125mg Supositorio", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.OTRO,
                imagenUrl = getUrl("Paracetamol 125 mg supositorio.png"), 
                especificacion = "Supositorio infantil",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Alivio de fiebre y dolor cuando la vía oral no es posible.",
                contraindicaciones = "Cirugía reciente anorrectal, inflamación rectal.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 139, 
                nombre = "Paracetamol 500mg", 
                principioActivo = "Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, 
                formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Paracetamol 500 mg.png"), 
                especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Dolor y fiebre leve a moderada.",
                contraindicaciones = "Insuficiencia hepática.",
                conQueNoCombinar = "Consumo excesivo de alcohol.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 107, nombre = "Tramadol Clorhidrato 100mg", principioActivo = "Tramadol",
                categoria = AppDestinations.ANTIPIRETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tramadol Clorhidrato 100mg.png"), especificacion = "Comprimido",
                familiaFarmacologica = "Analgésico opioide",
                paraQueSirve = "Dolor moderado a severo.",
                contraindicaciones = "Intoxicación aguda con alcohol, hipnóticos o analgésicos centrales.",
                conQueNoCombinar = "Inhibidores de la MAO, alcohol, benzodiacepinas.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 108, nombre = "Tramadol Clorhidrato-Paracetamol 17,5-325mg", principioActivo = "Tramadol, Paracetamol",
                categoria = AppDestinations.ANTIPIRETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tramadol Clorhidrato-Paracetamol 17,5-325mg.png"), especificacion = "Comprimido",
                familiaFarmacologica = "Analgésico combinado",
                paraQueSirve = "Tratamiento del dolor moderado a severo.",
                contraindicaciones = "Hipersensibilidad, insuficiencia hepática grave.",
                conQueNoCombinar = "Alcohol, IMAOs, paracetamol adicional.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 109, nombre = "Tramadol Clorhidrato 100mg-ml 10ml solucion gotitas oral", principioActivo = "Tramadol",
                categoria = AppDestinations.ANTIPIRETICOS, formaFarmaceutica = FormaFarmaceutica.SOLUCION_ORAL,
                imagenUrl = getUrl("Tramadol Clorhidrato 100mg-ml 10ml solucion gotitas oral.png"), especificacion = "Frasco gotario de 10 ml",
                familiaFarmacologica = "Analgésico opioide",
                paraQueSirve = "Dolor moderado a intenso.",
                contraindicaciones = "Pacientes con epilepsia no controlada, insuficiencia respiratoria grave.",
                conQueNoCombinar = "Alcohol, sedantes.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 110, nombre = "Tramadol Clorhidrato 50mg", principioActivo = "Tramadol",
                categoria = AppDestinations.ANTIPIRETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tramadol Clorhidrato 50mg.png"), especificacion = "Cápsula de 50 mg",
                familiaFarmacologica = "Analgésico opioide",
                paraQueSirve = "Dolor moderado a severo.",
                contraindicaciones = "Hipersensibilidad al tramadol o a otros opioides.",
                conQueNoCombinar = "Alcohol, carbamazepina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
