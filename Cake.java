
/**
 * Write a description of class Walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cake extends Edibles implements EdibleInterface
{
    public Cake(String name, int happyRating){
        super(name, happyRating);
    }
    public Cake(){
        this("Cake", 10);
        System.out.println("This Cake will increase your happy rating by 10.");
    }
    
}
