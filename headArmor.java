
/**
 * Write a description of class headArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class headArmor extends Armor
{
    public headArmor(int durability, int type, int defense, boolean equip, String name){
        super(durability, defense, type, equip, name);
    }
    public headArmor(){
        super(100,1,0,false,"Helmet");
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
            headArmor obj = new lvl1Helm();  
            Backpack pack = new Backpack();
            pack.storeItem(obj);
        }
    }
}
