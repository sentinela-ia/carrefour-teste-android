package com.banco.carrefour.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface GithubApi {

    @GET("search/repositories?sort=stars")
    suspend fun getTrendingRepos(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") itemsPerPage: Int
    ): GithubSearchResponse

    companion object {
        const val BASE_URL = "https://api.github.com/"
    }
}