

public class Pokemon
{
    private int maxHP ;
    private int level = 1;
    private int eXP=0;
    private String name;
    private int hP;
    private int aTK ;
    private int dEF ; //Protect point;

    private String type ; 
    
    public attacked( int aTK)
    {
        return hP = hP -(aTK-dEF);

    }
    public eatBerry(){
        hP = hP + 20;
        if (maxHP < hP){
            maxHP = hP;
        }
    }
    
    public levelUP(){
        maxHP = maxHP +10;
        aTK = aTK+2;
        dEF = dEF +1;
    }

   

}