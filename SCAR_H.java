
/**
 * Write a description of class ACR here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class SCAR_H extends Gun

{
    public SCAR_H (int dmg, int rnge, int ammo,int crit,int magSize,double ammoType,boolean equip,String name){
      super(dmg, crit, rnge, ammo, magSize, ammoType, false, name);
    }
    public SCAR_H(){
     super(35, 90, 30, 30, 50, 5.56, false, "SCAR-H");   
    }
    
}
