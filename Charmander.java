
public  class Charmander extends Pokemon{
    public Charmander(String name){
        super(name);
        setHP((int)(Math.random()*100));
        setMaxHP(this.hP);
        setATK(10);
        setMaxEXP(100);
       
    }
    public Charmander(String name,int maxHP){
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