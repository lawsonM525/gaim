package mainGaim;

/* Item is an object that can be picked up and used by the player */
public class Item {
    public String name;
    public String description;

    // Constructor
    public Item(String name){
        this.name = name;
    }
    // Second Constructor
    public Item(String name, String description){
        this.name = name;
        this.description = description;
    }

    public static void main(){
        Item Coffee = new Item("Coffee", "A cup of coffee. It's hot!");
        Item Coin = new Item("Coin", "A shiny coin. It can make a key!");
        Item Key = new Item("Key", "A key. It can unlock a door!");
    }
}
