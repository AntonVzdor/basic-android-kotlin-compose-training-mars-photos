package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApi

interface MarsPhotosRepository {
    suspend fun getMarsPhoto(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository(): MarsPhotosRepository{
    override suspend fun getMarsPhoto(): List<MarsPhoto> {
        return MarsApi.retrofitService.getPhotos()
    }
}