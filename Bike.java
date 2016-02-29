
/**
 * Write a description of class Walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bike extends TransportationAbstract implements Transportation
{
    
    public Bike(String Name, int Speed){
        super(Name, Speed);
    }
    public Bike(){
        this("Bike", 5);
        System.out.println("You are riding to your destination at 5 mph.");
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
