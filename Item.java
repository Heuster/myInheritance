

/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    //Implemented in your own way
    String name;
    ArrayList stats;
    
    public String getName(){
        return name;
    }
    
    public ArrayList getStats(){
        return stats;
    }
    
    
}
