
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enemy extends Character

{
    public Enemy (int hp, int maxHp, String name){
        super(hp, maxHp, name);
    }
    public Enemy (){
        super(100,100,"Enemy");
    }
}
