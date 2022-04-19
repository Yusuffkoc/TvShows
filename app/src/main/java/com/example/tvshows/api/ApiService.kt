package com.example.tvshows.api

import com.example.tvshows.helper.Constant
import com.example.tvshows.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constant.END_POINT)
    suspend fun getTvShows(): Response<TvShowResponse>
}