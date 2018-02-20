
/**
 * Write a description of class tacHelmet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class level2Helm extends headArmor
{
    public level2Helm(int durability, int type, String name){
        super(durability, type, name);
    }
    public level2Helm(){
        super(100,2,"Tactical Helmet");
    }
    
    public void ruined() {
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
