
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
    int defense;
    String name;
    String gender;
    public Character(int hp, int maxHp, int defense, String name, String gender){
        this.hp = hp;
        this.maxHp = maxHp;
        this.defense = defense;
        this.name = name;
        this.gender = gender;
    }
    
    public void death(){
        if (hp == 0){
            System.out.println("You have died");
        } else {
            System.out.println("You're alive");
        }
    }
}
