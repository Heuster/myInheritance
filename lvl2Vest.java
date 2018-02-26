
/**
 * Write a description of class lvl2Vest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lvl2Vest extends bodyArmor
{
    public lvl2Vest(int durability,int type,boolean equip,String name){
        super(durability, type, equip, name);
    }
    public lvl2Vest(){
        super(100,1,false,"Medium Armor Vest");
    }
    
    public int reducedDmg(){
        return durability;
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
