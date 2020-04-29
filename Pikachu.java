import java.util.jar.Attributes.Name;
import java.math.*;

public  class Pikachu extends Pokemon{
        public Pikachu(String name){
            super(name);
            setHP((int)(Math.random()*100));
            setMaxHP(this.hP);
            setATK(10);
            setMaxEXP(100);
           
        }
        public Pikachu(String name,int maxHP){
            super(name,maxHP);
            setATK(10);
            setMaxEXP(100);
           
        }
       

        public void attack(Pokemon enemy){
            System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
            enemy.damage(getATK()); 
            System.out.println(getName() + " HP: "+getHP()+"\t"+ enemy.getName()+" HP: "+enemy.getHP());


        }


}