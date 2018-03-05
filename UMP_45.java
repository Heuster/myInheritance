
/**
 * Write a description of class UMP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UMP_45 extends Gun
{
    public UMP_45 (int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
      super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public UMP_45(){
     super(25,100, 25, 25 ,100, 9.00, false, "UMP-45");   
    }
}
