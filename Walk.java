
/**
 * Write a description of class Walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Walk extends TransportationAbstract implements Transportation
{
    public Walk(String Name, int Speed){
        super(Name, Speed);
    }
    public Walk(){
        this("Legs", 2);
        System.out.println("You will now move at 2 mph.");
    }
    public void moveForward(){
        System.out.println("You have moved forward.");
    }
    public void moveBackward(){
        System.out.println("You have moved backwards.");
    }
    public void moveLeft(){
        System.out.println("You have moved left.");
    }
    public void moveRight(){
        System.out.println("You have moved right.");
    }
}
