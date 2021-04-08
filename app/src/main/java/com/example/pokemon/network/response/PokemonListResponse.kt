package com.example.pokemon.network.response

import com.google.gson.annotations.SerializedName
import com.example.pokemon.model.Pokemon
import com.example.pokemon.model.Sprite

class PokemonListResponse : BaseResponse() {

    @SerializedName("count")
    var count: Int? = null

    @SerializedName("sprites")
    var sprites: Sprite? = null

    @SerializedName("results")
    var results: ArrayList<Pokemon>? = null

}