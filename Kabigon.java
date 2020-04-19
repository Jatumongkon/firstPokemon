
public class  Kabigon extends Pikachu {
    public Kabigon(String name){
        super(name);
        setHP((int)(Math.random() *1000));
         
    }
   

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());

    }


}