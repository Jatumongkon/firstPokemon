
public class  Kabigon extends Pikachu {
    public Kabigon(String name){
        super(name);
        setHP((int)(Math.random()*500));
        
         
    }
   

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(5); 
        System.out.println(getName() + " HP: "+getHP()+"\t"+ enemy.getName()+" HP: "+enemy.getHP());

    }


}