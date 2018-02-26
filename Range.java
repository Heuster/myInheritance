
/**
 * Write a description of class Range here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public abstract class Range extends Weapons implements WeaponInterface
{
    int rnge; 
    int ammo;
    double ammoType; 
    boolean equip;
    String name;
    
    public Range(int dmg, int rnge, int ammo, int crit, double ammoType, boolean equip, String name){
        super(dmg,crit);
        this.rnge = rnge;
        this.ammo = ammo;
        this.ammoType = ammoType;
        this.equip = equip;
        this.name = name;
    }
    
    public void critHit(){
        int critChance = (int)(Math.random()*100 + 1);
        if (critChance <= crit){
            int critDmg = (int)(Math.random()*4 + 2);
            dmg = dmg * critDmg;
            System.out.println(dmg);
        }
    }
    
    public int attack(){
        return dmg;
    }
    
    public boolean parry(){
        double rand = (int) Math.random()*100;
        if (rand <= 50){
            System.out.println("The attack was parried");
            return true;
        } else {
            return false;
        }
    }
}
