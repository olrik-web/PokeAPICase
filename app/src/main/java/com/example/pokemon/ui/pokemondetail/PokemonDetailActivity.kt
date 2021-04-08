package com.example.pokemon.ui.pokemondetail

import android.os.Bundle
import android.util.Log
import com.example.pokemon.R
import com.example.pokemon.network.response.PokemonDetailResponse
import com.example.pokemon.ui.base.BaseActivity
import com.example.pokemon.ui.pokemonlist.KEY_NAME
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_pokemon_detail.*
import kotlinx.android.synthetic.main.activity_pokemon_detail.tvName


class PokemonDetailActivity : BaseActivity(), PokemonDetailView {
   private var presenter: PokemonDetailPresenter? = null
    private var pokemonName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_detail)
        pokemonName = intent.getStringExtra(KEY_NAME)

        presenter = PokemonDetailPresenterImpl(this, PokemonDetailInteractorImpl())

        init()
    }

    private fun init() {
        presenter?.getPokemonDetail(pokemonName)
    }

    override fun setPokemonDetail(response: PokemonDetailResponse) {
        Picasso.with(this)
            .load(response.sprites?.frontImage)
            .placeholder(R.drawable.loading_animation)
            .into(ivImage)

        tvName.text = response.name?.capitalize()
        tvWeight.text = "Weight: ${response.weight?.div(10).toString()} kg"
        tvHeight.text = "Height: ${response.height?.div(10).toString()} m"
    }


    override fun showErrorMessage(errorMessage: String) {
        Log.e("error", "errorMessage: $errorMessage")
    }
}
