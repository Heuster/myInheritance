
/**
 * Write a description of class lvl3Vest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lvl3Vest extends bodyArmor
{
    public lvl3Vest(int durability, int type, int defense, boolean equip, String name){
        super(durability, type, defense, equip, name);
    }
    public lvl3Vest(){
        super(100,1,75,false,"Heavy Armor Vest");
    }
    
    public void reducedDurability(){ //WORK IN PROGRESS METHOD        
        if (blocked() == true){
            durability -= 5;
        }
    }
    
    public void ruined() {
        if (durability == 0){
            System.out.println("Your " + name + " is ruined, it won't take anymore damage");
        }
        defense = 0;
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
