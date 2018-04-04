
/**
 * Write a description of class FN_FAL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FN_FAL extends Gun
{
    public FN_FAL(int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
        super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public FN_FAL(){
        super(40, 120, 30, 30,100, 7.62, false, "FN-FAL");
    }
}
