package com.example.pmdm_pr9_pokemon;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class PokemonsViewModel extends AndroidViewModel {
    PokemonsRepositorio pokemonsRepositorio;
    MutableLiveData<List<Pokemon>> listPokemonsMutableLiveData = new MutableLiveData<>();

    public PokemonsViewModel(@NonNull Application application){
        super(application);
        pokemonsRepositorio = new PokemonsRepositorio();

        listPokemonsMutableLiveData.setValue(pokemonsRepositorio.obtener());
    }

    MutableLiveData<List<Pokemon>> obtener() {return listPokemonsMutableLiveData;}
    MutableLiveData<Pokemon> pokemonSeleccionado = new MutableLiveData<>();

    void seleccionar(Pokemon pokemon){
        pokemonSeleccionado.setValue(pokemon);
    }

    MutableLiveData<Pokemon> seleccionado() {
        return pokemonSeleccionado;
    }
}
