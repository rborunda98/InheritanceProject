
/**
 * Write a description of class Walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drawing extends LeisureAbstract
{
    public Drawing(String name, int happyRating){
        super(name, happyRating);
    }
    public Drawing(){
        this("Drawing", 5);
        System.out.println("This Drawing will increase your happy rating by 5.");
    }
    
}
