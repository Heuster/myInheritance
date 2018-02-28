
/**
 * Write a description of class MK48 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MK48 extends Gun
{
    public MK48(int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
        super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public MK48(){
        super(35, 300, 30, 100 ,100, 5.56, false, "MK48");
    }
}
