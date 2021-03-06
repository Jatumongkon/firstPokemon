import java.util.ArrayList;




public class PokemonRandomizer {

    public static ArrayList<Pokemon> getPokemon(int num){
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        if(num < 1){
            return pokemons;
        }
        
        int pokemonNumber = num+1;
        System.out.println("Pokemon around you");
        for(int i=0 ; i< pokemonNumber; ++i){
            int type=(int)(Math.random()*6);
            if(type == 0){
                pokemons.add(new Pikachu("Wild Pikachu"));
            }
            if(type == 1){
                pokemons.add(new Kabigon("Wild Kabigon"));
            }
            if(type == 2){
                pokemons.add(new Raichu("Wild Raichu"));
            }
            if(type == 3){
                pokemons.add(new Charmander("Wild Charmander"));
            }
            if(type == 4){
                 pokemons.add(new Squirtle("Wild Squirtle"));
            }
            if(type == 5){
                pokemons.add(new Bulbasaur("Wild Bulbasaur"));
            }
        }
        return pokemons;
        
    }

}