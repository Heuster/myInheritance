
/**
 * Write a description of class L1A1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class L1A1 extends Gun
{
    public L1A1(int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
        super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public L1A1(){
        super(35, 120, 30, 30,100, 7.62, false, "L1A1");
    }
}
