import java.util.*;
public abstract  class Pokemon
{
    protected int maxHP ;
    private int level ;
    private int eXP ;
    private int maxEXP ;
    protected String name;
    protected int hP;
    private int aTK;
    private int dEF; // Protect point;
    private String type ;
    private int staninaPoint ; // SP when pokemon use art for attack
    private int maxSP;
    private String voice;
    
    public Pokemon(String name){
        this.name = name;
    }
    public Pokemon(String name,int maxHP){
        this.name = name;
        this.hP = (int)(Math.random()*maxHP);
    }

    public abstract void attack(Pokemon enemy);
    
    public void setATK(int atk) {
        this.aTK =atk;
    }
    public int getATK(){
        return this.aTK; 
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
    
    public void levelUP(){
        this.maxHP = this.maxHP +10;
        this.aTK = this.aTK+2;
        this.dEF = this.dEF +1;
        this.eXP = 0;
        this.maxEXP = this.maxEXP +10;

    }
    public int getLevel(){
        return this.level;
    }
    public void setEXP( int exp){
        this.eXP= exp;
    }
    public void setMaxEXP(int maxEXP){
        this.maxEXP = maxEXP;
    }
    public int getEXP(){
        return this.eXP;
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

    public void setVoice(String voice){
        this.voice = voice;
    }
    public String getVoice(){
        return this.voice;
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