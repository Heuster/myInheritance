
/**
 * Write a description of class Melee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Melee extends Weapons
{
    int dmg;
    int crit;
    
    public Melee (int dmg, int crit){
        this.dmg = dmg;
        this.crit = crit;
    }   
    
    
}
