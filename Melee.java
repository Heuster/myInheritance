
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
    String name;
    
    public Melee (int dmg, int crit, String name){
        super(dmg,crit);
        this.name = name;
    }   
    
}
