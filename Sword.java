
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Sword extends Melee implements WeaponInterface 
{
    public Sword (int dmg, int crit){
        super(dmg, crit);
    }
    
    public int attack(){
        return dmg;
    }
    
    public boolean parry(){
        double rand = (int) Math.random()*10;
        if (rand <= 5){
            return true;
        } else {
            return false;
        }
    }
    
    
}
