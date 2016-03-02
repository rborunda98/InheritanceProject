
/**
 * Write a description of class Walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Watch extends ClothesAbstract
{
    public Watch(String Name, int Warmth){
        super(Name, Warmth);
    }
    public Watch(){
        this("Watch", 1);
        System.out.println("Congratulations. You put on a watch. One Warmth, I guess.");
    }
    
}
