package com.example.pokemon.network.core

import com.example.pokemon.network.response.PokemonDetailResponse
import com.example.pokemon.network.response.PokemonListResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {

    @GET("api/v2/pokemon/")
    fun getPokemonList(): Observable<PokemonListResponse>

    @GET("api/v2/pokemon/{name}")
    fun getPokemonDetail(@Path("name") name: String?): Observable<PokemonDetailResponse>
}