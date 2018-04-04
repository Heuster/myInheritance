
/**
 * Write a description of class CZ_805 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CZ_805 extends Gun
{
    public CZ_805 (int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
      super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public CZ_805 (){
     super(35, 120, 30, 30, 100, 5.56, false, "CZ_805");   
    }
    
}
