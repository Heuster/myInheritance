
/**
 * Abstract class Weapons - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Weapons extends Item
{
    int dmg;
    int crit;
    
    public Weapons (int dmg, int crit){
        this.dmg = dmg;
        this.crit = crit;
    }
}
