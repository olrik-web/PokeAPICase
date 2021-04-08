package com.example.pokemon.ui.pokemonlist

import com.example.pokemon.network.response.PokemonListResponse
import com.example.pokemon.ui.base.IView

interface PokemonListView : IView {
    fun setPokemonList(response: PokemonListResponse)
}
