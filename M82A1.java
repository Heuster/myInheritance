
/**
 * Write a description of class M82A1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class M82A1 extends Gun
{
    public M82A1(int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
        super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public M82A1(){
        super(40, 120, 70, 5, 20, .50, false, "Barret M82");
    }
    
}
