package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object RespiratoriosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 220, nombre = "Fluticasona propionato 50 mcg", principioActivo = "Fluticasona",
                categoria = AppDestinations.RESPIRATORIOS, formaFarmaceutica = FormaFarmaceutica.OTRO,
                imagenUrl = getUrl("Fluticasona propinato 50 mcg.png"), especificacion = "Spray nasal 50 mcg",
                familiaFarmacologica = "Corticoide nasal",
                paraQueSirve = "Prevención y tratamiento de la rinitis alérgica estacional y perenne.",
                contraindicaciones = "Hipersensibilidad, infección fúngica nasal no tratada.",
                conQueNoCombinar = "Ritonavir, ketoconazol, otros corticosteroides.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 221, nombre = "Budesonida 200 mcg", principioActivo = "Budesonida",
                categoria = AppDestinations.RESPIRATORIOS, formaFarmaceutica = FormaFarmaceutica.OTRO,
                imagenUrl = getUrl("Budesonida 200 mcg 12,1g - 10 ml.png"), especificacion = "Inhalador 200 mcg",
                familiaFarmacologica = "Glucocorticoide",
                paraQueSirve = "Tratamiento de mantenimiento del asma bronquial.",
                contraindicaciones = "Hipersensibilidad, estatus asmático (no es para rescate).",
                conQueNoCombinar = "Ketoconazol, itraconazol, claritromicina.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 222, nombre = "Salbutamol 100 mcg", principioActivo = "Salbutamol",
                categoria = AppDestinations.RESPIRATORIOS, formaFarmaceutica = FormaFarmaceutica.OTRO,
                imagenUrl = getUrl("Salbutamol 100mcg.png"), especificacion = "Inhalador 100 mcg",
                familiaFarmacologica = "Broncodilatador (Agonista beta-2)",
                paraQueSirve = "Alivio rápido de los síntomas del asma y otras enfermedades pulmonares obstructivas.",
                contraindicaciones = "Hipersensibilidad, amenaza de aborto.",
                conQueNoCombinar = "Propranolol y otros betabloqueantes, diuréticos (riesgo de baja de potasio).",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 223, nombre = "Ipratropio + Fenoterol", principioActivo = "Bromuro de Ipratropio, Fenoterol",
                categoria = AppDestinations.RESPIRATORIOS, formaFarmaceutica = FormaFarmaceutica.OTRO,
                imagenUrl = getUrl("Bromuro de Ipratropio Bromhidrato de fenoterol 20 mcg-50mcg 200 dosis.png"), especificacion = "Inhalador 20mcg/50mcg",
                familiaFarmacologica = "Anticolinérgico y Agonista beta-2",
                paraQueSirve = "Prevención y tratamiento de los síntomas de trastornos obstructivos crónicos de las vías respiratorias.",
                conQueNoCombinar = "Otros anticolinérgicos, bloqueadores beta-adrenérgicos.",
                tipoReceta = "Se necesita receta medica",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 224, nombre = "Bromhexina Clorhidrato 8mg/5ml", principioActivo = "Bromhexina",
                categoria = AppDestinations.RESPIRATORIOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Bromhexina Clorhidrato 8mg-5ml solucion oral.png"), especificacion = "Jarabe 8mg/5ml",
                familiaFarmacologica = "Mucolítico",
                paraQueSirve = "Ayuda a reducir la viscosidad de las secreciones mucosas, facilitando su expulsión.",
                conQueNoCombinar = "Antitusivos (como codeína), ya que dificultan la expulsión de la flema.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 225, nombre = "Ambroxol Clorhidrato 30mg/5ml", principioActivo = "Ambroxol",
                categoria = AppDestinations.RESPIRATORIOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Ambroxol Clorhidrato 30mg - 5ml Jarabe.png"), especificacion = "Jarabe 30mg/5ml",
                familiaFarmacologica = "Mucolítico",
                paraQueSirve = "Tratamiento de enfermedades broncopulmonares con secreción mucosa anormal.",
                conQueNoCombinar = "Antibióticos (aumenta su paso al tejido pulmonar), antitusivos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 226, nombre = "Ambroxol Clorhidrato 15mg/5ml", principioActivo = "Ambroxol",
                categoria = AppDestinations.RESPIRATORIOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Ambroxol Clorhidrato 15mg - 5ml Jarabe.png"), especificacion = "Jarabe 15mg/5ml",
                familiaFarmacologica = "Mucolítico",
                paraQueSirve = "Alivio de la tos con flema en pacientes pediátricos.",
                conQueNoCombinar = "Antitusivos (codeína), antibióticos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 227, nombre = "Carbocisteina 100mg/5ml", principioActivo = "Carbocisteina",
                categoria = AppDestinations.RESPIRATORIOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Carbocisteina 100mg-5ml 120 ml.png"), especificacion = "Jarabe 100mg/5ml",
                familiaFarmacologica = "Mucolítico",
                paraQueSirve = "Tratamiento de trastornos del tracto respiratorio caracterizados por exceso de moco.",
                conQueNoCombinar = "Antitusivos, atropina y otros desecantes de secreciones.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            ),
            Medicamento(
                id = 228, nombre = "Carbocisteina 250mg/5ml", principioActivo = "Carbocisteina",
                categoria = AppDestinations.RESPIRATORIOS, formaFarmaceutica = FormaFarmaceutica.JARABE_SUSPENSION,
                imagenUrl = getUrl("Carbocisteina 250mg-5ml 120ml.png"), especificacion = "Jarabe 250mg/5ml",
                familiaFarmacologica = "Mucolítico",
                paraQueSirve = "Alivio de la tos con flema.",
                contraindicaciones = "Úlcera péptica activa.",
                conQueNoCombinar = "Medicamentos antitusivos.",
                comoDesechar = "Contenedor de medicamentos vencidos en farmacia"
            )
        )
    }
}
