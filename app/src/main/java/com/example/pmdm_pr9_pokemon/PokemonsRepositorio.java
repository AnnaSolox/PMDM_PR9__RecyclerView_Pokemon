package com.example.pmdm_pr9_pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokemonsRepositorio {
    List<Pokemon> pokemons = new ArrayList<>();

    PokemonsRepositorio(){
        pokemons.add(new Pokemon("Bulbasaur", "Una rara semilla le fue plantada en el lomo al nacer. La planta brota y crece con este Pokémon.", R.drawable.bulbasaur));
        pokemons.add(new Pokemon("Ivysaur", "Este Pokémon tiene un bulbo en el lomo. Dicen que,al absorber nutrientes, el bulbo se transforma en una flor grande.",R.drawable.ivysaur));
        pokemons.add(new Pokemon("Venusaur", "Después de un día de lluvia, la flor de su lomo tiene un aroma más potente y atrae a otros Pokémon.",R.drawable.venusaur));
        pokemons.add(new Pokemon("Charmander","La llama de su cola indica la fuerza vital de Charmander. Será brillante si está sano.", R.drawable.charmander));
        pokemons.add(new Pokemon("Charmeleon","Al agitar su ardiente cola, eleva poco a poco la temperatura a su alrededor para sofocar a sus rivales.", R.drawable.charmeleon));
        pokemons.add(new Pokemon("Charizard","Cuando se enfurece de verdad, la llama de la punta de su cola se vuelve de color azul claro.", R.drawable.charizard));
        pokemons.add(new Pokemon("Squirtle", "Se protege con su caparazón y luego contraataca lanzando agua a presión cuando tiene oportunidad.", R.drawable.squirtle));
        pokemons.add(new Pokemon("Wartortle", "Tiene una cola larga y peluda que simboliza la longevidad y lo hace popular entre los mayores.", R.drawable.wartortle));
        pokemons.add(new Pokemon("Blastoise", "Aumenta de peso deliberadamente para contrarrestar la fuerza de los chorros de agua que dispara.", R.drawable.blastoise));
        pokemons.add(new Pokemon("Caterpie", "Para protegerse despide un hedor horrible de sus antenas, con el que repele a sus enemigos.", R.drawable.caterpie));
        pokemons.add(new Pokemon("Metapod", "Como en este estado solo puede endurecer su coraza, permanece inmóvil a la espera de evolucionar.", R.drawable.metapod));
        pokemons.add(new Pokemon("Butterfree", "Adora el néctar de las flores. Una pequeña cantidad de polen le basta para localizar prados floridos.", R.drawable.butterfree));
        pokemons.add(new Pokemon("Weedle", "El aguijón de la cabeza es muy puntiagudo. Se alimenta de hojas oculto en la espesura de bosques y praderas.", R.drawable.weedle));
        pokemons.add(new Pokemon("Kakuna", "Se esconde de sus atacantes entre las ramas de los árboles mientras espera a evolucionar.", R.drawable.kakuna));
        pokemons.add(new Pokemon("Beedrill", "Tiene tres aguijones venenosos, dos en las patas anteriores y uno en la parte baja del abdomen, con los que ataca a sus enemigos una y otra vez.", R.drawable.beedrill));
        pokemons.add(new Pokemon("Pidgey", "Muy común en bosques y selvas. Aletea al nivel del suelo para levantar la gravilla.", R.drawable.pidgey));
        pokemons.add(new Pokemon("Pidgeotto", "Su extraordinaria vitalidad y resistencia le permiten cubrir grandes distancias del territorio que habita en busca de presas.", R.drawable.pidgeotto));
        pokemons.add(new Pokemon("Pidgeot", "Este Pokémon vuela a una velocidad de 2 mach en busca de presas. Sus grandes garras son armas muy peligrosas.", R.drawable.pidgeot));
        pokemons.add(new Pokemon("Rattata", "Vive allí donde haya comida disponible. Busca todo el día, sin descanso, algo comestible.", R.drawable.rattata));
        pokemons.add(new Pokemon("Raticate", "Gracias a las pequeñas membranas de las patas traseras, puede nadar por los ríos para capturar presas.", R.drawable.raticate));
    }

    List<Pokemon> obtener() {return pokemons;}
}
