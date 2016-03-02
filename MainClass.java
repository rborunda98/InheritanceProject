
public class MainClass
{
    public static void main(){
        System.out.println("Welcome to the Game!");
        
        Backpack backpack = new Backpack();
        
        FluffySword fluffy_sword = new FluffySword("Fluffy Sword", "Fluff", 10);    
        backpack.storeItem(fluffy_sword);
        
        WoodenSword wooden_sword = new WoodenSword("Wooden Sword", "wood", 2);
        backpack.storeItem(wooden_sword);
        
        StringBow string_bow = new StringBow("String Bow", "String", 1);
        backpack.storeItem(string_bow);
        
        GoldenBow golden_bow = new GoldenBow("Golden Bow", "Gold", 8);
        backpack.storeItem(golden_bow);
        
        Cookie cookie_s = new Cookie("Cookie", 5);
        backpack.storeItem(cookie_s);
        
        Cake cake_s = new Cake("Cake", 10);
        backpack.storeItem(cake_s);
        
        Suit suit_s = new Suit("Suit", 6);
        backpack.storeItem(suit_s);
        
        Jacket jacket_s = new Jacket("Jacket", 9);
        backpack.storeItem(jacket_s);
        
        Watch watch_s = new Watch ("Watch", 1);
        backpack.storeItem(watch_s);
        
        Smartphone smartphone_s = new Smartphone("Smartphone", 9);
        backpack.storeItem(smartphone_s);
        
        PaperRockScissor paper_s = new PaperRockScissor("Paper Rock Scissor Game", 2);
        backpack.storeItem(paper_s);
        
        Drawing drawing_s = new Drawing("Drawing", 5);
        backpack.storeItem(drawing_s);
    }
}
