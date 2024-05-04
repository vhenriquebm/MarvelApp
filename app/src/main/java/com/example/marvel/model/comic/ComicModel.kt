package com.example.marvel.model.comic

import com.example.marvel.model.ThumbnailModel
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ComicModel(
    @SerializedName("int")
    val int: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("thumbnail")
    val thumbnailModel: ThumbnailModel
) : Serializable
