
/**
 * Write a description of class M110 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class M110 extends Gun
{
    public M110(int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
        super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public M110(){
        super(40, 120, 50, 10, 150, 7.62, false, "M110");
    }
}
