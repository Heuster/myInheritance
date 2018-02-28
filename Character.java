
/**
 * Abstract class Character - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Character
{
    int hp;
    int maxHp;
    String name;

    public Character(int hp, int maxHp, String name){
        this.hp = hp;
        this.maxHp = maxHp;
        this.name = name;
    }
    
    public void death(){
        if (hp == 0){
            System.out.println("You have died");
        }
    }
}
