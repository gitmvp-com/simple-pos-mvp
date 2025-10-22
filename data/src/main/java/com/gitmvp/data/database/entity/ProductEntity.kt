package com.gitmvp.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gitmvp.common.model.Product

@Entity(tableName = "products")
data class ProductEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val price: Double
)

fun ProductEntity.toProduct() = Product(
    id = id,
    name = name,
    price = price
)

fun Product.toEntity() = ProductEntity(
    id = id,
    name = name,
    price = price
)
