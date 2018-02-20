
/**
 * Write a description of class level3Helm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class level3Helm extends headArmor
{
    public level3Helm (int durability, int type, String name){
        super(durability, type, name);
    }
    public level3Helm(){
        super(100,1,"Combat Helmet");
    }
    
    
    public void ruined (){
        if (durability == 0){
            System.out.println("Your helmet is ruined, it won't take anymore damage");
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
