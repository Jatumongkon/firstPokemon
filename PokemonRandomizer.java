import java.util.ArrayList;

import java.util.*;


public class PokemonRandomizer {

    public static ArrayList<Pokemon> getPokemon(int num){
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        if(num < 1){
            return pokemons;
        }
        
        int pokemonNumber = num+1;
        System.out.println("Pokemon around you");
        for(int i=0 ; i< pokemonNumber; ++i){
            int type=(int)(Math.random()*3);
            if(type == 0){
                pokemons.add(new Pikachu("Wild Pikachu"));
            }
            if(type == 1){
                pokemons.add(new Kabigon("Wild Kabigon"));
            }
            if(type == 2){
                pokemons.add(new Raichu("Wild Raichu"));
            }
        }
        return pokemons;
        
    }

}