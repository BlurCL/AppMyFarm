package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.navigation.AppDestinations

object HormonasDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return listOf(
            Medicamento(
                id = 260, nombre = "Tiamazol 5 mg", principioActivo = "Tiamazol",
                categoria = AppDestinations.HORMONAS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tiamazol 5mg.png"), especificacion = "5 mg",
                familiaFarmacologica = "Antitiroideos / Tionamidas.",
                paraQueSirve = "Tratamiento del hipertiroidismo. Funciona disminuyendo y bloqueando la producción excesiva de hormonas tiroideas (T3 y T4) en el cuerpo.",
                contraindicaciones = "Hipersensibilidad o alergia al tiamazol o a otras tionamidas.\n" +
                        "\n" +
                        "Antecedentes previos de agranulocitosis (bajada crítica de defensas) causada por este tipo de fármacos.\n" +
                        "\n" +
                        "Período de lactancia, ya que el medicamento se traspasa a través de la leche materna.\n" +
                        "\n" +
                        "Hepatitis o colestasis de carácter grave.",
                conQueNoCombinar = "Warfarina: Puede alterar los niveles de coagulación (INR), por lo que requiere un ajuste estricto de la dosis por parte del médico.\n" +
                        "\n" +
                        "Aminofilina y teofilina: El tiamazol disminuye la velocidad con la que el cuerpo elimina estos fármacos (aclaramiento).\n" +
                        "\n" +
                        "Beta-bloqueadores: Puede potenciar el efecto de bradicardia (bajada extrema de la frecuencia cardíaca).\n" +
                        "\n" +
                        "Litio y yodo: Interfieren directamente con la función y regulación de la tiroides.\n" +
                        "\n" +
                        "Advertencia de efectos graves: Si el usuario presenta fiebre junto con dolor de garganta, debe suspender de inmediato y acudir a urgencias para hacerse un hemograma por riesgo de agranulocitosis.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Manejo especial por citotoxicidad: Al ser considerado un compuesto citotóxico, está estrictamente prohibido botarlo al inodoro o mezclarlo con la basura domiciliaria habitual.\n" +
                        "\n" +
                        "Puntos de reciclaje: Debe ser entregado exclusivamente en los contenedores de puntos limpios destinados a fármacos dentro de las farmacias."
            ),
            Medicamento(
                id = 261, nombre = "Tiamazol 10 mg", principioActivo = "Tiamazol",
                categoria = AppDestinations.HORMONAS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Tiamazol 10 mg.png"), especificacion = "10 mg",
                familiaFarmacologica = "Antitiroideos / Tionamidas.",
                paraQueSirve = "Tratamiento del hipertiroidismo. Funciona disminuyendo y bloqueando la producción excesiva de hormonas tiroideas (T3 y T4) en el cuerpo.",
                conQueNoCombinar = "Warfarina: Puede alterar los niveles de coagulación (INR), por lo que requiere un ajuste estricto de la dosis por parte del médico.\n" +
                        "\n" +
                        "Aminofilina y teofilina: El tiamazol disminuye la velocidad con la que el cuerpo elimina estos fármacos (aclaramiento).\n" +
                        "\n" +
                        "Beta-bloqueadores: Puede potenciar el efecto de bradicardia (bajada extrema de la frecuencia cardíaca).\n" +
                        "\n" +
                        "Litio y yodo: Interfieren directamente con la función y regulación de la tiroides.\n" +
                        "\n" +
                        "Advertencia de efectos graves: Si el usuario presenta fiebre junto con dolor de garganta, debe suspender de inmediato y acudir a urgencias para hacerse un hemograma por riesgo de agranulocitosis.",
                contraindicaciones = "Hipersensibilidad o alergia al tiamazol o a otras tionamidas.\n" +
                        "\n" +
                        "Antecedentes previos de agranulocitosis (bajada crítica de defensas) causada por este tipo de fármacos.\n" +
                        "\n" +
                        "Período de lactancia, ya que el medicamento se traspasa a través de la leche materna.\n" +
                        "\n" +
                        "Hepatitis o colestasis de carácter grave..\n",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "Manejo especial por citotoxicidad: Al ser considerado un compuesto citotóxico, está estrictamente prohibido botarlo al inodoro o mezclarlo con la basura domiciliaria habitual.\n" +
                        "\n" +
                        "Puntos de reciclaje: Debe ser entregado exclusivamente en los contenedores de puntos limpios destinados a fármacos dentro de las farmacias."
            ),
            Medicamento(
                id = 262, nombre = "Levotiroxina sódica 25 mcg", principioActivo = "Levotiroxina sódica",
                categoria = AppDestinations.HORMONAS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Levotiroxina sódica 25 mcg.png"), especificacion = "25 mcg",
                familiaFarmacologica = "Hormonas tiroideas / T4 sintética.",
                paraQueSirve = "Tratamiento del hipotiroidismo. Funciona reemplazando la hormona T4 que la glándula tiroides no es capaz de producir en cantidades suficientes.\n" +
                        "\n" +
                        "Indicaciones principales: Regulación del metabolismo, control del gasto energético, mantención del desarrollo cerebral y de la función cardíaca.",
                contraindicaciones = "Alergia a la levotiroxina o a cualquiera de los excipientes de la fórmula.\n" +
                        "\n" +
                        "Tiroiditis aguda o hipertiroidismo que no esté bajo tratamiento.\n" +
                        "\n" +
                        "Infarto agudo al miocardio (ataque al corazón) reciente y sin tratar.\n" +
                        "\n" +
                        "Insuficiencia suprarrenal que no haya sido tratada.",
                conQueNoCombinar = "Antiácidos, calcio, hierro y sucralfato: Disminuyen drásticamente su absorción. Se debe separar la toma de levotiroxina por un mínimo de 4 horas de estos productos.\n" +
                        "\n" +
                        "Café, soja (soya) y exceso de fibra: Interfieren en su absorción. El medicamento debe tomarse solo con agua, entre 30 a 60 minutos antes del desayuno.\n" +
                        "\n" +
                        "Warfarina u otros anticoagulantes: Potencia el efecto anticoagulante, aumentando el riesgo de sufrir sangrados.\n" +
                        "\n" +
                        "Amiodarona y litio: Pueden alterar directamente la función de la tiroides.\n" +
                        "\n" +
                        "Antidepresivos tricíclicos: Puede incrementar los efectos secundarios a nivel cardíaco.\n" +
                        "\n" +
                        "Nota de la app: Si la dosis es muy alta puede provocar síntomas de hipertiroidismo (taquicardia, temblores, insomnio, pérdida de peso); si es baja, persistirán los síntomas de hipotiroidismo.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "No arrojar al WC ni a la basura común: Evita desecharlo en el basurero doméstico o por el inodoro para proteger el medio ambiente.\n" +
                        "\n" +
                        "Puntos de reciclaje: Llevar a los contenedores especiales para medicamentos en desuso o vencidos ubicados en las farmacias autorizadas (puntos limpios / RETEMA)."
            ),
            Medicamento(
                id = 263, nombre = "Levotiroxina sódica 50 mcg", principioActivo = "Levotiroxina sódica",
                categoria = AppDestinations.HORMONAS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Levotiroxina sódica 50 mcg.png"), especificacion = "50 mcg",
                familiaFarmacologica = "Hormonas tiroideas / T4 sintética.",
                paraQueSirve = "Tratamiento del hipotiroidismo. Funciona reemplazando la hormona T4 que la glándula tiroides no es capaz de producir en cantidades suficientes.\n" +
                        "\n" +
                        "Indicaciones principales: Regulación del metabolismo, control del gasto energético, mantención del desarrollo cerebral y de la función cardíaca.",
                contraindicaciones = "Alergia a la levotiroxina o a cualquiera de los excipientes de la fórmula.\n" +
                        "\n" +
                        "Tiroiditis aguda o hipertiroidismo que no esté bajo tratamiento.\n" +
                        "\n" +
                        "Infarto agudo al miocardio (ataque al corazón) reciente y sin tratar.\n" +
                        "\n" +
                        "Insuficiencia suprarrenal que no haya sido tratada.",
                conQueNoCombinar = "Antiácidos, calcio, hierro y sucralfato: Disminuyen drásticamente su absorción. Se debe separar la toma de levotiroxina por un mínimo de 4 horas de estos productos.\n" +
                        "\n" +
                        "Café, soja (soya) y exceso de fibra: Interfieren en su absorción. El medicamento debe tomarse solo con agua, entre 30 a 60 minutos antes del desayuno.\n" +
                        "\n" +
                        "Warfarina u otros anticoagulantes: Potencia el efecto anticoagulante, aumentando el riesgo de sufrir sangrados.\n" +
                        "\n" +
                        "Amiodarona y litio: Pueden alterar directamente la función de la tiroides.\n" +
                        "\n" +
                        "Antidepresivos tricíclicos: Puede incrementar los efectos secundarios a nivel cardíaco.\n" +
                        "\n" +
                        "Nota de la app: Si la dosis es muy alta puede provocar síntomas de hipertiroidismo (taquicardia, temblores, insomnio, pérdida de peso); si es baja, persistirán los síntomas de hipotiroidismo.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "No arrojar al WC ni a la basura común: Evita desecharlo en el basurero doméstico o por el inodoro para proteger el medio ambiente.\n" +
                        "\n" +
                        "Puntos de reciclaje: Llevar a los contenedores especiales para medicamentos en desuso o vencidos ubicados en las farmacias autorizadas (puntos limpios / RETEMA)."
            ),
            Medicamento(
                id = 264, nombre = "Levotiroxina sódica 100 mcg", principioActivo = "Levotiroxina sódica",
                categoria = AppDestinations.HORMONAS, formaFarmaceutica = FormaFarmaceutica.COMPRIMIDO_CAPSULA,
                imagenUrl = getUrl("Levotiroxina sódica 100 mcg.png"), especificacion = "100 mcg",
                familiaFarmacologica = "Hormonas tiroideas / T4 sintética.",
                paraQueSirve = "Tratamiento del hipotiroidismo. Funciona reemplazando la hormona T4 que la glándula tiroides no es capaz de producir en cantidades suficientes.\n" +
                        "\n" +
                        "Indicaciones principales: Regulación del metabolismo, control del gasto energético, mantención del desarrollo cerebral y de la función cardíaca.",
                conQueNoCombinar = "Antiácidos, calcio, hierro y sucralfato: Disminuyen drásticamente su absorción. Se debe separar la toma de levotiroxina por un mínimo de 4 horas de estos productos.\n" +
                        "\n" +
                        "Café, soja (soya) y exceso de fibra: Interfieren en su absorción. El medicamento debe tomarse solo con agua, entre 30 a 60 minutos antes del desayuno.\n" +
                        "\n" +
                        "Warfarina u otros anticoagulantes: Potencia el efecto anticoagulante, aumentando el riesgo de sufrir sangrados.\n" +
                        "\n" +
                        "Amiodarona y litio: Pueden alterar directamente la función de la tiroides.\n" +
                        "\n" +
                        "Antidepresivos tricíclicos: Puede incrementar los efectos secundarios a nivel cardíaco.\n" +
                        "\n" +
                        "Nota de la app: Si la dosis es muy alta puede provocar síntomas de hipertiroidismo (taquicardia, temblores, insomnio, pérdida de peso); si es baja, persistirán los síntomas de hipotiroidismo.",
                contraindicaciones = "Alergia a la levotiroxina o a cualquiera de los excipientes de la fórmula.\n" +
                        "\n" +
                        "Tiroiditis aguda o hipertiroidismo que no esté bajo tratamiento.\n" +
                        "\n" +
                        "Infarto agudo al miocardio (ataque al corazón) reciente y sin tratar.\n" +
                        "\n" +
                        "Insuficiencia suprarrenal que no haya sido tratada.",
                tipoReceta = "Se necesita receta médica",
                comoDesechar = "No arrojar al WC ni a la basura común: Evita desecharlo en el basurero doméstico o por el inodoro para proteger el medio ambiente.\n" +
                        "\n" +
                        "Puntos de reciclaje: Llevar a los contenedores especiales para medicamentos en desuso o vencidos ubicados en las farmacias autorizadas (puntos limpios / RETEMA)."
            )
        )
    }
}
