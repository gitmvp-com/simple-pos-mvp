package com.gitmvp.data.repository

import com.gitmvp.common.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepository {
    fun getProducts(): Flow<List<Product>>
    suspend fun addProduct(product: Product)
    suspend fun deleteProduct(product: Product)
}
