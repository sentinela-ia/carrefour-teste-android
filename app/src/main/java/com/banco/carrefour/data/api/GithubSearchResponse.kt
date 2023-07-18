package com.banco.carrefour.data.api

import com.banco.carrefour.data.model.Repo
import com.google.gson.annotations.SerializedName

data class GithubSearchResponse(
    @SerializedName("total_count")
    val total: Int = 0,
    @SerializedName("items")
    val items: List<Repo> = emptyList(),
    val next: Int? = null
)