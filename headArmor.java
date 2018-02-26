
/**
 * Write a description of class headArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class headArmor extends Armor
{
    public headArmor(int durability, int type, boolean equip, String name){
        super(durability, type, equip, name);
    }
    public headArmor(){
        super(100, 1, false,"Helmet");
    }
    
    public boolean blocked(){
        int ricochet = (int) (Math.random()*100 + 1);
        if (ricochet > 50){
            return true;
        } else {
            return false;
        }
    }
}
