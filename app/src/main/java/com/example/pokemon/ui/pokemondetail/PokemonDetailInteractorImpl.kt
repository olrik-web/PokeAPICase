package com.example.pokemon.ui.pokemondetail

import com.example.pokemon.network.core.NetworkService
import com.example.pokemon.network.observer.PokemonDetailObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PokemonDetailInteractorImpl : PokemonDetailInteractor {
    override fun getPokemonDetail(name: String?, listener: PokemonDetailInteractor.PokemonDetailListener) {
        NetworkService.service()!!.getPokemonDetail(name)
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(PokemonDetailObserver(listener))
    }

}