
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enemy extends Character

{
    public Enemy (int hp, int maxHp, int defense, String name, String gender){
        super(hp, maxHp, defense, name, gender);
    }
    public Enemy (){
        super(100,100,0,"Enemy", "Male");
    }
    
    
}
