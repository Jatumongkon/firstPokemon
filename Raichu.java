import java.util.jar.Attributes.Name;
import java.math.*;

public  class Raichu  extends Pikachu{
        public Raichu(String name){
            super(name,500);
            setMaxEXP(100);
            setImage("Raichu.png");
            
        }
       

        public void attack(Pokemon enemy){
            System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
            enemy.damage(10);
            if(((int)(Math.random()*5))>3){
                enemy.damage(10);
                System.out.println("\t\t"+getName() + " use double attack");
            }
            System.out.println(getName() + " HP: "+getHP()+"\t"+ enemy.getName()+" HP: "+enemy.getHP());


        }


}