import  java.math.*;
public  class Bulbasaur extends Pokemon{
  public Bulbasaur(String name){
      super(name);
      setHP((int)(Math.random()*100));
      setMaxHP(this.hP);
      setATK(10);
      setMaxEXP(100);
      setImage("Bulbasaur.png");
  }
  
 

  public void attack(Pokemon enemy){
      System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
      enemy.damage(getATK()); 
      System.out.println(getName() + " HP: "+getHP()+"\t"+ enemy.getName()+" HP: "+enemy.getHP());
      specialAttack(enemy);
      

  }
  public void specialAttack(Pokemon enemy){
        if(getLevel()>3){
          if(((int)(Math.random()*20))>15){
            eatBerry();
            System.out.println("\t\t" + getName()+" Suck blood");
          }

      }
  }


}