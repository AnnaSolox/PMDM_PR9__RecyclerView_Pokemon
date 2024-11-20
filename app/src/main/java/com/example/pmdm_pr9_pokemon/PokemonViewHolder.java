package com.example.pmdm_pr9_pokemon;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pmdm_pr9_pokemon.databinding.ViewholderPokemonBinding;

public class PokemonViewHolder extends RecyclerView.ViewHolder {
    final ViewholderPokemonBinding binding;

    public PokemonViewHolder(ViewholderPokemonBinding binding){
        super(binding.getRoot());
        this.binding = binding;
    }
}
