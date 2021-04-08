package com.example.pokemon.network.response

import com.google.gson.annotations.SerializedName
import com.example.pokemon.model.Sprite

class PokemonDetailResponse : BaseResponse() {

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("sprites")
    var sprites: Sprite? = null

    @SerializedName("weight")
    var weight: Double? = null

    @SerializedName("height")
    var height: Double? = null

}