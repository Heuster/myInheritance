
/**
 * Write a description of class Armor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Armor extends Item implements DefenseCommands
{
    int durability;
    int type;
    String name;
    
    public Armor(int durability, int type, String name)
    {
        this.durability = durability;
        this.type = type;
        this.name = name;
    }

    
}
