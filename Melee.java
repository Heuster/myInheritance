
/**
 * Write a description of class Melee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Melee extends Weapons implements WeaponInterface
{
    int dmg;
    int crit;
    boolean equip;
    String name;
    
    public Melee (int dmg, int crit, String name, boolean equip){
        super(dmg,crit, name);
        this.name = name;
        this.equip = equip;
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
