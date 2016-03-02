
/**
 * Write a description of class Walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jacket extends ClothesAbstract
{
    public Jacket(String Name, int Warmth){
        super(Name, Warmth);
    }
    public Jacket(){
        this("Jacket", 9);
        System.out.println("You now feel 9 warmth!");
    }
    
}
