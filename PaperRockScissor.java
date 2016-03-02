
/**
 * Write a description of class Walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaperRockScissor extends LeisureAbstract
{
    public PaperRockScissor(String name, int happyRating){
        super(name, happyRating);
    }
    public PaperRockScissor(){
        this("PaperRockScissor", 2);
        System.out.println("This game will increase your happy rating by 2.");
    }
    
}
