
/**
 * Write a description of class level1Helm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lvl1Helm extends headArmor
{
    public lvl1Helm (int durability, int type,boolean equip, String name){
        super(durability, type,equip, name);
    }
    public lvl1Helm(){
        super(100,1,false,"Military Helmet");
    }
    
    public int reducedDmg(){ //WORK IN PROGRESS METHOD
        return durability;
    }
    
    public void ruined (){
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
