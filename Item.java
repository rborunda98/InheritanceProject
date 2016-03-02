
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    ArrayList<Object> object = new ArrayList<Object>();
   
    
    String fluffysword = "Fluffy Sword";
    String woodensword = "Wooden Sword";
    String stringbow = "String Bow";
    String goldenbow = "Golden Bow";
    String cookie = "Cookie";
    String cake = "Cake";
    String car = "Car";
    String bike = "Bike";
    String walk = "Walk";
    String suit = "Suit";
    String jacket = "Jacket";
    String Watch = "Watch";
    String Smartphone = "Smartphone";
    String Paper_Rock_Scissor = "Paper Rock Scissor";
    String Drawing = "Drawing";
    String returns = "These are the Array names";
   
    
    public String getName(){
        System.out.println(fluffysword);
        System.out.println(woodensword);
        System.out.println(stringbow);
        System.out.println(goldenbow);
        System.out.println(cookie);
        System.out.println(cake);
        System.out.println(car);
        System.out.println(bike);
        System.out.println(walk);
        System.out.println(suit);
        System.out.println(jacket);
        System.out.println(Watch);
        System.out.println(Smartphone);
        System.out.println(Paper_Rock_Scissor);
        System.out.println(Drawing);
        return returns; 
    }
    public ArrayList getStats(){
        return object;
    }
}
