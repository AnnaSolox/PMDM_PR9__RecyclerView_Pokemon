package com.example.pmdm_pr9_pokemon;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.pmdm_pr9_pokemon.databinding.FragmentMostrarPokemonBinding;

public class MostrarPokemonFragment extends Fragment {
    private FragmentMostrarPokemonBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentMostrarPokemonBinding.inflate(inflater,container,false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        PokemonsViewModel pokemonsViewModel = new ViewModelProvider(requireActivity()).get(PokemonsViewModel.class);

        pokemonsViewModel.seleccionado().observe(getViewLifecycleOwner(), pokemon -> {
            binding.name.setText(pokemon.name);
            Glide.with(requireContext()).load(pokemon.image).into(binding.image);
            binding.description.setText(pokemon.flavor_text);
        });
    }
}