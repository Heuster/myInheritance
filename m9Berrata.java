
/**
 * Write a description of class Pistol here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class m9Berrata extends Gun
{
    
    public m9Berrata (int dmg, int crit, int ammo, int rnge, double ammoType, boolean equip, int magSize, String name){
        super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public m9Berrata(){
        super(10, 50, 30, 15, 30, 9.00, false, "M9 Berrata");
    }
    
}
