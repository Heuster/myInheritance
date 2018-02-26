
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player extends Character
{
    //to equip items, have a (boolean equip) in WEAPONS
    //every weapon that is true is equipped
    //every weapon that is not true is no equipped
    
    public Player (int hp, int maxHp, String name){
        super(hp, maxHp, name);
    }
    
    
    public void death(){
        if (hp == 0){
            System.out.println("You have died");
        }
    }
}
