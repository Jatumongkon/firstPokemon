import java.util.*;
public abstract  class Pokemon
{
    protected int maxHP ;
    private int level =1 ;
    private int EXP;
    private int maxEXP  ;
    protected String name;
    protected int hP;
    private int ATK;
    private int DEF; // Protect point;
    private String type ;
    private int staninaPoint ; // SP when pokemon use art for attack
    private int maxSP;
    private Scanner sc;
    
    
    public Pokemon(String name){
        this.name = name;
        
    }
    public Pokemon(String name,int HP){
        this.name = name;
        this.maxHP = ((int)(Math.random()*HP));
        this.hP = this.maxHP; 
        this.EXP = 0;
        this.maxEXP =30;
    }

    public abstract void attack(Pokemon enemy);
    
    public void setATK(int ATk) {
        this.ATK = ATk ;
    }
    public int getATK(){
        return this.ATK; 
    }
    
    public void setLevel(int level){
        this.level= level;
    }
    
    
    public void eatBerry(){
        this.hP = this.hP + 20;
       if (this.maxHP < this.hP){
            this.hP= this.maxHP ;
        } 
    }
    public int getMaxHP(){
        return this.maxHP;
    }
    public void setMaxHP(int maxHP){
        this.maxHP = maxHP;

    }

    public void expUP(int exp){
        this.EXP += exp;
        if(this.EXP > this.maxEXP){
            this.EXP = this.EXP-this.maxEXP;
            levelUP();
        }

    }

    public void levelUP(){
        this.maxHP = this.maxHP +10;
        this.ATK = this.ATK+2;
        this.DEF = this.DEF +1;
        this.EXP = 0;
        this.maxEXP = this.maxEXP +10;
        this.level+=1;

    }
    public int getLevel(){
        return this.level;
    }
    public void setEXP( int exp){
        this.EXP= exp;
    }
    public void setMaxEXP(int maxEXP){
        this.maxEXP = maxEXP;
    }
    public int getEXP(){
        return this.EXP;
    }
    public int getMaxEXP(){
        return this.maxEXP;
    }

    public void setType(String type){
        this.type = type ; 
    }
    public String getType(){
        return this.type;
    }

    public void setMaxSP(int sP){
        this.maxSP = sP;
    }
    public void plusSP(int sP){
        this.staninaPoint=this.staninaPoint + sP;
        if(this.maxHP <= this.staninaPoint){
            this.staninaPoint = this.maxHP;
        }
    }
    public int getSP(){
        return this.staninaPoint;
    }
    public int getMaxSP(){
        return this.maxSP;
    }


    public void setName( String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


    public boolean damage(int value){ 
        int currentHP = this.hP - value;
        if(this.hP == 0 ){
            return false;
        }
        if(currentHP >= 0){
            this.hP = currentHP;    
        }
        else
            {
                this.hP = 0;
            }
            return true;
       }
    public void setHP(int hp){
        this.hP =hp;
    }
    public int setHP(){
        return this.hP;
    }
    public int getHP(){
        return this.hP;
    }
    public String toString(){
        return name;
    }


   
   

}