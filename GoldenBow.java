
/**
 * Write a description of class WoodenSword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */public class GoldenBow extends BowAbstract implements WeaponInterface
{
    public GoldenBow(String name, String material, int happyRating){
        super(name, material, happyRating);
    }
    public GoldenBow(){
        this("Golden Bow", "Gold", 8);
        System.out.println("You will attack at 8 Happiness");
    }
    public int attack(int happyRating){
        
        System.out.println("You have attacked and dealt " + happyRating + " Happiness!");
        return happyRating;
    }
    public boolean parry(){
        
        boolean parry = true;
        return parry;
    }
}
