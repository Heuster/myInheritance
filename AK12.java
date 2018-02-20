
/**
 * Write a description of class AK12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class AK12 extends Gun
{
    public AK12 (int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, String name, int accuracy){
      super(dmg, crit, rnge, ammo, magSize, ammoType, name, accuracy);
    }
    public AK12(){
     super(40, 90, 40, 30, 50, 7.62, "AK12", 75);   
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
