
/**
 * Write a description of class ACR here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ACR extends Gun
{
    public ACR (int dmg, int rnge, int ammo,int crit, int magSize, double ammoType, boolean equip, String name){
      super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public ACR(){
     super(35, 120, 35, 30, 100, 5.56, false, "ACR");   
    }
    
}
