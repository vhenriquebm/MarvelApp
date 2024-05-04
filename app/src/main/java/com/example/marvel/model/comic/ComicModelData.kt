package com.example.marvel.model.comic

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ComicModelData(
    @SerializedName("result")
    val result: List<ComicModel>
) : Serializable
