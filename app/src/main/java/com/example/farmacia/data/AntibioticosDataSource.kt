package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object AntibioticosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 1, nombre = "Amoxicilina 500mg", principioActivo = "Amoxicilina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Amoxicilina 500mg"), especificacion = "Cápsula de 500 mg",
                familiaFarmacologica = "Betalactámico (Penicilina de amplio espectro)", 
                paraQueSirve = "Tratamiento de infecciones bacterianas en oídos, garganta, senos paranasales, tracto respiratorio inferior y vías urinarias.",
                contraindicaciones = "Hipersensibilidad a las penicilinas o cefalosporinas.",
                conQueNoCombinar = "Alopurinol, probenecid, anticonceptivos orales, antibióticos bacteriostáticos.", 
                comoDesechar = "Contenedor de residuos peligrosos"
            ),
            Medicamento(
                id = 2, nombre = "Amoxicilina jarabe 250mg/5ml", principioActivo = "Amoxicilina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Amoxicilina jarabe 250mg-5ml frasco de 60ml suspension oral.png"), especificacion = "Frasco de 60ml, suspensión oral",
                familiaFarmacologica = "Betalactámico (Penicilina de amplio espectro)", 
                paraQueSirve = "Tratamiento de infecciones bacterianas agudas y profilaxis de endocarditis en niños.",
                contraindicaciones = "Alergia conocida a betalactámicos.",
                conQueNoCombinar = "Metotrexato, anticoagulantes orales.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 4, nombre = "Amoxicilina-Ácido Clavulánico 875/125mg", principioActivo = "Amoxicilina, Ácido Clavulánico",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Amoxicilina-Acido Clavulánico 875mg-125mg .png"), especificacion = "Comprimido",
                familiaFarmacologica = "Betalactámico asociado a inhibidor de betalactamasas", 
                paraQueSirve = "Infecciones bacterianas causadas por microorganismos productores de betalactamasas resistentes a amoxicilina sola.",
                contraindicaciones = "Hipersensibilidad, antecedentes de ictericia o insuficiencia hepática asociada a este fármaco.",
                conQueNoCombinar = "Probenecid, alopurinol, micofenolato de mofetilo.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 5, nombre = "Azitromicina jarabe 200mg/5ml", principioActivo = "Azitromicina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Azitromicina jarabe 200mg-5ml frasco 30 ml suspension oral.png"), especificacion = "Frasco de 30ml, suspensión oral",
                familiaFarmacologica = "Macrólido", 
                paraQueSirve = "Infecciones respiratorias superiores e inferiores, otitis media, infecciones de piel y tejidos blandos.",
                contraindicaciones = "Hipersensibilidad a la azitromicina, eritromicina u otros macrólidos.",
                conQueNoCombinar = "Antiácidos con aluminio o magnesio, derivados del cornezuelo de centeno (ergotamina), digoxina.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 6, nombre = "Cefadroxilo 500mg", principioActivo = "Cefadroxilo",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Cefadroxilo 500mg"), especificacion = "Cápsula/Comprimido de 500 mg",
                familiaFarmacologica = "Cefalosporina de primera generación", 
                paraQueSirve = "Tratamiento de infecciones urinarias, de la piel, garganta y tejidos blandos.",
                contraindicaciones = "Hipersensibilidad a las cefalosporinas o penicilinas.",
                conQueNoCombinar = "Aminoglucósidos, diuréticos potentes (furosemida), probenecid.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 7, nombre = "Cefadroxilo 250mg/5ml", principioActivo = "Cefadroxilo",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Cefadroxilo jarabe 250mg-5ml frasco 60 ml suspension oral.png"), especificacion = "Suspensión oral",
                familiaFarmacologica = "Cefalosporina de primera generación", 
                paraQueSirve = "Infecciones bacterianas sensibles en niños.",
                contraindicaciones = "Hipersensibilidad conocida.",
                conQueNoCombinar = "Antibióticos bacteriostáticos, colestiramina.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 8, nombre = "Cefradina 500mg", principioActivo = "Cefradina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Cefradina 500mg"), especificacion = "Cápsula de 500 mg",
                familiaFarmacologica = "Cefalosporina de primera generación", 
                paraQueSirve = "Infecciones del tracto respiratorio, piel, tejidos blandos y tracto urinario.",
                contraindicaciones = "Hipersensibilidad a las cefalosporinas.",
                conQueNoCombinar = "Probenecid, antibióticos bacteriostáticos.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 9, nombre = "Cefuroxima 500mg", principioActivo = "Cefuroxima",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Cefuroxima 500mg"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Cefalosporina de segunda generación", 
                paraQueSirve = "Faringoamigdalitis aguda, sinusitis, otitis media, neumonía, infecciones urinarias.",
                contraindicaciones = "Hipersensibilidad a la cefuroxima o a precursores de cefalosporinas.",
                conQueNoCombinar = "Antiácidos, bloqueadores H2, inhibidores de la bomba de protones (reducen absorción).", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 12, nombre = "Claritromicina 500mg", principioActivo = "Claritromicina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Claritromicina 500mg"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Macrólido", 
                paraQueSirve = "Infecciones respiratorias, de piel y tejidos blandos. Erradicación de H. pylori en úlceras pépticas.",
                contraindicaciones = "Hipersensibilidad, administración conjunta con estatinas, colchicina o derivados del ergot.",
                conQueNoCombinar = "Astemizol, cisaprida, pimozida, terfenadina, estatinas.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 18, nombre = "Doxiciclina 100mg", principioActivo = "Doxiciclina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Doxiciclina 100mg"), especificacion = "Comprimido de 100 mg",
                familiaFarmacologica = "Tetraciclina", 
                paraQueSirve = "Tratamiento de acné severo, infecciones respiratorias, ITS y enfermedades transmitidas por garrapatas.",
                contraindicaciones = "Hipersensibilidad, embarazo, lactancia, niños menores de 8 años (mancha los dientes).",
                conQueNoCombinar = "Lácteos, antiácidos, suplementos de hierro o calcio (reducen absorción).", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 21, nombre = "Eritromicina 500mg", principioActivo = "Eritromicina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Eritromicina 500mg"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Macrólido", 
                paraQueSirve = "Infecciones bacterianas diversas, alternativa en personas alérgicas a la penicilina.",
                contraindicaciones = "Hipersensibilidad, insuficiencia hepática grave.",
                conQueNoCombinar = "Estatinas, derivados del ergot, cisaprida, teofilina.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 22, nombre = "Claritromicina 250mg/5ml", principioActivo = "Claritromicina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Euromicina 250mg-5ml"), especificacion = "Suspensión oral",
                familiaFarmacologica = "Macrólido", 
                paraQueSirve = "Infecciones respiratorias y de tejidos blandos en niños.",
                contraindicaciones = "Hipersensibilidad, prolongación del intervalo QT.",
                conQueNoCombinar = "Antiácidos con magnesio and aluminio, digoxina, warfarina.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 26, nombre = "Levofloxacino 500mg", principioActivo = "Levofloxacino",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Levofloxacino 500mg"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Fluoroquinolona de tercera generación", 
                paraQueSirve = "Sinusitis bacteriana aguda, neumonía, infecciones urinarias complicadas y pielonefritis.",
                contraindicaciones = "Hipersensibilidad, antecedentes de trastornos de los tendones relacionados con fluoroquinolonas, niños, embarazo.",
                conQueNoCombinar = "Suplementos de hierro, zinc, antiácidos con magnesio/aluminio, AINEs (riesgo de convulsiones), teofilina.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 35, nombre = "Tetraciclina 500mg", principioActivo = "Tetraciclina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tetraciclina 500mg"), especificacion = "Cápsula de 500 mg",
                familiaFarmacologica = "Tetraciclina", 
                paraQueSirve = "Infecciones bacterianas, acné vulgar y rosácea.",
                contraindicaciones = "Hipersensibilidad, insuficiencia renal grave, niños menores de 12 años, embarazo.",
                conQueNoCombinar = "Lácteos, antiácidos, suplementos de hierro, sales de bismuto.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 36, nombre = "Azitromicina Jarabe 400mg/5ml", principioActivo = "Azitromicina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Trex forte 400 mg-5ml.png"), especificacion = "Suspensión oral",
                familiaFarmacologica = "Macrólido", 
                paraQueSirve = "Infecciones respiratorias agudas y de la piel en niños.",
                contraindicaciones = "Hipersensibilidad a macrólidos.",
                conQueNoCombinar = "Derivados del ergot, antiácidos.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 38, nombre = "Amoxicilina 500mg/5ml", principioActivo = "Amoxicilina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("amoval 500mg-5ml.png"), especificacion = "Suspensión oral",
                familiaFarmacologica = "Betalactámico", 
                paraQueSirve = "Tratamiento de otitis media, faringitis y neumonía en niños.",
                contraindicaciones = "Pacientes alérgicos a la penicilina.",
                conQueNoCombinar = "Alopurinol, antibióticos bacteriostáticos.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 39, nombre = "Amoxicilina 750mg", principioActivo = "Amoxicilina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Amoxicilina 750mg.jpeg"), especificacion = "Comprimido de 750 mg",
                familiaFarmacologica = "Betalactámico", 
                paraQueSirve = "Infecciones bacterianas de mayor intensidad o en adultos con requerimientos específicos.",
                contraindicaciones = "Hipersensibilidad a betalactámicos.",
                conQueNoCombinar = "Alopurinol.", 
                comoDesechar = "Contenedor de residuos peligrosos"
            ),
            Medicamento(
                id = 43, nombre = "Azitromicina 500mg", principioActivo = "Azitromicina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("azitromicina 500mg.png"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Macrólido", 
                paraQueSirve = "Tratamiento de infecciones respiratorias, uretritis no gonocócica y cervicitis.",
                contraindicaciones = "Hipersensibilidad al principio activo.",
                conQueNoCombinar = "Antiácidos de aluminio/magnesio simultáneamente, warfarina.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 48, nombre = "Ciprofloxacino 500mg", principioActivo = "Ciprofloxacino",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("ciprofloxacino 500mg.png"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Fluoroquinolona de segunda generación", 
                paraQueSirve = "Infecciones de las vías urinarias, del tracto respiratorio inferior y gastrointestinales.",
                contraindicaciones = "Hipersensibilidad, administración concomitante con tizanidina, niños (salvo casos específicos).",
                conQueNoCombinar = "Lácteos, antiácidos, teofilina, ciclosporina, warfarina.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 49, nombre = "Amoxicilina-Ácido Clavulánico 400/57mg por 5ml", principioActivo = "Amoxicilina, Ácido Clavulánico",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("clavinex Duo 400mg-57mg-5ml.png"), especificacion = "Suspensión oral",
                familiaFarmacologica = "Betalactámico asociado", 
                paraQueSirve = "Infecciones bacterianas en niños que requieren mayor espectro.",
                contraindicaciones = "Hipersensibilidad a betalactámicos.",
                conQueNoCombinar = "Probenecid.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 50, nombre = "Amoxicilina-Ácido Clavulánico 800/57mg", principioActivo = "Amoxicilina, Ácido Clavulánico",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("clavinex duo forte 800mg-57mg.png"), especificacion = "Comprimido",
                familiaFarmacologica = "Betalactámico asociado", 
                paraQueSirve = "Infecciones severas o persistentes del tracto respiratorio superior e inferior.",
                contraindicaciones = "Hipersensibilidad severa.",
                conQueNoCombinar = "Alopurinol.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 51, nombre = "Cloxacilina 500mg", principioActivo = "Cloxacilina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("cloxacilina 500 mg.png"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Penicilina resistente a penicilinasa", 
                paraQueSirve = "Tratamiento de infecciones causadas por estafilococos productores de penicilinasa.",
                contraindicaciones = "Alergia a las penicilinas.",
                conQueNoCombinar = "Antibióticos bacteriostáticos, anticonceptivos orales.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 54, nombre = "Flucloxacilina 500mg", principioActivo = "Flucloxacilina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("flucloxacilina 500mg.png"), especificacion = "Comprimido de 500 mg",
                familiaFarmacologica = "Penicilina resistente a betalactamasa", 
                paraQueSirve = "Infecciones de la piel y tejidos blandos, huesos, articulaciones y tracto respiratorio causadas por estafilococos.",
                contraindicaciones = "Hipersensibilidad a penicilinas, antecedentes de disfunción hepática con flucloxacilina.",
                conQueNoCombinar = "Metotrexato, probenecid.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 55, nombre = "Flucloxacilina 250mg/5ml", principioActivo = "Flucloxacilina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("flucloxacilina jarabe 250mg-5ml suspension oral 60 ml.png"), especificacion = "Suspensión oral",
                familiaFarmacologica = "Penicilina resistente a betalactamasa", 
                paraQueSirve = "Infecciones estafilocócicas en niños.",
                contraindicaciones = "Hipersensibilidad conocida.",
                conQueNoCombinar = "Metotrexato.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 66, nombre = "Nitrofurantoína 100mg", principioActivo = "Nitrofurantoína macrocristales",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("nitrofurantoina macrocristales 100mg.png"), especificacion = "Cápsula de 100 mg",
                familiaFarmacologica = "Antibacteriano de la familia de los nitrofuranos", 
                paraQueSirve = "Prevención y tratamiento de infecciones urinarias agudas no complicadas causadas por microorganismos sensibles.",
                contraindicaciones = "Insuficiencia renal significativa, embarazo a término (semanas 38-42), niños menores de 1 mes.",
                conQueNoCombinar = "Antiácidos que contengan trisilicato de magnesio, agentes uricosúricos (probenecid).", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 74, nombre = "Azitromicina 200mg/5ml", principioActivo = "Azitromicina",
                categoria = AppDestinations.ANTIBIOTICOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("trex 200 mg-5ml.png"), especificacion = "Suspensión oral",
                familiaFarmacologica = "Macrólido", 
                paraQueSirve = "Tratamiento de amigdalitis, bronquitis y otitis media en pediatría.",
                contraindicaciones = "Hipersensibilidad a macrólidos.",
                conQueNoCombinar = "Derivados del ergot, antiácidos con magnesio/aluminio.", 
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
