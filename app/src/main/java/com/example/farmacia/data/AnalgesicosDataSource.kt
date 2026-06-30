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
                familiaFarmacologica = "AINE / Antiagregante plaquetario",
                paraQueSirve = "Prevención cardiovascular y dolor leve.",
                contraindicaciones = "Hipersensibilidad a salicilatos, úlcera activa.",
                conQueNoCombinar = "Anticoagulantes, otros AINEs.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 112, nombre = "Etoricoxib 90mg", principioActivo = "Etoricoxib",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Etoricoxib 90mg.png"), especificacion = "Comprimido recubierto",
                familiaFarmacologica = "AINE inhibidor COX-2",
                paraQueSirve = "Artrosis, artritis reumatoide.",
                contraindicaciones = "Insuficiencia renal/hepática grave.",
                conQueNoCombinar = "Anticoagulantes.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 113, nombre = "Etoricoxib 120mg", principioActivo = "Etoricoxib",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Etoricoxib 120mg.png"), especificacion = "Comprimido recubierto",
                familiaFarmacologica = "AINE inhibidor COX-2",
                paraQueSirve = "Dolor agudo (gota, cirugía dental).",
                contraindicaciones = "Enfermedad isquémica cardíaca.",
                conQueNoCombinar = "Litio.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 114, nombre = "Etoricoxib 60mg", principioActivo = "Etoricoxib",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Etoricoxib 60mg.png"), especificacion = "Comprimido recubierto",
                familiaFarmacologica = "AINE inhibidor COX-2",
                paraQueSirve = "Artrosis.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "Anticoagulantes orales.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 115, nombre = "Celecoxib 200mg", principioActivo = "Celecoxib",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Celecoxib 200mg.png"), especificacion = "Cápsula de 200 mg",
                familiaFarmacologica = "AINE inhibidor COX-2",
                paraQueSirve = "Artrosis y artritis reumatoide.",
                contraindicaciones = "Hipersensibilidad a sulfonamidas.",
                conQueNoCombinar = "Fluconazol, litio.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 116, nombre = "Ketorolaco trometamol 30ml-1ml inyectable", principioActivo = "Ketorolaco trometamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.INYECTABLE,
                esAINE = true,
                imagenUrl = getUrl("Ketorolaco trometamol 30ml-1ml inyectable.png"), especificacion = "Ampolla de 1 ml",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor moderado a severo postoperatorio.",
                contraindicaciones = "Úlcera péptica activa.",
                conQueNoCombinar = "Otros AINEs, litio.",
                comoDesechar = "Contenedor de residuos peligrosos"
            ),
            Medicamento(
                id = 117, nombre = "Ketorolaco trometamol 30mg", principioActivo = "Ketorolaco trometamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Ketorolaco trometamol 30mg.png"), especificacion = "Comprimido de 30 mg",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor postoperatorio (máximo 5 días).",
                contraindicaciones = "Insuficiencia renal.",
                conQueNoCombinar = "Anticoagulantes.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 118, nombre = "Ketorolaco trometamol 10mg", principioActivo = "Ketorolaco trometamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Ketorolaco trometamol 10mg.png"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor moderado a severo.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "Aspirina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 119, nombre = "Diclofenaco gel 1,16%", principioActivo = "Diclofenaco dietilamina",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco dietilamina 1,16% 30g gel topico.png"), especificacion = "Tubo de 30 g",
                familiaFarmacologica = "AINE tópico",
                paraQueSirve = "Alivio local del dolor e inflamación.",
                contraindicaciones = "Heridas abiertas.",
                conQueNoCombinar = "Otros productos tópicos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 120, nombre = "Diclofenaco 50mg supositorio", principioActivo = "Diclofenaco sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.OTRO,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco sódico 50mg supositorio.png"), especificacion = "Supositorio",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor e inflamación vía rectal.",
                contraindicaciones = "Hemorroides activas.",
                conQueNoCombinar = "AINEs.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 122, nombre = "Diclofenaco 100mg LP", principioActivo = "Diclofenaco sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco sódico 100mg.png"), especificacion = "Comprimido liberación prolongada",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor e inflamación crónica.",
                contraindicaciones = "Insuficiencia cardíaca.",
                conQueNoCombinar = "Litio.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 123, nombre = "Diclofenaco 25mg", principioActivo = "Diclofenaco sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco sódico 25mg.png"), especificacion = "Comprimido",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor leve a moderado.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "Otros AINEs.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 124, nombre = "Diclofenaco 50mg", principioActivo = "Diclofenaco sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco de sodio 50mg.png"), especificacion = "Comprimido",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Artritis reumatoide, artrosis.",
                contraindicaciones = "Úlcera gástrica.",
                conQueNoCombinar = "Metotrexato.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 106, nombre = "Diclofenaco Sódico-Tramadol Clorhidrato 25mg-25mg", principioActivo = "Diclofenaco, Tramadol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco Sódico-Tramadol Clorhidrato 25mg-25mg.png"), especificacion = "Cápsula",
                familiaFarmacologica = "Analgésico combinado (AINE + Opioide)",
                paraQueSirve = "Alivio del dolor moderado a severo.",
                contraindicaciones = "Úlcera péptica activa, insuficiencia renal/hepática grave.",
                conQueNoCombinar = "Alcohol, IMAOs, otros AINEs, anticoagulantes.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 125, nombre = "Naproxeno Sódico 550mg", principioActivo = "Naproxeno sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Naproxeno Sódico 550mg.png"), especificacion = "Comprimido de 550 mg",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor moderado a severo, inflamación.",
                contraindicaciones = "Alergia a AINEs.",
                conQueNoCombinar = "Litio, antihipertensivos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 126, nombre = "Ibuprofeno 100mg/5ml", principioActivo = "Ibuprofeno",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                esAINE = true,
                imagenUrl = getUrl("Ibuprofeno 100mg-5ml100ml suspension oral.png"), especificacion = "Frasco de 100 ml",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Fiebre y dolor en niños.",
                contraindicaciones = "Hipersensibilidad, úlcera.",
                conQueNoCombinar = "Anticoagulantes.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 127, nombre = "Ibuprofeno 200mg/5ml", principioActivo = "Ibuprofeno",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                esAINE = true,
                imagenUrl = getUrl("Ibuprofeno 200mg-5ml 100ml suspension oral.png"), especificacion = "Frasco de 100 ml",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Fiebre y dolor en niños.",
                contraindicaciones = "Alergia a AINEs.",
                conQueNoCombinar = "Diuréticos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 128, nombre = "Ibuprofeno crema 5%", principioActivo = "Ibuprofeno",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                esAINE = true,
                imagenUrl = getUrl("Ibuprofeno 5% 45mg crema.png"), especificacion = "Tubo de 45 g",
                familiaFarmacologica = "AINE tópico",
                paraQueSirve = "Contusiones, lumbalgia.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "Otros tópicos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 129, nombre = "Ibuprofeno 600mg", principioActivo = "Ibuprofeno",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Ibuprofeno 600mg.png"), especificacion = "Comprimido de 600 mg",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor intenso e inflamación.",
                contraindicaciones = "Hemorragia gastrointestinal.",
                conQueNoCombinar = "Alcohol.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 130, nombre = "Ibuprofeno 400mg", principioActivo = "Ibuprofeno",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Ibuprofeno 400mg.png"), especificacion = "Comprimido de 400 mg",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor menstrual, cefalea.",
                contraindicaciones = "Tercer trimestre de embarazo.",
                conQueNoCombinar = "Metotrexato.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
