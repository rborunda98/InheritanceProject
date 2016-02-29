
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    ArrayList<Object> object = new ArrayList<Object>();
    
    FluffySword fluffy_sword = new FluffySword("Fluffy Sword", "Fluff", 10);
    WoodenSword wooden_sword = new WoodenSword("Wooden Sword", "wood", 2);
    StringBow string_bow = new StringBow("String Bow", "String", 1);
    GoldenBow golden_bow = new GoldenBow("Golden Bow", "Gold", 8);
    Cookie cookie_s = new Cookie("Cookie", 5);
    Cake cake_s = new Cake("Cake", 10);
    Car car_s = new Car("Car", 10);
    Bike bike_s = new Bike("Bike", 5);
    Walk walk_s = new Walk("Legs", 2);
    
    public void ListName(){
        object.add(fluffy_sword);
        object.add(wooden_sword);
        object.add(string_bow);
        object.add(golden_bow);
        object.add(cookie_s);
        object.add(cake_s);
        object.add(car_s);
        object.add(bike_s);
        object.add(walk_s);
    }
    public String getName(){
        return this.Name;
        
    }
    public ArrayList getStats(){
        object.get(1);
    }
}
