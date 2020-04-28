import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tranner {
    
    private ArrayList<Pokemon> bag ;
    private Scanner sc;
    public Tranner(){
        bag = new ArrayList<Pokemon>();
        bag.add(new Pikachu("Pikachu"));
        bag.add(new Raichu("My Raichu"));
        

    }
    
    public void play(){
        String cmd  ;
        Pokemon enemy = new Pikachu("Pikachu fo enemy");
        sc = new Scanner(System.in);
        do{ System.out.println("menu: print:print name Pokemon in bag \tChangeName\tquit:exit game\t\ncatch");
            cmd = sc.nextLine();
            if(cmd.equals("print")){
                printPokemon(bag);
            }
            if(cmd.equals("ChangeName")){
                ChangeName();
            }
            if(cmd.equals("attack")){
               
                
            }
            if(cmd.equals("catch")){
                catchPokemon();

            }


        }while(!(cmd.equals("quit")));

    }

    public void printPokemon(ArrayList<Pokemon> pokemons){
           
        int number = 0 ;
        for(Pokemon p: pokemons){
            System.out.println("No. "+ number +" "+p.getName() + " HP: "+p.getHP());
            number++;
        }

    }
   
    public void  catchPokemon(){
        System.out.println("Cath Pokemon");
        ArrayList<Pokemon> pokemons = PokemonRandomizer.getPokemon(5);
            
            int no= 0;
            int noCatch = 0;
            printPokemon(pokemons);
            System.out.println("You catch(-1 to run):");
            no = sc.nextInt();
            sc.nextLine();
            if(no < 0){
                System.out.println("run !!");
                return ; 

            }
            Pokemon wildPokemon = pokemons.get(no);
            
            System.out.println("Select your pokemon :");
            printPokemon(bag);
           
           
            no = sc.nextInt();
            sc.nextLine();
            Pokemon myPokemon = bag.get(no);

            boolean isWin = false;
            do{
                myPokemon.attack(wildPokemon);
                if(wildPokemon.getHP()== 0){
                    isWin = true;
                    break;
                }
                else {
                    wildPokemon.attack(myPokemon);
                    if(myPokemon.getHP()== 0){
                        isWin = false;
                        break;
                    }
                }
            }while(true);

            if(isWin == true){
                bag.add(wildPokemon);
                System.out.println("You catch !!!!");
            }
            else{
                System.out.println(wildPokemon.getName() +" win");
            }
            
        
    }

    
    public void ChangeName(){ //over
        System.out.println("Select your Pokemon to Change name");
        printPokemon(bag);
        int no = 0;
        no = sc.nextInt();
        sc.nextLine();
        System.out.println("New name :");
        bag.get(no).setName(sc.nextLine());
        
    }


}
