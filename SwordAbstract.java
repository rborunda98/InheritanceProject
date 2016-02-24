import java.util.*;
/**
 * Abstract class SwordAbstract - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class SwordAbstract 
{
    private int Happiness;
    private String materialType;
    private String swordName;
    
    
    public SwordAbstract(String name, String material, int happyRating){
        swordName = name;
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
