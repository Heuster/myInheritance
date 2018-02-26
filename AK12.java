
/**
 * Write a description of class AK12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class AK12 extends Gun
{
    public AK12 (int dmg, int rnge, int ammo, int crit, int magSize, double ammoType, boolean equip, String name){
      super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public AK12(){
     super(40, 90, 40, 30, 50, 7.62, false, "AK12");   
    }
    
}
