
/**
 * Write a description of class Walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Suit extends ClothesAbstract
{
    public Suit(String Name, int Warmth){
        super(Name, Warmth);
    }
    public Suit(){
        this("Suit", 6);
        System.out.println("You now feel 6 warmth!");
    }
    
}
