package com.example.pokemon.ui.pokemondetail

import com.example.pokemon.network.response.PokemonDetailResponse

interface PokemonDetailInteractor {
    interface PokemonDetailListener {

        fun onPokemonDetailFailed(e: Throwable, errorMessage: String)

        fun onPokemonDetailSuccess(response: PokemonDetailResponse)
    }

    fun getPokemonDetail(name: String?, listener: PokemonDetailListener)
}
