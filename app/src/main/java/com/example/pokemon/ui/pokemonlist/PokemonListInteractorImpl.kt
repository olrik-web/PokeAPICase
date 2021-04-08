package com.example.pokemon.ui.pokemonlist

import com.example.pokemon.network.core.NetworkService
import com.example.pokemon.network.observer.PokemonListObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PokemonListInteractorImpl : PokemonListInteractor {
    override fun getPokemonList(listener: PokemonListInteractor.PokemonListListener) {
        NetworkService.service()!!.getPokemonList()
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(PokemonListObserver(listener))
    }

}
