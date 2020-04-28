
public class  Kabigon extends Pokemon {
    public Kabigon(String name){
        super(name);
        setMaxHP((int)(Math.random()*500));
        this.hP =getMaxHP();
        setATK(5);
        
         
    }
   

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(getATK()); 
        System.out.println(getName() + " HP: "+getHP()+"\t"+ enemy.getName()+" HP: "+enemy.getHP());

    }


}