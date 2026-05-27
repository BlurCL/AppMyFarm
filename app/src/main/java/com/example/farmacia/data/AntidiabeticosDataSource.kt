package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AntidiabeticosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 19, nombre = "Empagliflozina 10mg", principioActivo = "Empagliflozina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("EMPAGLIFLOZINA 10MG.jpeg"), especificacion = "Comprimido de 10 mg",
                familiaFarmacologica = "Inhibidor de SGLT2 (Cotransportador de sodio-glucosa tipo 2)", 
                paraQueSirve = "Control de la glucosa en sangre en pacientes con diabetes mellitus tipo 2 y reducción del riesgo cardiovascular.",
                contraindicaciones = "Hipersensibilidad, insuficiencia renal grave, diálisis, cetoacidosis diabética.",
                conQueNoCombinar = "Diuréticos, insulina y secretagogos de insulina (riesgo de hipoglucemia).", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 20, nombre = "Empagliflozina 25mg", principioActivo = "Empagliflozina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("EMPAGLIFLOZINA 25MG.png"), especificacion = "Comprimido de 25 mg",
                familiaFarmacologica = "Inhibidor de SGLT2", 
                paraQueSirve = "Tratamiento de adultos con diabetes tipo 2 no suficientemente controlada.",
                contraindicaciones = "Hipersensibilidad, pacientes con aclaramiento de creatinina persistentemente < 30 ml/min.",
                conQueNoCombinar = "Diuréticos de asa y tiazídicos.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 25, nombre = "Glibenclamida 5mg", principioActivo = "Glibenclamida",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Glibenclamida 5mg.jpeg"), especificacion = "Comprimido de 5 mg",
                familiaFarmacologica = "Sulfonilurea de segunda generación", 
                paraQueSirve = "Diabetes mellitus tipo 2 cuando no se puede controlar solo con dieta y ejercicio.",
                contraindicaciones = "Diabetes tipo 1, cetoacidosis diabética, insuficiencia renal o hepática grave, embarazo.",
                conQueNoCombinar = "Alcohol, bloqueadores beta, anticoagulantes, miconazol.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 27, nombre = "Linagliptina 5mg", principioActivo = "Linagliptina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Linagliptina 5mg.jpeg"), especificacion = "Comprimido de 5 mg",
                familiaFarmacologica = "Inhibidor de la DPP-4 (Dipeptidil peptidasa-4)", 
                paraQueSirve = "Control glucémico en adultos con diabetes mellitus tipo 2.",
                contraindicaciones = "Hipersensibilidad al principio activo o a otros inhibidores de la DPP-4.",
                conQueNoCombinar = "Inductores potentes de la glicoproteína P (rifampicina) reducen su eficacia.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 28, nombre = "Linagliptina-Metformina 2,5/850mg", principioActivo = "Linagliptina, Metformina clorhidrato",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Linagliptina-clorhidrato de metformina 2,5-850mg.jpeg"), especificacion = "Comprimido",
                familiaFarmacologica = "Asociación de Inhibidor DPP-4 y Biguanida", 
                paraQueSirve = "Tratamiento de la diabetes mellitus tipo 2 cuando el tratamiento solo con metformina o linagliptina es insuficiente.",
                contraindicaciones = "Cualquier tipo de acidosis metabólica aguda, insuficiencia renal grave, hipersensibilidad.",
                conQueNoCombinar = "Alcohol (riesgo de acidosis láctica), medios de contraste yodados, glucocorticoides.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 31, nombre = "Metformina clorhidrato 850mg", principioActivo = "Metformina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("METFORMINA clorhidrato 850mg.jpeg"), especificacion = "Comprimido de 850 mg",
                familiaFarmacologica = "Biguanida (Antihiperglucemiante)", 
                paraQueSirve = "Tratamiento de primera elección para la diabetes mellitus tipo 2, especialmente en pacientes con sobrepeso.",
                contraindicaciones = "Insuficiencia renal moderada o grave, acidosis láctica, deshidratación, alcoholismo.",
                conQueNoCombinar = "Alcohol, medios de contraste yodados, diuréticos, AINEs.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 32, nombre = "Metformina clorhidrato 1000mg", principioActivo = "Metformina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Metformina Clorhidrato 1000mg.png"), especificacion = "Comprimido de 1000 mg",
                familiaFarmacologica = "Biguanida", 
                paraQueSirve = "Control de los niveles de glucosa en sangre en diabetes tipo 2.",
                contraindicaciones = "Insuficiencia renal grave (TFG < 30 ml/min), insuficiencia hepática, intoxicación alcohólica aguda.",
                conQueNoCombinar = "Medios de contraste yodados, fármacos nefrotóxicos.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 52, nombre = "Empagliflozina-Metformina 12,5/1000mg", principioActivo = "Empagliflozina, Metformina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Metformina Clorhidrato 1000mg.png"), especificacion = "Comprimido recubierto",
                familiaFarmacologica = "Asociación de Inhibidor SGLT2 y Biguanida", 
                paraQueSirve = "Mejora del control glucémico en pacientes adultos con diabetes tipo 2.",
                contraindicaciones = "Hipersensibilidad, acidosis metabólica, precoma diabético, insuficiencia renal grave.",
                conQueNoCombinar = "Alcohol, medios de contraste yodados, diuréticos potentes.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 53, nombre = "Empagliflozina 12,5/850mg", principioActivo = "Empagliflozina, Metformina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("empagliflozina 12,5-850mg.jpeg"), especificacion = "Comprimido",
                familiaFarmacologica = "Asociación de Inhibidor SGLT2 y Biguanida", 
                paraQueSirve = "Tratamiento de la diabetes mellitus tipo 2 como complemento de la dieta y el ejercicio.",
                contraindicaciones = "Pacientes con acidosis láctica o insuficiencia renal grave.",
                conQueNoCombinar = "Medios de contraste yodados, consumo excesivo de alcohol.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 61, nombre = "Linagliptina-Metformina 2,5/1000mg", principioActivo = "Linagliptina, Metformina clorhidrato",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("linagliptina-clorhidrato de metformina 2,5-1000mg.jpeg"), especificacion = "Comprimido",
                familiaFarmacologica = "Asociación de Inhibidor DPP-4 y Biguanida", 
                paraQueSirve = "Control de glucosa en pacientes con diabetes tipo 2 que no se controlan con dosis máximas de metformina.",
                contraindicaciones = "Hipersensibilidad, cetoacidosis diabética, insuficiencia renal.",
                conQueNoCombinar = "Alcohol, medios de contraste yodados, glucocorticoides.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 64, nombre = "Metformina clorhidrato 500mg", principioActivo = "Metformina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("metformina clorhidrato 500mg.png"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Biguanida", 
                paraQueSirve = "Diabetes mellitus tipo 2 y estados de resistencia a la insulina.",
                contraindicaciones = "Hipersensibilidad, insuficiencia renal o hepática, estados de hipoxia.",
                conQueNoCombinar = "Consumo excesivo de alcohol, fármacos que afecten la función renal.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 65, nombre = "Metformina clorhidrato 750mg", principioActivo = "Metformina",
                categoria = AppDestinations.ANTIDIABETICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("metformina clorhidrato 750mg.png"), especificacion = "Comprimido de liberación prolongada",
                familiaFarmacologica = "Biguanida", 
                paraQueSirve = "Tratamiento de la diabetes tipo 2. La liberación prolongada reduce los efectos secundarios gastrointestinales.",
                contraindicaciones = "Hipersensibilidad, insuficiencia renal severa.",
                conQueNoCombinar = "Alcohol, glucocorticoides, agonistas beta-2.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
