
/**
 * Write a description of class ARX_160 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ARX_160 extends Gun
{
    public ARX_160 (int dmg, int rnge, int ammo, int crit, int magSize, double ammoType, boolean equip, String name){
      super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public ARX_160(){
     super(40, 90, 40, 30, 100, 7.62, false, "ARX-160");   
    }
    
}
