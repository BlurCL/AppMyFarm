package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AnalgesicosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 101, nombre = "Pregabalina 150mg", principioActivo = "Pregabalina",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Pregabalina 150mg.png"), especificacion = "Cápsula de 150 mg",
                familiaFarmacologica = "Anticonvulsivante.\n" +
                        "Neuromodulador.\n" +
                        "Análogo estructural del GABA (aunque NO actúa directamente sobre receptores GABA).\n" +
                        "Modulador de canales de calcio dependientes de voltaje.",
                paraQueSirve = "Dolor neuropático: Ciática, neuralgia post-herpética, neuropatía diabética, dolor de nervio por compresión. Ahí es donde más rinde.",
                contraindicaciones = "No debe utilizarse o requiere extrema precaución en:\n" +
                        "\n" +
                        "Hipersensibilidad a pregabalina.\n" +
                        "Insuficiencia renal severa sin ajuste de dosis.\n" +
                        "Antecedentes de abuso de sustancias.\n" +
                        "Depresión respiratoria.\n" +
                        "Insuficiencia cardíaca congestiva.\n" +
                        "Embarazo sin evaluación médica.\n" +
                        "Lactancia.\n" +
                        "Adultos mayores frágiles.\n" +
                        "Pacientes con riesgo de suicidio.",
                conQueNoCombinar = "Alcohol, lorazepam, oxicodona.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 102, nombre = "Pregabalina 75mg", principioActivo = "Pregabalina",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Pregabalina 75mg.png"), especificacion = "Cápsula de 75 mg",
                familiaFarmacologica = "Anticonvulsivante.\n" +
                        "Neuromodulador.\n" +
                        "Análogo estructural del GABA (aunque NO actúa directamente sobre receptores GABA).\n" +
                        "Modulador de canales de calcio dependientes de voltaje.",
                paraQueSirve = "Dolor neuropático: Ciática, neuralgia post-herpética, neuropatía diabética, dolor de nervio por compresión. Ahí es donde más rinde.",
                contraindicaciones = "No debe utilizarse o requiere extrema precaución en:\n" +
                        "\n" +
                        "Hipersensibilidad a pregabalina.\n" +
                        "Insuficiencia renal severa sin ajuste de dosis.\n" +
                        "Antecedentes de abuso de sustancias.\n" +
                        "Depresión respiratoria.\n" +
                        "Insuficiencia cardíaca congestiva.\n" +
                        "Embarazo sin evaluación médica.\n" +
                        "Lactancia.\n" +
                        "Adultos mayores frágiles.\n" +
                        "Pacientes con riesgo de suicidio.",
                conQueNoCombinar = "Alcohol, depresores del SNC.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 103, nombre = "Pregabalina 50mg", principioActivo = "Pregabalina",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Pregabalina 50mg.png"), especificacion = "Cápsula de 50 mg",
                familiaFarmacologica = "Antiepiléptico / Analgésico para dolor neuropático",
                paraQueSirve = "Dolor neuropático: Ciática, neuralgia post-herpética, neuropatía diabética, dolor de nervio por compresión. Ahí es donde más rinde.",
                contraindicaciones = "No debe utilizarse o requiere extrema precaución en:\n" +
                        "\n" +
                        "Hipersensibilidad a pregabalina.\n" +
                        "Insuficiencia renal severa sin ajuste de dosis.\n" +
                        "Antecedentes de abuso de sustancias.\n" +
                        "Depresión respiratoria.\n" +
                        "Insuficiencia cardíaca congestiva.\n" +
                        "Embarazo sin evaluación médica.\n" +
                        "Lactancia.\n" +
                        "Adultos mayores frágiles.\n" +
                        "Pacientes con riesgo de suicidio.",
                conQueNoCombinar = "Alcohol.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 104, nombre = "Ciclobenzaprina Clorhidrato 10mg", principioActivo = "Ciclobenzaprina",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Ciclobenzaprina Clorhidrato 10mg.png"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "Relajante muscular de acción central",
                paraQueSirve = "Alivio de espasmos musculares asociados a afecciones agudas y dolorosas del sistema musculoesquelético.",
                contraindicaciones = "Hipersensibilidad, fase aguda post-infarto de miocardio, arritmias.",
                conQueNoCombinar = "Inhibidores de la MAO, alcohol, otros depresores del SNC.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 105, nombre = "Tiocolchicósido 8mg", principioActivo = "Tiocolchicósido",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tiocolchicósido 8mg.png"), especificacion = "Cápsula de 8 mg",
                familiaFarmacologica = "Relajante muscular",
                paraQueSirve = "Tratamiento adyuvante de contracturas musculares dolorosas en patología espinal aguda.",
                contraindicaciones = "Embarazo, lactancia, hipersensibilidad.",
                conQueNoCombinar = "Otros relajantes musculares.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 106, nombre = "Diclofenaco Sódico-Tramadol Clorhidrato 25mg-25mg", principioActivo = "Diclofenaco, Tramadol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco Sódico-Tramadol Clorhidrato 25mg-25mg.png"), especificacion = "Cápsula",
                familiaFarmacologica = "Analgésico combinado (AINE + Opioide)",
                paraQueSirve = "Alivio del dolor moderado a severo.",
                contraindicaciones = "Hipersensibilidad, úlcera péptica activa, insuficiencia renal/hepática grave.",
                conQueNoCombinar = "Alcohol, IMAOs, otros AINEs, anticoagulantes.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 107, nombre = "Tramadol Clorhidrato 100mg", principioActivo = "Tramadol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tramadol Clorhidrato 100mg.png"), especificacion = "Comprimido",
                familiaFarmacologica = "Analgésico opioide",
                paraQueSirve = "El tramadol es un analgésico opioide utilizado para tratar dolor moderado a severo cuando otros medicamentos como paracetamol o antiinflamatorios no son suficientes.",
                contraindicaciones = "Intoxicación aguda con alcohol, hipnóticos o analgésicos centrales.",
                conQueNoCombinar = "Inhibidores de la MAO, alcohol, benzodiacepinas.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 108, nombre = "Tramadol Clorhidrato-Paracetamol 17,5-325mg", principioActivo = "Tramadol, Paracetamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tramadol Clorhidrato-Paracetamol 17,5-325mg.png"), especificacion = "Comprimido",
                familiaFarmacologica = "Analgésico combinado",
                paraQueSirve = "Tratamiento del dolor moderado a severo.",
                contraindicaciones = "Hipersensibilidad, insuficiencia hepática grave.",
                conQueNoCombinar = "Alcohol, IMAOs, paracetamol adicional.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 109, nombre = "Tramadol Clorhidrato 100mg-ml 10ml solucion gotitas oral", principioActivo = "Tramadol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.SOLUCION_ORAL,
                imagenUrl = getUrl("Tramadol Clorhidrato 100mg-ml 10ml solucion gotitas oral.png"), especificacion = "Frasco gotario de 10 ml",
                familiaFarmacologica = "Analgésico opioide",
                paraQueSirve = "Dolor moderado a intenso.",
                contraindicaciones = "Pacientes con epilepsia no controlada, insuficiencia respiratoria grave.",
                conQueNoCombinar = "Alcohol, sedantes.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 110, nombre = "Tramadol Clorhidrato 50mg", principioActivo = "Tramadol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tramadol Clorhidrato 50mg.png"), especificacion = "Cápsula de 50 mg",
                familiaFarmacologica = "Analgésico opioide",
                paraQueSirve = "Dolor moderado a severo.",
                contraindicaciones = "Hipersensibilidad al tramadol o a otros opioides.",
                conQueNoCombinar = "Alcohol, carbamazepina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 111, nombre = "Ácido Acetilsalicílico 100mg", principioActivo = "Ácido Acetilsalicílico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Ácido Acetilsalicílico 100mg.png"), especificacion = "Comprimido de 100 mg",
                familiaFarmacologica = "AINE / Antiagregante plaquetario",
                paraQueSirve = "Prevención de eventos cardiovasculares y tratamiento del dolor leve.",
                contraindicaciones = "Hipersensibilidad a salicilatos, úlcera péptica activa, hemofilia.",
                conQueNoCombinar = "Anticoagulantes, otros AINEs, metotrexato.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 112, nombre = "Etoricoxib 90mg", principioActivo = "Etoricoxib",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Etoricoxib 90mg.png"), especificacion = "Comprimido recubierto",
                familiaFarmacologica = "AINE inhibidor selectivo de la COX-2",
                paraQueSirve = "Alivio sintomático de la artrosis, artritis reumatoide y gota.",
                contraindicaciones = "Hipersensibilidad, úlcera péptica activa, insuficiencia renal/hepática grave.",
                conQueNoCombinar = "Warfarina, diuréticos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 113, nombre = "Etoricoxib 120mg", principioActivo = "Etoricoxib",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Etoricoxib 120mg.png"), especificacion = "Comprimido recubierto",
                familiaFarmacologica = "AINE inhibidor selectivo de la COX-2",
                paraQueSirve = "Tratamiento del dolor agudo asociado a cirugía dental y gota.",
                contraindicaciones = "Enfermedad isquémica cardíaca, insuficiencia cardíaca congestiva.",
                conQueNoCombinar = "Litio, metotrexato.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 114, nombre = "Etoricoxib 60mg", principioActivo = "Etoricoxib",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Etoricoxib 60mg.png"), especificacion = "Comprimido recubierto",
                familiaFarmacologica = "AINE inhibidor selectivo de la COX-2",
                paraQueSirve = "Alivio sintomático de la artrosis.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "Anticoagulantes orales.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 115, nombre = "Celecoxib 200mg", principioActivo = "Celecoxib",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Celecoxib 200mg.png"), especificacion = "Cápsula de 200 mg",
                familiaFarmacologica = "AINE inhibidor selectivo de la COX-2",
                paraQueSirve = "Alivio sintomático en el tratamiento de la artrosis y la artritis reumatoide.",
                contraindicaciones = "Hipersensibilidad a sulfonamidas, úlcera gastrointestinal.",
                conQueNoCombinar = "Fluconazol, litio, warfarina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 116, nombre = "Ketorolaco trometamol 30ml-1ml inyectable", principioActivo = "Ketorolaco trometamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.INYECTABLE,
                esAINE = true,
                imagenUrl = getUrl("Ketorolaco trometamol 30ml-1ml inyectable.png"), especificacion = "Ampolla de 1 ml",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Tratamiento a corto plazo del dolor moderado a severo en el postoperatorio.",
                contraindicaciones = "Hipersensibilidad, úlcera péptica activa, insuficiencia renal.",
                conQueNoCombinar = "Otros AINEs, pentoxifilina, probenecid, litio.",
                comoDesechar = "Contenedor de residuos peligrosos (cortopunzantes)"
            ),
            Medicamento(
                id = 117, nombre = "Ketorolaco trometamol 30mg", principioActivo = "Ketorolaco trometamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Ketorolaco trometamol 30mg.png"), especificacion = "Comprimido de 30 mg",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Tratamiento a corto plazo del dolor postoperatorio moderado a grave.",
                contraindicaciones = "No usar por más de 5 días.",
                conQueNoCombinar = "Anticoagulantes, corticoides.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 118, nombre = "Ketorolaco trometamol 10mg", principioActivo = "Ketorolaco trometamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Ketorolaco trometamol 10mg.png"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor moderado a severo.",
                contraindicaciones = "Antecedentes de hemorragia digestiva.",
                conQueNoCombinar = "Aspirina, diuréticos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 119, nombre = "Diclofenaco dietilamina 1,16% 30g gel topico", principioActivo = "Diclofenaco dietilamina",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco dietilamina 1,16% 30g gel topico.png"), especificacion = "Tubo de 30 g",
                familiaFarmacologica = "AINE de uso tópico",
                paraQueSirve = "Alivio local del dolor y la inflamación leve, traumatismos, esguinces.",
                contraindicaciones = "No aplicar sobre heridas abiertas o mucosas.",
                conQueNoCombinar = "Otros productos tópicos en la misma zona.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 120, nombre = "Diclofenaco sódico 50mg supositorio", principioActivo = "Diclofenaco sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.OTRO,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco sódico 50mg supositorio.png"), especificacion = "Supositorio",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Tratamiento sintomático del dolor e inflamación cuando la vía oral no es posible.",
                contraindicaciones = "Proctitis, hemorroides activas, hipersensibilidad.",
                conQueNoCombinar = "Otros AINEs.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 121, nombre = "Diclofenaco sódico 12,5 mg supositorio", principioActivo = "Diclofenaco sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.OTRO,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco sódico 12,5 mg supositorio.png"), especificacion = "Supositorio infantil",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor e inflamación en pediatría.",
                contraindicaciones = "Hipersensibilidad, úlcera péptica activa.",
                conQueNoCombinar = "Anticoagulantes.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 122, nombre = "Diclofenaco sódico 100mg", principioActivo = "Diclofenaco sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco sódico 100mg.png"), especificacion = "Comprimido de liberación prolongada",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Tratamiento prolongado del dolor e inflamación crónica.",
                contraindicaciones = "Insuficiencia cardíaca congestiva establecida, cardiopatía isquémica.",
                conQueNoCombinar = "Litio, digoxina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 123, nombre = "Diclofenaco sódico 25mg", principioActivo = "Diclofenaco sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco sódico 25mg.png"), especificacion = "Comprimido",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor leve a moderado.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "AINEs.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 124, nombre = "Diclofenaco de sodio 50mg", principioActivo = "Diclofenaco sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Diclofenaco de sodio 50mg.png"), especificacion = "Comprimido",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Artritis reumatoide, artrosis, espondilitis anquilosante.",
                contraindicaciones = "Úlcera gástrica.",
                conQueNoCombinar = "Ciclosporina, metotrexato.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 125, nombre = "Naproxeno Sódico 550mg", principioActivo = "Naproxeno sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Naproxeno Sódico 550mg.png"), especificacion = "Comprimido de 550 mg",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor moderado a severo, inflamación post-traumática.",
                contraindicaciones = "Insuficiencia renal grave, alergia a AINEs.",
                conQueNoCombinar = "Antihipertensivos, litio.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 126, nombre = "Ibuprofeno 100mg-5ml 100ml suspension oral", principioActivo = "Ibuprofeno",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                esAINE = true,
                imagenUrl = getUrl("Ibuprofeno 100mg-5ml100ml suspension oral.png"), especificacion = "Frasco de 100 ml",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Fiebre y dolor en niños.",
                contraindicaciones = "Hipersensibilidad, úlcera gastroduodenal.",
                conQueNoCombinar = "Anticoagulantes.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 127, nombre = "Ibuprofeno 200mg-5ml 100ml suspension oral", principioActivo = "Ibuprofeno",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                esAINE = true,
                imagenUrl = getUrl("Ibuprofeno 200mg-5ml 100ml suspension oral.png"), especificacion = "Frasco de 100 ml",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Fiebre y dolor moderado en niños.",
                contraindicaciones = "Alergia a AINEs.",
                conQueNoCombinar = "Diuréticos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 128, nombre = "Ibuprofeno 5% 45mg crema", principioActivo = "Ibuprofeno",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.CREMA_UNGUENTO,
                esAINE = true,
                imagenUrl = getUrl("Ibuprofeno 5% 45mg crema.png"), especificacion = "Tubo de 45 g",
                familiaFarmacologica = "AINE tópico",
                paraQueSirve = "Dolores musculares, contusiones, lumbalgia.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "Otros productos tópicos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 129, nombre = "Ibuprofeno 600mg", principioActivo = "Ibuprofeno",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Ibuprofeno 600mg.png"), especificacion = "Comprimido de 600 mg",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Procesos inflamatorios y dolorosos intensos.",
                contraindicaciones = "Antecedentes de hemorragia gastrointestinal.",
                conQueNoCombinar = "Alcohol, antiagregantes plaquetarios.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 130, nombre = "Ibuprofeno 400mg", principioActivo = "Ibuprofeno",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                esAINE = true,
                imagenUrl = getUrl("Ibuprofeno 400mg.png"), especificacion = "Comprimido de 400 mg",
                familiaFarmacologica = "AINE",
                paraQueSirve = "Dolor menstrual, dolor dental, cefalea.",
                contraindicaciones = "Tercer trimestre de embarazo.",
                conQueNoCombinar = "Metotrexato.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 131, nombre = "Metamizol Sódico Monohidrato 300mg(dipirona)", principioActivo = "Metamizol sódico",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Metamizol Sódico Monohidrato 300mg(dipirona).png"), especificacion = "Comprimido de 300 mg",
                familiaFarmacologica = "Pirazolona",
                paraQueSirve = "Dolor severo y fiebre alta que no responde a otros antitérmicos.",
                contraindicaciones = "Hipersensibilidad, agranulocitosis previa, porfiria hepática.",
                conQueNoCombinar = "Ciclosporina, alcohol.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 132, nombre = "Paracetamol 80mg", principioActivo = "Paracetamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Paracetamol 80mg.png"), especificacion = "Comprimido masticable infantil",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Dolor y fiebre en lactantes y niños pequeños.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "Rifampicina.\n" +
                        "Isoniazida.\n" +
                        "Fenitoína.\n" +
                        "Carbamazepina.\n" +
                        "Fenobarbital.\n" +
                        "Anticonvulsivantes inductores hepáticos.\n" +
                        "Warfarina y otros anticoagulantes.\n" +
                        "Dosis altas prolongadas con hepatotóxicos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 133, nombre = "Paracetamol 160mg-5ml 90ml", principioActivo = "Paracetamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Paracetamol 160mg-5ml 90ml.png"), especificacion = "Suspensión oral 90 ml",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Fiebre y dolor en niños.",
                contraindicaciones = "Insuficiencia hepática.",
                conQueNoCombinar = "Rifampicina.\n" +
                        "Isoniazida.\n" +
                        "Fenitoína.\n" +
                        "Carbamazepina.\n" +
                        "Fenobarbital.\n" +
                        "Anticonvulsivantes inductores hepáticos.\n" +
                        "Warfarina y otros anticoagulantes.\n" +
                        "Dosis altas prolongadas con hepatotóxicos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 134, nombre = "Paracetamol 160mg", principioActivo = "Paracetamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Paracetamol 160mg.png"), especificacion = "Comprimido masticable",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Dolor y fiebre en niños.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "Rifampicina.\n" +
                        "Isoniazida.\n" +
                        "Fenitoína.\n" +
                        "Carbamazepina.\n" +
                        "Fenobarbital.\n" +
                        "Anticonvulsivantes inductores hepáticos.\n" +
                        "Warfarina y otros anticoagulantes.\n" +
                        "Dosis altas prolongadas con hepatotóxicos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 135, nombre = "Paracetamol 1g", principioActivo = "Paracetamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Paracetamol 1g.png"), especificacion = "Comprimido de 1 g",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "El paracetamol, también conocido como acetaminofén, es un medicamento ampliamente utilizado para aliviar el dolor y reducir la fiebre. Es uno de los analgésicos más usados en adultos y niños debido a su eficacia y menor irritación gástrica comparado con antiinflamatorios como ibuprofeno o ketorolaco.",
                contraindicaciones = "Insuficiencia hepatocelular grave.",
                conQueNoCombinar = "Alcohol.\n" +
                        "Otros productos que contengan paracetamol.\n" +
                        "Rifampicina.\n" +
                        "Isoniazida.\n" +
                        "Fenitoína.\n" +
                        "Carbamazepina.\n" +
                        "Fenobarbital.\n" +
                        "Anticonvulsivantes inductores hepáticos.\n" +
                        "Warfarina y otros anticoagulantes.\n" +
                        "Dosis altas prolongadas con hepatotóxicos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 136, nombre = "Paracetamol 120mg-5ml jarabe 100ml", principioActivo = "Paracetamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Paracetamol 120mg-5ml jarabe 100ml.png"), especificacion = "Jarabe 100 ml",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Alivio de la fiebre y el dolor en niños.",
                contraindicaciones = "Alergia al paracetamol.",
                conQueNoCombinar = "Metoclopramida.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 137, nombre = "Paracetamol infantil solucion oral 15ml 100mg-ml", principioActivo = "Paracetamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.SOLUCION_ORAL,
                imagenUrl = getUrl("Paracetamol infantil solucion oral 15ml 100mg-ml.png"), especificacion = "Frasco gotario 15 ml",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "Dolor y fiebre en lactantes.",
                contraindicaciones = "Hipersensibilidad.",
                conQueNoCombinar = "Rifampicina.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 138, nombre = "Paracetamol 125 mg supositorio", principioActivo = "Paracetamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.OTRO,
                imagenUrl = getUrl("Paracetamol 125 mg supositorio.png"), especificacion = "Supositorio infantil",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "El paracetamol, también conocido como acetaminofén, es un medicamento ampliamente utilizado para aliviar el dolor y reducir la fiebre. Es uno de los analgésicos más usados en adultos y niños debido a su eficacia y menor irritación gástrica comparado con antiinflamatorios como ibuprofeno o ketorolaco.",
                contraindicaciones = "Cirugía reciente anorrectal.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 139, nombre = "Paracetamol 500 mg", principioActivo = "Paracetamol",
                categoria = AppDestinations.ANALGESICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Paracetamol 500 mg.png"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Analgésico / Antipirético",
                paraQueSirve = "El paracetamol, también conocido como acetaminofén, es un medicamento ampliamente utilizado para aliviar el dolor y reducir la fiebre. Es uno de los analgésicos más usados en adultos y niños debido a su eficacia y menor irritación gástrica comparado con antiinflamatorios como ibuprofeno o ketorolaco.",
                contraindicaciones = "Insuficiencia hepática.",
                conQueNoCombinar = "Alcohol.\n" +
                        "Otros productos que contengan paracetamol.\n" +
                        "Rifampicina.\n" +
                        "Isoniazida.\n" +
                        "Fenitoína.\n" +
                        "Carbamazepina.\n" +
                        "Fenobarbital.\n" +
                        "Anticonvulsivantes inductores hepáticos.\n" +
                        "Warfarina y otros anticoagulantes.\n" +
                        "Dosis altas prolongadas con hepatotóxicos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
