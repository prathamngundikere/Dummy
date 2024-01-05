package com.prathamngundikere.dummy.data

import com.prathamngundikere.dummy.data.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductsRepository {
    suspend fun getProductsList(): Flow<Result<List<Product>>>
}