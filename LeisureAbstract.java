
/**
 * Abstract class TransportationAbstract - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class LeisureAbstract extends Item
{
    private String LeisureName;
    private int Happiness;
    public LeisureAbstract(String Name, int happyRating){
        Happiness = happyRating;
        LeisureName = Name;
        
    }
    
}
