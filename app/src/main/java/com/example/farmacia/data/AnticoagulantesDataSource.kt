package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AnticoagulantesDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 37, nombre = "Acenocumarol 4mg", principioActivo = "Acenocumarol",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("acenocumarol 4mg.png"), especificacion = "Comprimido de 4 mg",
                familiaFarmacologica = "Anticoagulante oral antivitamina K. Derivado cumarínico. Estrecho margen terapéutico: la diferencia entre dosis eficaz y dosis tóxica es mínima. Requiere control INR constante.",
                paraQueSirve = "Profilaxis y tratamiento de trombosis venosa, EP, FANV, prótesis valvulares.",
                contraindicaciones = "Hipersensibilidad a cumarínicos. Diátesis hemorrágica. Cirugía SNC/oftalmológica reciente. Úlcera péptica, hemorragias. HTA grave. I. hepática grave. I. renal grave si riesgo hemorrágico > trombótico. Embarazo..",
                conQueNoCombinar = "- Miconazol: hemorragias imprevisibles, graves\n" +
                        "- Hipérico/Hierba de San Juan: anula efecto, riesgo trombótico\n" +
                        "- AAS ≥500 mg/toma o ≥3g/día: contraindicado por aumento crítico de hemorragia\n" +
                        "- AINEs ej. aspirina, ibuprofeno, naproxeno, diclofenaco: peligro de hemorragias GI\n" +
                        "- ISRS ej. sertralina, citalopram, fluoxetina: potencian efecto\n" +
                        "- Otros que potencian: amiodarona, fluconazol, metronidazol, omeprazol, paracetamol, simvastatina\n" +
                        "- Que disminuyen efecto: carbamazepina, rifampicina, colestiramina, anticonceptivos\n" +
                        "- Alcohol, zumo de grosella, alimentos ricos en vit. K: espinaca, coliflor, col",
                comoDesechar = "Punto Desecha Seguro. Altísimo riesgo si lo ingiere otra persona.\n" +
                        "No automedicación: Nunca ajustar sin INR. Un cambio pequeño de dosis o una interacción puede causar trombosis o hemorragia cerebral mortal."
            ),
            Medicamento(
                id = 41, nombre = "Apixabán 2,5mg", principioActivo = "Apixaban",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("apixaban 2,5mg.png"), especificacion = "Comprimido de 2,5 mg",
                familiaFarmacologica = "Anticoagulante oral directo. Inhibidor directo del Factor Xa. Estrecho margen terapéutico: la toxicidad y el riesgo de hemorragia dependen directamente de la dosis y niveles plasmáticos.",
                paraQueSirve = "Prevenir TEV post cirugía cadera/rodilla. Prevenir ictus en FANV. Tratar TVP/EP y prevenir recurrencias.",
                contraindicaciones = "Hemorragia activa, hepatopatía asociada a coagulopatía, lesión orgánica con riesgo de sangrado.",
                conQueNoCombinar = "- Otros anticoagulantes: warfarina, rivaroxabán, dabigatrán, heparina\n" +
                        "- AINEs ej. aspirina, ibuprofeno, diclofenaco: aumenta sangrado\n" +
                        "- Antiagregantes: clopidogrel, AAS\n" +
                        "- ISRS/IRSN ej. sertralina, paroxetina: riesgo de hemorragia\n" +
                        "- Inhibidores potentes CYP3A4 + P-gp: ketoconazol: usar con precaución",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 42, nombre = "Apixabán 5mg", principioActivo = "Apixaban",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("apizaxaban 5mg.png"), especificacion = "Comprimido de 5 mg (Apizaxaban en lista original)",
                familiaFarmacologica = "Anticoagulante oral directo. Inhibidor directo del Factor Xa. Estrecho margen terapéutico: la toxicidad y el riesgo de hemorragia dependen directamente de la dosis y niveles plasmáticos.",
                paraQueSirve = "Prevenir TEV post cirugía cadera/rodilla. Prevenir ictus en FANV. Tratar TVP/EP y prevenir recurrencias.",
                contraindicaciones = "Sangrado activo, enfermedad hepática con riesgo de sangrado, hipersensibilidad.",
                conQueNoCombinar = "- Otros anticoagulantes: warfarina, rivaroxabán, dabigatrán, heparina\n" +
                        "- AINEs ej. aspirina, ibuprofeno, diclofenaco: aumenta sangrado\n" +
                        "- Antiagregantes: clopidogrel, AAS\n" +
                        "- ISRS/IRSN ej. sertralina, paroxetina: riesgo de hemorragia\n" +
                        "- Inhibidores potentes CYP3A4 + P-gp: ketoconazol: usar con precaución",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 70, nombre = "Rivaroxabán 10mg", principioActivo = "Rivaroxaban",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("rivaroxaban 10mg.png"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "Anticoagulante oral directo. Inhibidor directo del Factor Xa. Estrecho margen terapéutico: pequeños cambios de dosis o nivel en sangre aumentan mucho el riesgo de sangrado o trombosis.",
                paraQueSirve = "Prevenir trombos post cirugía cadera/rodilla. Tratar TVP y embolia pulmonar. Prevenir ictus en FANV con factores de riesgo.",
                contraindicaciones = "Hipersensibilidad, sangrado activo, úlcera, lesión cerebral reciente, cirugía cerebral/oftálmica reciente. Hepatopatía con coagulopatía. Embarazo/lactancia. No con otros anticoagulantes.",
                conQueNoCombinar = "- Otros anticoagulantes: warfarina, dabigatrán, apixabán, heparina\n" +
                        "- AINEs ej. ibuprofeno, naproxeno, aspirina ≥500 mg: aumenta riesgo hemorrágico\n" +
                        "- Antiagregantes: clopidogrel, AAS en dosis antiagregantes 75-325 mg\n" +
                        "- ISRS/IRSN ej. sertralina, fluoxetina, venlafaxina: aumentan sangrado\n" +
                        "- Inhibidores potentes CYP3A4 + P-gp: ketoconazol, ritonavir: contraindicado\n" +
                        "- Zumo de pomelo: No se recomienda administrar con zumo de pomelo porque puede aumentar los niveles de rivaroxabán",
                comoDesechar = "Contenedores en farmacias Punto Desecha Seguro.\n" +
                        "No automedicación: Reducir dosis a 2,5 mg/12h si ≥2 de: edad ≥80, peso ≤60kg, creatinina ≥1,5. Pequeños cambios de dosis = gran cambio en riesgo."
            ),
            Medicamento(
                id = 71, nombre = "Rivaroxabán 2,5mg", principioActivo = "Rivaroxaban",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("rivaroxaban 2,5mg.png"), especificacion = "Comprimido de 2,5 mg",
                familiaFarmacologica = "Anticoagulante oral directo. Inhibidor directo del Factor Xa. Estrecho margen terapéutico: pequeños cambios de dosis o nivel en sangre aumentan mucho el riesgo de sangrado o trombosis.",
                paraQueSirve = "Prevenir trombos post cirugía cadera/rodilla. Tratar TVP y embolia pulmonar. Prevenir ictus en FANV con factores de riesgo.",
                contraindicaciones = "Hipersensibilidad, sangrado activo, úlcera, lesión cerebral reciente, cirugía cerebral/oftálmica reciente. Hepatopatía con coagulopatía. Embarazo/lactancia. No con otros anticoagulantes.",
                conQueNoCombinar = "- Otros anticoagulantes: warfarina, dabigatrán, apixabán, heparina\n" +
                        "- AINEs ej. ibuprofeno, naproxeno, aspirina ≥500 mg: aumenta riesgo hemorrágico\n" +
                        "- Antiagregantes: clopidogrel, AAS en dosis antiagregantes 75-325 mg\n" +
                        "- ISRS/IRSN ej. sertralina, fluoxetina, venlafaxina: aumentan sangrado\n" +
                        "- Inhibidores potentes CYP3A4 + P-gp: ketoconazol, ritonavir: contraindicado\n" +
                        "- Zumo de pomelo: No se recomienda administrar con zumo de pomelo porque puede aumentar los niveles de rivaroxabán.",
                comoDesechar = "Contenedores en farmacias Punto Desecha Seguro.\n" +
                        "No automedicación: Reducir dosis a 2,5 mg/12h si ≥2 de: edad ≥80, peso ≤60kg, creatinina ≥1,5. Pequeños cambios de dosis = gran cambio en riesgo."
            ),
            Medicamento(
                id = 72, nombre = "Rivaroxabán 20mg", principioActivo = "Rivaroxaban",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("rivaroxaban 20mg.png"), especificacion = "Comprimido de 20 mg",
                familiaFarmacologica = "Anticoagulante - Inhibidor directo del factor Xa",
                paraQueSirve = "Tratamiento de la trombosis venosa profunda (TVP) y de la embolia pulmonar (EP).",
                contraindicaciones = "Hipersensibilidad, sangrado activo, úlcera, lesión cerebral reciente, cirugía cerebral/oftálmica reciente. Hepatopatía con coagulopatía. Embarazo/lactancia. No con otros anticoagulantes.",
                conQueNoCombinar = "- Otros anticoagulantes: warfarina, dabigatrán, apixabán, heparina\n" +
                        "- AINEs ej. ibuprofeno, naproxeno, aspirina ≥500 mg: aumenta riesgo hemorrágico\n" +
                        "- Antiagregantes: clopidogrel, AAS en dosis antiagregantes 75-325 mg\n" +
                        "- ISRS/IRSN ej. sertralina, fluoxetina, venlafaxina: aumentan sangrado\n" +
                        "- Inhibidores potentes CYP3A4 + P-gp: ketoconazol, ritonavir: contraindicado\n" +
                        " - Zumo de pomelo: No se recomienda administrar con zumo de pomelo porque puede aumentar los niveles de rivaroxabán",
                comoDesechar = "Contenedores en farmacias Punto Desecha Seguro.\n" +
                        "No automedicación: Reducir dosis a 2,5 mg/12h si ≥2 de: edad ≥80, peso ≤60kg, creatinina ≥1,5. Pequeños cambios de dosis = gran cambio en riesgo."
            ),
            Medicamento(
                id = 73, nombre = "Rivaroxabán 15mg", principioActivo = "Rivaroxaban",
                categoria = AppDestinations.ANTICOAGULANTES, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("rivarozaban 15mg.png"), especificacion = "Comprimido de 15 mg",
                familiaFarmacologica = "Anticoagulante - Inhibidor directo del factor Xa",
                paraQueSirve = "Tratamiento y prevención de recurrencias de la TVP y de la embolia pulmonar.",
                contraindicaciones = "Hipersensibilidad, sangrado activo, úlcera, lesión cerebral reciente, cirugía cerebral/oftálmica reciente. Hepatopatía con coagulopatía. Embarazo/lactancia. No con otros anticoagulantes.",
                conQueNoCombinar = "    - Otros anticoagulantes: warfarina, dabigatrán, apixabán, heparina\n" +
                        "- AINEs ej. ibuprofeno, naproxeno, aspirina ≥500 mg: aumenta riesgo hemorrágico\n" +
                        "- Antiagregantes: clopidogrel, AAS en dosis antiagregantes 75-325 mg\n" +
                        "- ISRS/IRSN ej. sertralina, fluoxetina, venlafaxina: aumentan sangrado\n" +
                        "- Inhibidores potentes CYP3A4 + P-gp: ketoconazol, ritonavir: contraindicado\n" +
                        "- Zumo de pomelo: No se recomienda administrar con zumo de pomelo porque puede aumentar los niveles de rivaroxabán",
                comoDesechar = "Contenedores en farmacias Punto Desecha Seguro.\n" +
                        "No automedicación: Reducir dosis a 2,5 mg/12h si ≥2 de: edad ≥80, peso ≤60kg, creatinina ≥1,5. Pequeños cambios de dosis = gran cambio en riesgo."
            )
        )
    }
}
