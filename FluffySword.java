
/**
 * Write a description of class WoodenSword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */public class FluffySword extends SwordAbstract implements WeaponInterface
{
    public FluffySword(String name, String material, int happyRating){
        super(name, material, happyRating);
    }
    public FluffySword(){
        this("Fluffy Sword", "Fluff", 10);
        System.out.println("You will now attack at 10 happiness");
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
