
/**
 * Write a description of class GALIL_ACE here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GALIL_ACE extends Gun
{
    public GALIL_ACE(int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
        super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public GALIL_ACE(){
        super(35, 120, 30, 30, 100, 7.62, false, "Galil ACE");
    }
}
