
/**
 * Write a description of class Lvl1Vest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lvl1Vest extends bodyArmor
{
    public lvl1Vest(int durability,int type,boolean equip,String name){
        super(durability, type, equip, name);
    }
    public lvl1Vest(){
        super(100,1,false,"Light Armor Vest");
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
    }
 
    public boolean blocked(){
        int ricochet = (int) (Math.random()*100 + 1);
        if (ricochet < 50){
            return true;
        } else {
            return false;
        }
    }
}
