
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
    boolean equip;
    String name;
    
    public Armor(int durability, int type, boolean equip, String name)
    {
        this.durability = durability;
        this.type = type;
        this.equip = equip;
        this.name = name;
    }

    
}
