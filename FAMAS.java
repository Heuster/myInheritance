
/**
 * Write a description of class FAMAS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FAMAS extends Gun
{
    public FAMAS (int dmg, int rnge, int ammo, int crit, int magSize, double ammoType, boolean equip, String name){
      super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public FAMAS(){
     super(40, 120, 40, 30, 100, 7.62, false, "FAMAS");   
    }
}
