
/**
 * Write a description of class MP5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MP5 extends Gun
{
    public MP5 (int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
      super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public MP5(){
     super(25, 120, 20, 30, 100, 9.00, false, "MP5");   
    }
}
