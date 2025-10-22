package com.gitmvp.domain.usecase

import com.gitmvp.common.model.Product
import com.gitmvp.data.repository.ProductRepository
import javax.inject.Inject

class AddProductUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    suspend operator fun invoke(product: Product) {
        productRepository.addProduct(product)
    }
}
