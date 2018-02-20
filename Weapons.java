
/**
 * Abstract class Weapons - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
import java.lang.Math;
public abstract class Weapons extends Item
{
    int dmg;
    int crit;
    
    public Weapons (int dmg, int crit){
        this.dmg = dmg;
        this.crit = crit;
    }
    
    public int attack(){
        dmg += 15;
        return dmg;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean parry(){
        double rand = (int) Math.random()*100;
        if (rand <= 50){
            System.out.println("The attack was parried");
            return true;
        } else {
            return false;
        }
    }
}
