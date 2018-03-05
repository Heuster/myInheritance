
/**
 * Write a description of class P90 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class P90 extends Gun
{
    public P90 (int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
      super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public P90(){
     super(25, 150, 20, 50, 100, 5.7, false, "P90");   
    }
}
