
/**
 * Write a description of class AUG_A3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AUG_A3 extends Gun
{
    public AUG_A3 (int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
      super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public AUG_A3 (){
     super(35, 120, 30, 30, 100, 5.56, false, "AUG_A3");   
    }
}
