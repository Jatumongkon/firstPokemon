

public  class Squirtle extends Pokemon{
    public Squirtle(String name){
        super(name);
        setHP((int)(Math.random()*100));
        setMaxHP(this.hP);
        setATK(10);
        setMaxEXP(100);
        setImage("Squirtle.png");
    }
   

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(getATK()); 
        System.out.println(getName() + " HP: "+getHP()+"\t"+ enemy.getName()+" HP: "+enemy.getHP());
        specialAttack(enemy);

    }
    public void specialAttack(Pokemon enemy){
      System.out.println(getLevel());
        if(getLevel()>3){
          if(((int)(Math.random()*20))>10){
            enemy.damage(10); 
            System.out.println("\t\t" + getName()+" specialAttack");
          }

        }


    }
}