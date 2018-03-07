
/**
 * Write a description of class ACR here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public abstract class Gun extends Range
{
    int magSize;
    boolean calcCrit = true;
    int totalDmg = 0;
    
    public Gun (int dmg, int rnge, int ammo, int magSize, int crit, double ammoType,boolean equip, String name){
        super(dmg,crit,rnge,ammo,ammoType,false,name);
        this.magSize = magSize;
    }
    
    public int attack(){
        return dmg;
    }
    
    public boolean mathCrit(){
        return calcCrit;
    }
    
    public int dmgDealt(){
        return totalDmg;
    }
    
    public void critHit(){
        int critChance = (int)(Math.random()*100 + 1);
        int totalCrit = 0;
        if (mathCrit() == true){
            if (critChance <= crit){
                int critDmg = (int)(Math.random()*4 + 2);
                totalCrit = crit * critDmg;
                totalDmg = totalCrit + attack();
                System.out.println(totalDmg);
            }
        }
    }
    
    public void hitOrMiss(){
       int hit = (int) (Math.random()*100 + 1);
       int accuracy = (int) (Math.random()*100 + 1);
       if (accuracy >= 50 && hit >= 50){
           System.out.println("You've hit the enemy");
           System.out.println("Damage Dealt: " + dmgDealt());
           magSize -= 1;
           calcCrit = true;
        } else {
           System.out.println("You've missed");
           magSize -= 1;
        }   
    }
    
    public void reload(){
        if (magSize == 0){
            ammo -= 30;
            magSize = 0;
            magSize += 30;
            System.out.println("Reloading");
            System.out.println("Ammo: " + ammo);
            System.out.println("Ammo in magazine: " + magSize);
        } else if (magSize != 0){
            ammo -= magSize;
            magSize = 0;
            magSize += 30;
            System.out.println("Reloading");
            System.out.println("Ammo: " + ammo);
            System.out.println("Ammo in magazine: " + magSize);
        }
    }
    
    public boolean parry(){
        double rand = (int) (Math.random()*10 + 1);
        if (rand <= 5){
            System.out.println("The attack was parried");
            return true;
        } else {
            return false;
        }
    }
    
    public void addItem(){
        if (equip = true){
            Gun obj = new AK12();  
            Backpack pack = new Backpack();
            pack.storeItem(obj);
        }
    }
    
}
