import java.util.*;

public class Tranner {
    
    private ArrayList<Pokemon> bag ;
    public Tranner(){
        bag = new ArrayList<Pokemon>();
        bag.add(new Pikachu("Pikachu"));
        bag.add(new Pikachu("Pikachu2"));
        

    }
    
    public void play(){
        String cmd  ;
        Pokemon enemy = new Pikachu("Pikachu fo enemy");
        Scanner sc = new Scanner(System.in);
        do{ System.out.println("menu: print:print name Pokemon in bag \tChangeName\tq:exit game\t attack:");
            cmd = sc.nextLine();
            if(cmd.equals("print")){
                printPokemon();
            }
            if(cmd.equals("ChangeName")){
                ChangeName();
            }
            if(cmd.equals("attack")){
                findPokemonInBag("Pikachu").attack(enemy);
                
            }


        }while(!(cmd.equals("q")));

    }

    public void printPokemon(){
        System.out.println("\t"+"Pokemon in bag");    
        for(Pokemon p: bag){
            System.out.println(p.getName());
        }

    }
    public Pokemon findPokemonInBag(String name){
        for(Pokemon p:bag){
            if(p.getName().equals(name)){
                return p;  
            }
        }
        return null;
    }

    public void ChangeName(){
        System.out.println("Select your Pokemon to Change name");
        printPokemon();
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Select name :");
        name = sc.nextLine();
        for(Pokemon p:bag){
            if(p.getName().equals(name)){
                System.out.print("New name:");
                p.setName(sc.nextLine());
                System.out.println("Complete !!");
                break; 
            }

        }
    }


}
