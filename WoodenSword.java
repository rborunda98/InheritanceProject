
/**
 * Write a description of class WoodenSword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */public class WoodenSword extends SwordAbstract implements WeaponInterface
{
    public WoodenSword(String name, String material, int happyRating){
        super(name, material, happyRating);
    }
    public WoodenSword(){
        this("Wooden Sword", "Wood", 2);
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
