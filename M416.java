
/**
 * Write a description of class M416 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class M416 extends Gun
{
    public M416 (int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, String name, int accuracy){
      super(dmg, crit, rnge, ammo, magSize, ammoType, name, accuracy);
    }
    public M416(){
     super(35, 90, 30, 30, 50, 5.56, "M416", 75);   
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
