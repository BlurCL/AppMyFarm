package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object CorticoidesDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 16, nombre = "Dexametasona 4mg", principioActivo = "Dexametasona",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Cortyk dexametasona 4mg.jpeg"), especificacion = "Comprimido de 4 mg",
                familiaFarmacologica = "Glucocorticoide sintético de acción prolongada", 
                paraQueSirve = "Tratamiento de afecciones inflamatorias severas, reacciones alérgicas agudas y trastornos autoinmunes.",
                contraindicaciones = "Infecciones sistémicas por hongos, hipersensibilidad, administración de vacunas de virus vivos.",
                conQueNoCombinar = "AINEs (aumenta riesgo de úlceras), antidiabéticos (aumenta glucosa), diuréticos que eliminan potasio.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 47, nombre = "Betametasona inyectable 4mg/1ml", principioActivo = "Betametasona sodio fosfato",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.INYECTABLE,
                imagenUrl = getUrl("betametasona sodio fosfato 4mg-1ml solucion inyectable.jpeg"), especificacion = "Solución inyectable",
                familiaFarmacologica = "Corticosteroide sistémico de alta potencia", 
                paraQueSirve = "Inflamaciones agudas que requieren respuesta rápida, alergias severas y choque.",
                contraindicaciones = "Hipersensibilidad, infecciones micóticas sistémicas, infecciones virales activas.",
                conQueNoCombinar = "Anticoagulantes orales, vacunas de virus vivos atenuados.", 
                comoDesechar = "Contenedor de material cortopunzante/clínico"
            ),
            Medicamento(
                id = 56, nombre = "Hidrocortisona 20mg", principioActivo = "Hidrocortisona",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("hidrocortisona 20mg.jpeg"), especificacion = "Comprimido de 20 mg",
                familiaFarmacologica = "Glucocorticoide de acción corta", 
                paraQueSirve = "Terapia de reemplazo en insuficiencia suprarrenal primaria o secundaria y afecciones inflamatorias.",
                contraindicaciones = "Hipersensibilidad, infecciones sistémicas no tratadas.",
                conQueNoCombinar = "Antiinflamatorios no esteroideos (AINEs), inductores enzimáticos como fenitoína.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 62, nombre = "Metilprednisolona", principioActivo = "Metilprednisolona",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("medrol metilprednisolona 16mg.jpeg"), especificacion = "Comprimido de 16 mg",
                familiaFarmacologica = "Glucocorticoide sintético de acción intermedia", 
                paraQueSirve = "Enfermedades autoinmunes, exacerbaciones de asma severo y brotes de esclerosis múltiple.",
                contraindicaciones = "Infecciones sistémicas micóticas, hipersensibilidad.",
                conQueNoCombinar = "AINEs, inhibidores del CYP3A4, zumo de pomelo.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 63, nombre = "Metilprednisolona 4mg", principioActivo = "Metilprednisolona",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("medrol metilprednisolona 4mg.jpeg"), especificacion = "Comprimido de 4 mg",
                familiaFarmacologica = "Glucocorticoide sintético", 
                paraQueSirve = "Procesos inflamatorios crónicos, alérgicos y reumáticos.",
                contraindicaciones = "Hipersensibilidad, tuberculosis activa no tratada.",
                conQueNoCombinar = "Digoxina, rifampicina, ketoconazol.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 67, nombre = "Prednisona 20mg", principioActivo = "Prednisona",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("prednisona 20mg.jpeg"), especificacion = "Comprimido de 20 mg",
                familiaFarmacologica = "Glucocorticoide sintético", 
                paraQueSirve = "Tratamiento de asma, artritis reumatoide, procesos alérgicos y enfermedades inflamatorias.",
                contraindicaciones = "Osteoporosis grave, psicosis no controlada, infecciones virales o micóticas activas.",
                conQueNoCombinar = "AINEs, alcohol, vacunas de virus vivos, antidiabéticos.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 68, nombre = "Prednisona 5mg", principioActivo = "Prednisona",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("prednisona 5mg.jpeg"), especificacion = "Comprimido de 5 mg",
                familiaFarmacologica = "Glucocorticoide sintético", 
                paraQueSirve = "Mantenimiento antiinflamatorio y control de alergias crónicas.",
                contraindicaciones = "Hipersensibilidad al principio activo.",
                conQueNoCombinar = "Sales de calcio, antiácidos, antibióticos inductores.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 69, nombre = "Prednisona suspensión 20mg/5ml", principioActivo = "Prednisona",
                categoria = AppDestinations.CORTICOIDES, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("prednisona suspencion oral 20mg-5ml de 60ml.jpeg"), especificacion = "Suspensión oral de 60ml",
                familiaFarmacologica = "Glucocorticoide sintético", 
                paraQueSirve = "Alivio de inflamaciones agudas en pediatría, como laringitis o crisis asmáticas.",
                contraindicaciones = "Niños con infecciones sistémicas activas sin cobertura antibiótica.",
                conQueNoCombinar = "AINEs, vacunas vivas, carbamazepina.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
