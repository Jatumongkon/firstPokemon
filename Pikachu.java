import java.util.jar.Attributes.Name;
import java.math.*;

public  class Pikachu extends Pokemon{
        public Pikachu(String name){
            super(name);
            setHP((int)(Math.random() *1000));
             
        }
       

        public void attack(Pokemon enemy){
            System.out.println("Pokemon " + getName() + " attack " + enemy.getName());


        }


}