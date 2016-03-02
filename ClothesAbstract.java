
/**
 * Abstract class TransportationAbstract - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class ClothesAbstract extends Item
{
    private String ClothesName;
    private int WarmthValue;
    public ClothesAbstract(String Name, int Warmth){
        WarmthValue = Warmth;
        ClothesName = Name;
        
    }
    
}
