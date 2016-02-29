import java.util.*;
/**
 * Abstract class SwordAbstract - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Edibles 
{
    private int Happiness;
    private String edibleName;
    
    
    public Edibles(String name, int happyRating){
        edibleName = name;
        Happiness = happyRating; 
    }
    public  int eat(int happyRating){
         System.out.println("You have ate and recieved " + happyRating + " Happiness!");
        return happyRating;

    }
}
