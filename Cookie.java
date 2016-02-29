
/**
 * Write a description of class Walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cookie extends Edibles implements EdibleInterface
{
    public Cookie(String name, int happyRating){
        super(name, happyRating);
    }
    public Cookie(){
        this("Cookie", 5);
        System.out.println("This Cookie will increase your happy rating by 5.");
    }
    
}
