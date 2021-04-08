package com.example.pokemon.ui.pokemondetail

import com.example.pokemon.ui.base.IPresenter

interface PokemonDetailPresenter : IPresenter {
    fun getPokemonDetail(name: String?)
}