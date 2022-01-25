package com.anggapambudi.pinterestbyanggapamb.api

import io.reactivex.Single
import retrofit2.http.*

interface ApiService {

    @GET("pinterest?q=random")
    fun getImageRandom(): Single<String>

    @GET("pinterest")
    fun searchImage(
        @Query("q") query: String?
    ): Single<String>

}