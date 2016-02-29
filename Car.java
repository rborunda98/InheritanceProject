
/**
 * Write a description of class Walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends TransportationAbstract implements Transportation
{
    
    public Car(String Name, int Speed){
        super(Name, Speed);
        int CarSpeed = Speed;
    }
    public Car(){
        this("Car", 10);
        System.out.println("You are driving to your destination at 10 mph.");
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
