
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
    
    public Player (int hp, int maxHp,int defense, String name, String gender){
        super(hp, maxHp,defense, name, gender);
    }
    public Player(){
        super(100,100,0,"Player","Male");
    }
}
