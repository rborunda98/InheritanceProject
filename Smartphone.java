
/**
 * Write a description of class Walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smartphone extends LeisureAbstract
{
    public Smartphone(String name, int happyRating){
        super(name, happyRating);
    }
    public Smartphone(){
        this("Smartphone", 9);
        System.out.println("This Smartphone will increase your happy rating by 9.");
    }
    
}
