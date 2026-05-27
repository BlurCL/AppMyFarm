package com.example.farmacia.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.farmacia.data.MedicamentoRepository
import com.example.farmacia.model.FormaFarmaceutica
import com.example.farmacia.model.Medicamento
import com.example.farmacia.navigation.AppDestinations
import com.example.farmacia.ui.components.FarmacoCard
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FarmaciaApp() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    var currentDestination by rememberSaveable { mutableStateOf(AppDestinations.INICIO) }
    var searchQuery by rememberSaveable { mutableStateOf("") }
    var active by rememberSaveable { mutableStateOf(false) }

    // Guardamos el medicamento seleccionado y su grupo de variantes
    var selectedMedicamento by remember { mutableStateOf<Medicamento?>(null) }
    var selectedGroup by remember { mutableStateOf<List<Medicamento>>(emptyList()) }
    
    var selectedTabIndex by rememberSaveable { mutableIntStateOf(0) }
    val tabs = listOf("Todos", "Comprimidos", "Jarabes")

    val gruposMedicamentos = remember(currentDestination, searchQuery, selectedTabIndex) {
        val baseList = if (currentDestination == AppDestinations.INICIO) {
            MedicamentoRepository.medicamentos
        } else {
            MedicamentoRepository.getMedicamentosPorCategoria(currentDestination)
        }

        val filteredBySearch = if (searchQuery.isEmpty()) {
            baseList
        } else {
            baseList.filter { 
                it.nombre.contains(searchQuery, ignoreCase = true) || 
                it.principioActivo.contains(searchQuery, ignoreCase = true) 
            }
        }

        val filteredByTab = when (selectedTabIndex) {
            1 -> filteredBySearch.filter { it.formaFarmaceutica == FormaFarmaceutica.COMPRIMIDO_CAPSULA }
            2 -> filteredBySearch.filter { it.formaFarmaceutica == FormaFarmaceutica.JARABE_SUSPENSION }
            else -> filteredBySearch
        }

        filteredByTab.groupBy { 
            it.principioActivo.lowercase() + it.formaFarmaceutica.name 
        }.values.toList().map { variantes ->
            variantes.sortedByDescending { it.id } 
        }
    }

    if (selectedMedicamento != null) {
        MedicationDetailScreen(
            inicial = selectedMedicamento!!,
            variantes = selectedGroup,
            onBack = { 
                selectedMedicamento = null 
                selectedGroup = emptyList()
            }
        )
    } else {
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet {
                    Column(
                        modifier = Modifier
                            .verticalScroll(rememberScrollState())
                            .padding(bottom = 16.dp)
                    ) {
                        Text(
                            "MyPharm - Categorías",
                            modifier = Modifier.padding(16.dp),
                            style = MaterialTheme.typography.titleLarge,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.Bold
                        )
                        AppDestinations.entries.forEach { destination ->
                            NavigationDrawerItem(
                                label = { Text(destination.label) },
                                selected = destination == currentDestination,
                                onClick = {
                                    currentDestination = destination
                                    searchQuery = ""
                                    selectedTabIndex = 0
                                    scope.launch { drawerState.close() }
                                },
                                icon = { Icon(destination.icon, contentDescription = null) },
                                modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                            )
                        }
                    }
                }
            }
        ) {
            Scaffold(
                containerColor = MaterialTheme.colorScheme.background,
                topBar = {
                    CenterAlignedTopAppBar(
                        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                            containerColor = MaterialTheme.colorScheme.primary,
                            titleContentColor = MaterialTheme.colorScheme.onPrimary,
                            navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
                        ),
                        title = {
                            Text(
                                text = "MyPharm",
                                fontWeight = FontWeight.Bold,
                                fontSize = 24.sp,
                                modifier = Modifier.clickable(
                                    interactionSource = remember { MutableInteractionSource() },
                                    indication = null
                                ) {
                                    currentDestination = AppDestinations.INICIO
                                    selectedMedicamento = null
                                    searchQuery = ""
                                    selectedTabIndex = 0
                                }
                            )
                        },
                        navigationIcon = {
                            IconButton(onClick = { scope.launch { drawerState.open() } }) {
                                Icon(Icons.Default.Menu, contentDescription = "Menu")
                            }
                        },
                        actions = {
                            // Logo eliminado por ahora
                        }
                    )
                }
            ) { innerPadding ->
                Column(
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SearchBar(
                        query = searchQuery,
                        onQueryChange = { searchQuery = it },
                        onSearch = { active = false },
                        active = active,
                        onActiveChange = { active = it },
                        placeholder = { Text("Busca tu fármaco") },
                        leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                        trailingIcon = {
                            if (searchQuery.isNotEmpty()) {
                                IconButton(onClick = { searchQuery = "" }) {
                                    Icon(Icons.Default.Clear, contentDescription = "Limpiar")
                                }
                            }
                        },
                        colors = SearchBarDefaults.colors(
                            containerColor = MaterialTheme.colorScheme.surface
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        shape = RoundedCornerShape(24.dp)
                    ) {
                        LazyColumn(modifier = Modifier.fillMaxWidth()) {
                            items(MedicamentoRepository.medicamentos.filter { 
                                it.nombre.contains(searchQuery, ignoreCase = true) 
                            }) { medicamento ->
                                ListItem(
                                    headlineContent = { Text(medicamento.nombre) },
                                    supportingContent = { Text(medicamento.especificacion) },
                                    modifier = Modifier.clickable {
                                        selectedMedicamento = medicamento
                                        selectedGroup = MedicamentoRepository.medicamentos.filter {
                                            it.principioActivo == medicamento.principioActivo && 
                                            it.formaFarmaceutica == medicamento.formaFarmaceutica
                                        }
                                        active = false
                                    }
                                )
                            }
                        }
                    }

                    TabRow(
                        selectedTabIndex = selectedTabIndex,
                        containerColor = MaterialTheme.colorScheme.background,
                        contentColor = MaterialTheme.colorScheme.primary,
                        divider = {}
                    ) {
                        tabs.forEachIndexed { index, title ->
                            Tab(
                                selected = selectedTabIndex == index,
                                onClick = { selectedTabIndex = index },
                                text = { 
                                    Text(
                                        text = title,
                                        style = MaterialTheme.typography.labelLarge,
                                        fontWeight = if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal
                                    ) 
                                }
                            )
                        }
                    }

                    if (gruposMedicamentos.isEmpty()) {
                        Text(
                            text = "No se encontraron resultados",
                            modifier = Modifier.padding(32.dp),
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.Gray
                        )
                    } else {
                        LazyColumn(
                            modifier = Modifier.fillMaxSize(),
                            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                            verticalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            val comprimidos = gruposMedicamentos.filter { it.first().formaFarmaceutica == FormaFarmaceutica.COMPRIMIDO_CAPSULA }
                            val jarabes = gruposMedicamentos.filter { it.first().formaFarmaceutica == FormaFarmaceutica.JARABE_SUSPENSION }
                            val otros = gruposMedicamentos.filter { it.first().formaFarmaceutica != FormaFarmaceutica.COMPRIMIDO_CAPSULA && it.first().formaFarmaceutica != FormaFarmaceutica.JARABE_SUSPENSION }

                            if (comprimidos.isNotEmpty()) {
                                item { SectionHeader("Comprimidos y Cápsulas") }
                                items(comprimidos) { grupo ->
                                    FarmacoCard(
                                        variantes = grupo, 
                                        onClick = { variantSelected ->
                                            selectedMedicamento = variantSelected
                                            selectedGroup = grupo
                                        }
                                    )
                                }
                            }

                            if (jarabes.isNotEmpty()) {
                                item { SectionHeader("Jarabes y Suspensiones") }
                                items(jarabes) { grupo ->
                                    FarmacoCard(
                                        variantes = grupo, 
                                        onClick = { variantSelected ->
                                            selectedMedicamento = variantSelected
                                            selectedGroup = grupo
                                        }
                                    )
                                }
                            }

                            if (otros.isNotEmpty()) {
                                item { SectionHeader("Otras presentaciones") }
                                items(otros) { grupo ->
                                    FarmacoCard(
                                        variantes = grupo, 
                                        onClick = { variantSelected ->
                                            selectedMedicamento = variantSelected
                                            selectedGroup = grupo
                                        }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SectionHeader(title: String) {
    Column(modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        HorizontalDivider(thickness = 1.dp, color = MaterialTheme.colorScheme.primary.copy(alpha = 0.2f))
    }
}
