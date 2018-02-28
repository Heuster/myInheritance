
/**
 * Write a description of class M416 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class M416 extends Gun
{
    public M416 (int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
      super(dmg, crit, rnge, ammo, magSize, ammoType,true, name);
    }
    public M416(){
     super(35, 120, 30, 30, 100, 5.56, true, "M416");   
    }
    
}
