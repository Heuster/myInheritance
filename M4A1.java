
/**
 * Write a description of class M4A1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class M4A1 extends Gun 
{
    public M4A1 (int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, String name, int accuracy){
      super(dmg, crit, rnge, ammo, magSize, ammoType, name, accuracy);
    }
    public M4A1(){
     super(30, 90, 20, 30, 50, 5.56, "M4A1", 75);   
    }
    
    public int attack(){
        return dmg;
    }
    
    public boolean parry(){
        double rand = (int) (Math.random()*10 + 1);
        if (rand <= 5){
            return true;
        } else {
            return false;
        }
    }
}
