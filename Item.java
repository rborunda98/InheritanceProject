
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
        FluffySword fluffy_sword = new FluffySword("Fluffy Sword", "Fluff", 10);    
        object.add(fluffy_sword);

        WoodenSword wooden_sword = new WoodenSword("Wooden Sword", "wood", 2);
        object.add(wooden_sword);

        StringBow string_bow = new StringBow("String Bow", "String", 1);
        object.add(string_bow);

        GoldenBow golden_bow = new GoldenBow("Golden Bow", "Gold", 8);
        object.add(golden_bow);

        Cookie cookie_s = new Cookie("Cookie", 5);
        object.add(cookie_s);

        Cake cake_s = new Cake("Cake", 10);
        object.add(cake_s);

        Suit suit_s = new Suit("Suit", 6);
        object.add(suit_s);

        Jacket jacket_s = new Jacket("Jacket", 9);
        object.add(jacket_s);

        Watch watch_s = new Watch ("Watch", 1);
        object.add(watch_s);

        Smartphone smartphone_s = new Smartphone("Smartphone", 9);
        object.add(smartphone_s);

        PaperRockScissor paper_s = new PaperRockScissor("Paper Rock Scissor Game", 2);
        object.add(paper_s);

        Drawing drawing_s = new Drawing("Drawing", 5);
        object.add(drawing_s);
        return object;
    }
}
