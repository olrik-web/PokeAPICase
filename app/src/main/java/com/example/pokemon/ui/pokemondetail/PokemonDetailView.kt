package com.example.pokemon.ui.pokemondetail

import com.example.pokemon.network.response.PokemonDetailResponse
import com.example.pokemon.ui.base.IView

interface PokemonDetailView : IView {
    fun setPokemonDetail(response: PokemonDetailResponse)
}