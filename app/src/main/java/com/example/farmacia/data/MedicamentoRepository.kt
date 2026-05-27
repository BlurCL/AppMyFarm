package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.navigation.AppDestinations
import android.net.Uri

object MedicamentoRepository {
    private const val BASE_URL = "https://raw.githubusercontent.com/BlurCL/imagenes-farmacia/main/"

    /**
     * Genera la URL de la imagen. 
     * Si el nombre no tiene extensión, se le agrega ".png" por defecto.
     * Si ya tiene extensión (ej. .jpeg), se usa tal cual.
     */
    private fun getUrl(name: String): String {
        val fileNameWithExtension = if (name.contains(".")) name else "$name.png"
        return BASE_URL + Uri.encode(fileNameWithExtension)
    }

    private const val INFO_COMUN_DIABETES = "\n\nCombinaciones comunes\nMetformina + Empagliflozina: Muy usada. Baja azúcar + protege corazón y riñón. Riesgo: deshidratación y cetoacidosis si te enfermas. Suspender si tienes vómitos/diarrea.\nMetformina + Vildagliptina: Combinación fija muy frecuente. Control sin tanta hipoglucemia. Vigilar hígado y páncreas.\nMetformina + Glibenclamida: Clásica pero en desuso por riesgo de hipoglucemia y aumento de peso. Hoy se prefiere si no hay acceso a gliptinas/gliflozinas.\nTriple: Metformina + Empagliflozina + Vildagliptina: Para casos de difícil control. Suma beneficios renales/cardíacos + control de glucosa. Requiere súper buena hidratación y control médico estrecho.\n\nRegla de oro: Ninguno se combina con alcohol en exceso. Y todos necesitan ajuste si tu riñón o hígado falla.\n\nPara botar remedios vencidos en Santiago, la mayoría de las farmacias Cruz Verde, Salcobrand y Ahumada tienen contenedores Sigre. No los tires a la basura normal.\n\nEsto no reemplaza una consulta. Si estás tomando o te recetaron alguno, conversa con tu médico tratante o diabetólogo para dosis y controles."

    val medicamentos: List<Medicamento> = 
        AntibioticosDataSource.getMedicamentos(::getUrl) +
        AntialergicosDataSource.getMedicamentos(::getUrl) +
        AntidiabeticosDataSource.getMedicamentos(::getUrl) +
        AnticoagulantesDataSource.getMedicamentos(::getUrl) +
        DermatologicosDataSource.getMedicamentos(::getUrl) +
        CorticoidesDataSource.getMedicamentos(::getUrl) +
        GastrointestinalesDataSource.getMedicamentos(::getUrl) +
        AnalgesicosDataSource.getMedicamentos(::getUrl)

    // Agrupamos por categoría para mejorar el rendimiento de búsqueda
    private val medicamentosPorCategoria: Map<AppDestinations, List<Medicamento>> by lazy {
        medicamentos.groupBy { it.categoria }
    }

    fun getMedicamentosPorCategoria(categoria: AppDestinations): List<Medicamento> {
        return medicamentosPorCategoria[categoria] ?: emptyList()
    }
}
