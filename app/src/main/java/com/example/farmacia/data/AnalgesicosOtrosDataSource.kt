package com.example.farmacia.data

import com.example.farmacia.model.Medicamento

// Este archivo ya no es necesario porque los medicamentos se movieron a:
// - AntiepilepticosDataSource (Pregabalina)
// - AntipireticosDataSource (Tramadol)
// - AnalgesicosDataSource (Diclofenaco + Tramadol)

object AnalgesicosOtrosDataSource {
    fun getMedicamentos(getUrl: (String) -> String): List<Medicamento> {
        return emptyList()
    }
}
