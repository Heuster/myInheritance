
/**
 * Write a description of class tacHelmet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lvl2Helm extends headArmor
{
    public lvl2Helm(int durability, int type, int defense, boolean equip, String name){
        super(durability, type, defense, equip, name);
    }
    public lvl2Helm(){
        super(100,2,50,false,"Combat Helmet");
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
