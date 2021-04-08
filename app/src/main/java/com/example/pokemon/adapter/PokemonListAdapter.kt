package com.example.pokemon.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pokemon.R
import com.example.pokemon.model.Pokemon
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_pokemon_detail.*
import kotlinx.android.synthetic.main.item_pokemon.*
import kotlinx.android.synthetic.main.item_pokemon.view.*

class PokemonListAdapter(
    private val dataList: ArrayList<Pokemon>,
    private val context: Context,
    private val listener: PokemonListener
) :
    RecyclerView.Adapter<PokemonListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_pokemon, parent, false))
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = dataList[position].name?.capitalize()
        holder.container.setOnClickListener {
            listener.onPokemonClickedListener(dataList[position])
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.tvName!!
        val container = itemView.pokemonContainer!!
    }

    interface PokemonListener {
        fun onPokemonClickedListener(pokemon: Pokemon)
    }
}