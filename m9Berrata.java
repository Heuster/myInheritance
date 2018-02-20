
/**
 * Write a description of class Pistol here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class m9Berrata extends Gun
{
    
    public m9Berrata (int dmg, int crit, int ammo, int rnge, double ammoType, int magSize, String name, int accuracy){
        super(dmg, crit, rnge, ammo, magSize, ammoType, name, accuracy);
    }
    public m9Berrata(){
        super(10, 50, 30, 15, 30, 9.00, "M9 Berrata", 50);
    }
    
    public int attack(){
        dmg += 10;
        return dmg;
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
}
