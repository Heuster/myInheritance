
/**
 * Write a description of class Sword here.
 *
 * @author Danny Heu
 * @version Alpha.01
 */
import java.lang.Math;
public class CombatKnife extends Melee 
{
    public CombatKnife (int dmg, int crit, String name, boolean equip){
        super(dmg,crit,name,equip);
    }
    public CombatKnife(){
        super(10,5,"Combat Knife",true);
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
