
/**
 * Write a description of class WoodenSword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */public class StringBow extends BowAbstract implements WeaponInterface
{
    public StringBow(String name, String material, int happyRating){
        super(name, material, happyRating);
    }
    public StringBow(){
        this("String Bow", "String", 1);
        System.out.println("You will attack at 1 Happiness");
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
