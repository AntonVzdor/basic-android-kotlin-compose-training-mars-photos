package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApiService

interface MarsPhotosRepository {
    suspend fun getMarsPhoto(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
): MarsPhotosRepository{
    override suspend fun getMarsPhoto(): List<MarsPhoto> = marsApiService.getPhotos()
}