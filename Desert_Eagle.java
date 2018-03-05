
/**
 * Write a description of class Desert_Eagle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Desert_Eagle extends Gun
{
    public Desert_Eagle (int dmg, int crit, int ammo, int rnge, double ammoType, boolean equip, int magSize, String name){
        super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public Desert_Eagle(){
        super(8, 50, 30, 15, 30, .44, false, "Desert Eagle");
    }
}
