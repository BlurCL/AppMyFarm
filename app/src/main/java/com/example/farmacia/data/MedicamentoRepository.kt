package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.navigation.AppDestinations
import android.net.Uri

object MedicamentoRepository {
    private const val BASE_URL = "https://raw.githubusercontent.com/BlurCL/imagenes-farmacia/main/"

    private fun getUrl(name: String): String {
        val fileNameWithExtension = if (name.contains(".")) name else "$name.png"
        return BASE_URL + Uri.encode(fileNameWithExtension)
    }

    val medicamentos: List<Medicamento> = 
        AntibioticosDataSource.getMedicamentos(::getUrl) +
        AntialergicosDataSource.getMedicamentos(::getUrl) +
        AntidiabeticosDataSource.getMedicamentos(::getUrl) +
        AnticoagulantesDataSource.getMedicamentos(::getUrl) +
        DermatologicosDataSource.getMedicamentos(::getUrl) +
        CorticoidesDataSource.getMedicamentos(::getUrl) +
        GastrointestinalesDataSource.getMedicamentos(::getUrl) +
        AnalgesicosDataSource.getMedicamentos(::getUrl) +
        AntiepilepticosDataSource.getMedicamentos(::getUrl) +
        RelajantesMuscularesDataSource.getMedicamentos(::getUrl) +
        AntipireticosDataSource.getMedicamentos(::getUrl) +
        // Nuevas categorías agregadas
        AntiparasitariosDataSource.getMedicamentos(::getUrl) +
        HipolipemiantesDataSource.getMedicamentos(::getUrl) +
        RespiratoriosDataSource.getMedicamentos(::getUrl) +
        PsicotropicosDataSource.getMedicamentos(::getUrl) +
        HormonasDataSource.getMedicamentos(::getUrl) +
        AntihipertensivosDataSource.getMedicamentos(::getUrl) +
        AntiviralesDataSource.getMedicamentos(::getUrl) +
        AntipsicoticosDataSource.getMedicamentos(::getUrl)

    private val medicamentosPorCategoria: Map<AppDestinations, List<Medicamento>> by lazy {
        medicamentos.groupBy { it.categoria }
    }

    fun getMedicamentosPorCategoria(categoria: AppDestinations): List<Medicamento> {
        return medicamentosPorCategoria[categoria] ?: emptyList()
    }
}
