
/**
 * Write a description of class M4A1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class M4A1 extends Gun 
{
    
    public M4A1 (int dmg, int rnge, int ammo,int crit, int magSize, int ammoType, String name, int accuracy){
      super(dmg, crit, rnge, ammo, ammoType, magSize, name, accuracy);
    }
    public M4A1(){
     super();   
    }
    
    public int attack(){
        dmg += 30;
        return dmg;
    }
    
    public void aim(){
        int accuracy = (int) (Math.random()*100 + 1);
        if(accuracy >= 70){
            System.out.println("..");
        }
    }
    
    public boolean parry(){
        double rand = (int) (Math.random()*10 + 1);
        if (rand <= 5){
            return true;
        } else {
            return false;
        }
    }
}
