
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
    
    public Gun (int dmg, int rnge, int ammo, int magSize, int crit, double ammoType,boolean equip, String name){
        super(dmg,crit,rnge,ammo,ammoType,false, name);
        this.magSize = magSize;
        
    }
    public Gun(){
        this(10, 100, 20, 30, 50, 5.56,false, "Generic Gun");
    }
    
    public int attack(){
        return dmg;
    }
    
    public void hitOrMiss(){
       int hit = (int) (Math.random()*100 + 1);
       int crit = (int) (Math.random()*100 + 1);
       int accuracy = (int) (Math.random()*100 + 1);
       if (accuracy >= 50 && hit >= 50){
           System.out.println("You've hit the enemy");
           magSize -= 1;
        } else {
           System.out.println("You've missed");
           magSize -= 1;
        }   
    }
    
    public void reload(){
        if (magSize == 0){
            ammo -= 30;
            magSize = 0;
            magSize += 30;
            System.out.println("Reloading");
            System.out.println("Ammo: " + ammo);
            System.out.println("Ammo in magazine: " + magSize);
        } else if (magSize != 0){
            ammo -= magSize;
            magSize = 0;
            magSize += 30;
            System.out.println("Reloading");
            System.out.println("Ammo: " + ammo);
            System.out.println("Ammo in magazine: " + magSize);
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
