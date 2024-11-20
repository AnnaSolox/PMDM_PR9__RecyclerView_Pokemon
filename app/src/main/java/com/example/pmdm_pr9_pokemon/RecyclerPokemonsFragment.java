package com.example.pmdm_pr9_pokemon;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pmdm_pr9_pokemon.databinding.FragmentRecyclerPokemonsBinding;
import com.example.pmdm_pr9_pokemon.databinding.ViewholderPokemonBinding;

import java.util.List;

public class RecyclerPokemonsFragment extends Fragment {

    private FragmentRecyclerPokemonsBinding binding;
    private PokemonsViewModel pokemonViewModel;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentRecyclerPokemonsBinding.inflate(inflater,container,false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        pokemonViewModel = new ViewModelProvider(requireActivity()).get(PokemonsViewModel.class);
        navController = Navigation.findNavController(view);

        PokemonsAdapter pokemonsAdapter = new PokemonsAdapter();
        binding.recyclerView.setAdapter(pokemonsAdapter);

        pokemonViewModel.obtener().observe(getViewLifecycleOwner(), pokemonsAdapter::establecerLista);


    }

    class PokemonsAdapter extends RecyclerView.Adapter<PokemonViewHolder>{
        List<Pokemon> pokemons;

        @NonNull
        @Override
        public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new PokemonViewHolder(ViewholderPokemonBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
            Pokemon pokemon = pokemons.get(position);
            holder.binding.image.setImageResource(pokemon.image);
            holder.binding.name.setText(pokemon.name);

            holder.itemView.setOnClickListener(view -> {
                pokemonViewModel.seleccionar(pokemon);
                navController.navigate(R.id.action_recyclerPokemonsFragment_to_mostrarPokemonFragment);
            });
        }

        @Override
        public int getItemCount() {
            return pokemons != null ? pokemons.size() : 0;
        }

        public void establecerLista(List<Pokemon> pokemons){
            this.pokemons = pokemons;
            notifyDataSetChanged();
        }

        public Pokemon obtenerPokemon(int posicion){
            return pokemons.get(posicion);
        }
    }
}