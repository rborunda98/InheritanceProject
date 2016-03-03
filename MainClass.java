
public class MainClass
{
    Backpack backpack = new Backpack();
    FluffySword fluffy_sword = new FluffySword("Fluffy Sword", "Fluff", 10);    
    WoodenSword wooden_sword = new WoodenSword("Wooden Sword", "wood", 2);
    StringBow string_bow = new StringBow("String Bow", "String", 1);
    GoldenBow golden_bow = new GoldenBow("Golden Bow", "Gold", 8);
    Cookie cookie_s = new Cookie("Cookie", 5);
    Cake cake_s = new Cake("Cake", 10);
    Suit suit_s = new Suit("Suit", 6);
    Jacket jacket_s = new Jacket("Jacket", 9);
    Watch watch_s = new Watch ("Watch", 1);
    Smartphone smartphone_s = new Smartphone("Smartphone", 9);
    PaperRockScissor paper_s = new PaperRockScissor("Paper Rock Scissor Game", 2);
    Drawing drawing_s = new Drawing("Drawing", 5);
    public static void main(){
        System.out.println("Welcome to the Game! Create New Classes To Love, Eat, And Travel!");
    }

    public void addItems(){

        backpack.storeItem(fluffy_sword);

        backpack.storeItem(wooden_sword);

        backpack.storeItem(string_bow);

        backpack.storeItem(golden_bow);

        backpack.storeItem(cookie_s);

        backpack.storeItem(cake_s);

        backpack.storeItem(suit_s);

        backpack.storeItem(jacket_s);

        backpack.storeItem(watch_s);

        backpack.storeItem(smartphone_s);

        backpack.storeItem(paper_s);

        backpack.storeItem(drawing_s);
    }

    public void removeFluffySword(){
        backpack.useItem(fluffy_sword);
    }

    public void removeWoodenSword(){
        backpack.useItem(wooden_sword);
    }

    public void removeStringBow(){
        backpack.useItem(string_bow);
    }

    public void removeGoldenBow(){
        backpack.useItem(golden_bow);
    }

    public void removeCookie(){
        backpack.useItem(cookie_s);
    }

    public void removeCake(){
        backpack.useItem(cake_s);
    }

    public void removeSuits(){
        backpack.useItem(suit_s);
    }

    public void removeJacket(){
        backpack.useItem(jacket_s);
    }

    public void removeWatch(){
        backpack.useItem(watch_s);
    }

    public void removeSmartphone(){
        backpack.useItem(smartphone_s);
    }

    public void removePaper(){
        backpack.useItem(paper_s);
    }

    public void removeDrawing(){
        backpack.useItem(drawing_s);
    }


}

