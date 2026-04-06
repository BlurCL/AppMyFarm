package com.example.farmacia.data

import com.example.farmacia.model.Medicamento
import com.example.farmacia.navigation.AppDestinations

object MedicamentoRepository {
    val medicamentos = listOf(
        Medicamento(
            id = 1,
            nombre = "Amoxicilina 500mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://raw.githubusercontent.com/BlurCL/imagenes-farmacia/main/Amoxicilina%20500mg.png",
            especificacion = "Cápsula de 500 mg",
            dosis = "1 cápsula cada 8 horas por 7 días",
            paraQueSirve = "Infecciones bacterianas respiratorias, urinarias y de piel."
        ),
        Medicamento(
            id = 4,
            nombre = "Azitromicina 500mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/azitromicina%20500mg.png?raw=true",
            especificacion = "Tableta de 500 mg",
            dosis = "1 tableta al día por 3 a 5 días",
            paraQueSirve = "Infecciones bacterianas específicas como bronquitis o neumonía."
        ),
        Medicamento(
            id = 5,
            nombre = "Amoxicilina 750mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/amoxicilina%20750mg.png?raw=true",
            especificacion = "Comprimido de 750 mg",
            dosis = "1 comprimido cada 12 horas",
            paraQueSirve = "Infecciones bacterianas de mayor intensidad."
        ),
        Medicamento(
            id = 6,
            nombre = "Amoxicilina Jarabe 250mg/5ml",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Amoxicilina%20jarabe%20250mg-5ml%20frasco%20de%2060ml%20suspension%20oral.png?raw=true",
            especificacion = "Suspensión oral, frasco de 60 ml",
            dosis = "Según peso del niño, cada 8 horas",
            paraQueSirve = "Uso pediátrico para infecciones respiratorias y de oído."
        ),
        Medicamento(
            id = 7,
            nombre = "Amoxicilina Jarabe 500mg/5ml",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Amoxicilina%20jarabe%20500mg-5ml%20frasco%20de%2060ml%20suspension%20oral.png?raw=true",
            especificacion = "Suspensión oral, frasco de 60 ml",
            dosis = "Según indicación médica, cada 8 horas",
            paraQueSirve = "Infecciones infantiles que requieren mayor concentración."
        ),
        Medicamento(
            id = 8,
            nombre = "Amoxicilina / Ácido Clavulánico 875/125mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Amoxicilina-Acido%20Clavul%C3%A1nico%20875mg-125mg%20.png?raw=true",
            especificacion = "Comprimido recubierto",
            dosis = "1 comprimido cada 12 horas",
            paraQueSirve = "Infecciones resistentes por bacterias productoras de betalactamasas."
        ),
        Medicamento(
            id = 9,
            nombre = "Azitromicina Jarabe 200mg/5ml",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Azitromicina%20jarabe%20200mg-5ml%20frasco%2030%20ml%20suspension%20oral.png?raw=true",
            especificacion = "Suspensión oral, frasco de 30 ml",
            dosis = "Dosis única diaria por 3 días",
            paraQueSirve = "Infecciones respiratorias en niños."
        ),
        Medicamento(
            id = 10,
            nombre = "Cefadroxilo 500mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Cefadroxilo%20500mg.png?raw=true",
            especificacion = "Cápsula de 500 mg",
            dosis = "1 cápsula cada 12 horas",
            paraQueSirve = "Infecciones de piel, tejidos blandos y urinarias."
        ),
        Medicamento(
            id = 11,
            nombre = "Cefadroxilo Jarabe 250mg/5ml",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Cefadroxilo%20jarabe%20250mg-5ml%20frasco%2060%20ml%20suspension%20oral.png?raw=true",
            especificacion = "Suspensión oral, frasco de 60 ml",
            dosis = "Según peso del niño, cada 12 o 24 horas",
            paraQueSirve = "Infecciones faríngeas y de piel en pediatría."
        ),
        Medicamento(
            id = 12,
            nombre = "Cefradina 500mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Cefradina%20500mg.png?raw=true",
            especificacion = "Cápsula de 500 mg",
            dosis = "1 cápsula cada 6 horas",
            paraQueSirve = "Infecciones bacterianas generales y profilaxis quirúrgica."
        ),
        Medicamento(
            id = 13,
            nombre = "Cefuroxima 500mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Cefuroxima%20500mg.png?raw=true",
            especificacion = "Tableta de 500 mg",
            dosis = "1 tableta cada 12 horas",
            paraQueSirve = "Bronquitis, faringitis y enfermedad de Lyme temprana."
        ),
        Medicamento(
            id = 14,
            nombre = "Ciprofloxacino 500mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/ciprofloxacino%20500mg.png?raw=true",
            especificacion = "Tableta de 500 mg",
            dosis = "1 tableta cada 12 horas",
            paraQueSirve = "Infecciones urinarias graves, óseas y articulares."
        ),
        Medicamento(
            id = 15,
            nombre = "Claritromicina 500mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Claritromicina%20500mg.png?raw=true",
            especificacion = "Tableta de 500 mg",
            dosis = "1 tableta cada 12 horas",
            paraQueSirve = "Erradicación de H. pylori e infecciones respiratorias."
        ),
        Medicamento(
            id = 16,
            nombre = "Cloxacilina 500mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/cloxacilina%20500%20mg.png?raw=true",
            especificacion = "Cápsula de 500 mg",
            dosis = "1 cápsula cada 6 horas",
            paraQueSirve = "Infecciones por estafilococos sensibles."
        ),
        Medicamento(
            id = 17,
            nombre = "Doxiciclina 100mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Doxiciclina%20100mg.png?raw=true",
            especificacion = "Cápsula de 100 mg",
            dosis = "1 cápsula cada 12 o 24 horas",
            paraQueSirve = "Acné severo, enfermedades de transmisión sexual y malaria."
        ),
        Medicamento(
            id = 18,
            nombre = "Eritromicina 500mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Eritromicina%20500mg.png?raw=true",
            especificacion = "Tableta de 500 mg",
            dosis = "1 tableta cada 6 horas",
            paraQueSirve = "Infecciones en pacientes alérgicos a la penicilina."
        ),
        Medicamento(
            id = 19,
            nombre = "Flucloxacilina 500mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/flucloxacilina%20500mg.png?raw=true",
            especificacion = "Cápsula de 500 mg",
            dosis = "1 cápsula cada 6 horas",
            paraQueSirve = "Infecciones de piel como impétigo o celulitis."
        ),
        Medicamento(
            id = 20,
            nombre = "Flucloxacilina Jarabe 250mg/5ml",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/flucloxacilina%20jarabe%20250mg-5ml%20suspension%20oral%2060%20ml.png?raw=true",
            especificacion = "Suspensión oral",
            dosis = "Según peso, cada 6 horas",
            paraQueSirve = "Infecciones cutáneas bacterianas en niños."
        ),
        Medicamento(
            id = 21,
            nombre = "Levofloxacino 500mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Levofloxacino%20500mg.png?raw=true",
            especificacion = "Tableta de 500 mg",
            dosis = "1 tableta al día",
            paraQueSirve = "Neumonía y sinusitis bacteriana aguda."
        ),
        Medicamento(
            id = 22,
            nombre = "Nitrofurantoína 100mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/nitrofurantoina%20macrocristales%20100mg.png?raw=true",
            especificacion = "Cápsula de 100 mg",
            dosis = "1 cápsula cada 6 u 8 horas",
            paraQueSirve = "Tratamiento y prevención de infecciones urinarias no complicadas."
        ),
        Medicamento(
            id = 23,
            nombre = "Tetraciclina 500mg",
            categoria = AppDestinations.ANTIBIOTICOS,
            imagenUrl = "https://github.com/BlurCL/imagenes-farmacia/blob/main/Tetraciclina%20500mg.png?raw=true",
            especificacion = "Cápsula de 500 mg",
            dosis = "1 cápsula cada 6 horas",
            paraQueSirve = "Infecciones oculares, de piel y respiratorias."
        )
    )

    fun getMedicamentosPorCategoria(categoria: AppDestinations): List<Medicamento> {
        return medicamentos.filter { it.categoria == categoria }
    }
}
