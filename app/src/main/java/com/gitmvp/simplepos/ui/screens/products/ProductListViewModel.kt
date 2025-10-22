package com.gitmvp.simplepos.ui.screens.products

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gitmvp.common.model.Product
import com.gitmvp.domain.usecase.AddProductUseCase
import com.gitmvp.domain.usecase.GetProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductListViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase,
    private val addProductUseCase: AddProductUseCase
) : ViewModel() {

    val products: StateFlow<List<Product>> = getProductsUseCase()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    fun addProduct(name: String, price: Double) {
        viewModelScope.launch {
            val product = Product(
                id = 0,
                name = name,
                price = price
            )
            addProductUseCase(product)
        }
    }
}
