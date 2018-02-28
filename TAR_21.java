
/**
 * Write a description of class TAR_21 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TAR_21 extends Gun
{
    public TAR_21(int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
        super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public TAR_21(){
        super(35, 120, 30, 30, 100, 5.56, false, "TAR-21");
    }
}
