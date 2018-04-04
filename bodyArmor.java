
/**
 * Abstract class bodyArmor - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class bodyArmor extends Armor
{
    public bodyArmor (int durability, int type, int defense, boolean equip, String name){
        super(durability, type, defense, equip, name);
    }
    
    public boolean blocked(){
        int ricochet = (int) (Math.random()*100 + 1);
        if (ricochet > 50){
            return true;
        } else {
            return false;
        }
    }
    
    
    public void addItem(){
        if (equip = true){
            bodyArmor obj = new lvl1Vest();  
            Backpack pack = new Backpack();
            pack.storeItem(obj);
        }
    }
}
