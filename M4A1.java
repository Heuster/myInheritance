
/**
 * Write a description of class M4A1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class M4A1 extends Gun 
{
    public M4A1 (int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip,String name, int accuracy){
      super(dmg, crit, rnge, ammo, magSize, ammoType, true, name);
    }
    public M4A1(){
     super(30, 120, 100, 30, 100, 5.56, true, "M4A1");   
    }
    
}
