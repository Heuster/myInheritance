
/**
 * Write a description of class ACR here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class SCAR_H extends Gun

{
    public SCAR_H (int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, String name, int accuracy){
      super(dmg, crit, rnge, ammo, magSize, ammoType, name, accuracy);
    }
    public SCAR_H(){
     super(35, 90, 30, 30, 50, 5.56, "M4A1", 75);   
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
