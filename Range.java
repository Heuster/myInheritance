
/**
 * Write a description of class Range here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Range extends Weapons implements WeaponInterface
{
    int rnge; 
    int ammo;
    int ammoType; 
    int accuracy;
    String name;
    
    public Range(int dmg, int rnge, int ammo, int crit, int ammoType, int accuracy, String name){
        super(dmg,crit);
        this.rnge = rnge;
        this.ammo = ammo;
        this.ammoType = ammoType;
        this.accuracy = accuracy;
        this.name = name;
    }
    
}
