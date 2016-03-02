
/**
 * Abstract class TransportationAbstract - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class TransportationAbstract extends Item
{
    private String TransportName;
    private int TransportSpeed;
    public TransportationAbstract(String Name, int Speed){
        TransportSpeed = Speed;
        TransportName = Name;
        
    }
    
    public void moveForward(){
        System.out.println("You move forward.");

    }

    public void moveBackward(){
        System.out.println("You move backward.");
    }

    public void turnLeft(){
        System.out.println("You turn left.");
    }

    public void turnRight(){
        System.out.println("You turn right.");
    }
    
}
