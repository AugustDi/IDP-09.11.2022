package com.triare.idp_3d.data.rest.service

import com.triare.idp_3d.data.rest.dto.DrinkResponseDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface DrinkService {
    @GET("filter.php")
    suspend fun getDrinks(
        @Query("a") a: String
    ): Response<DrinkResponseDto>
}