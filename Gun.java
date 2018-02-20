
/**
 * Write a description of class ACR here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public abstract class Gun extends Range
{
    int magSize;
    int accuracy;
    
    public Gun (int dmg, int rnge, int ammo, int magSize, int crit, double ammoType, String name, int accuracy){
        super(dmg,crit,rnge,ammo,ammoType,accuracy, name);
        this.magSize = magSize;
        this.accuracy = accuracy;
    }
    public Gun(){
        this(10, 100, 90, 30, 50, 5.56, "Generic Gun", 75);
    }
    
    public int attack(){
        return dmg;
    }
    
    public void bulletCount(){
        System.out.println("Current ammo in magazine in " + name + ": " + magSize); 
    }
    
    public void hitOrMiss(){
       int hit = (int) (Math.random()*100 + 1);
       int crit = (int) (Math.random()*100 + 1);
       //int accuracy = (int) Math.random()*100;
       if (accuracy >= 50 && hit >= 50){
           System.out.println("You've hit the enemy");
           magSize -= 1;
           
        } else {
           System.out.println("You've missed");
           magSize -= 1;
           
        }   
    }
    
    
    public boolean parry(){
        double rand = (int) (Math.random()*10 + 1);
        if (rand <= 5){
            System.out.println("The attack was parried");
            return true;
        } else {
            return false;
        }
        
    }
}
