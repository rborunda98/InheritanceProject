import java.util.*;
/**
 * Abstract class SwordAbstract - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class BowAbstract extends Item
{
    private int Happiness;
    private String materialType;
    private String bowName;
    
    
    public BowAbstract(String name, String material, int happyRating){
        bowName = name;
        materialType = material;
        Happiness = happyRating; 
    }
    public  int attack(int happyRating){
         System.out.println("You have attacked and dealt " + happyRating + " Happiness!");
        return happyRating;

    }
    public boolean parry(boolean parry){
        parry = true;
        return parry;
    }
}
