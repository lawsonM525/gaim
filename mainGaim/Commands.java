package mainGaim;
import java.util.Scanner;
import mainGaim.Main;



public class Commands {
    //defining Buildings
    Building center = new Building("Spunkoids", "Woodlands of the Spirits", 1);
    Library lostLibrary = new Library("Lost Library", "Alibrary full of lost souls", 3, true);
    Building devilLake = new Building("Lake of Devils", "A lake full of devils", 1);
    House hauntedHouse = new House("Haunted House", "A tall house full of ghosts", 5, true, true);
    Cafe frogCafe = new Cafe("Frog Cafe", "A cafe full of hoppity hoppities", 1, 50, 20, 300, 60);

    public static void call(String command, Player player) {
        Main main = new Main();
        Scanner input = new Scanner(System.in);
        String[] commandArray = command.split(" ");
        switch (commandArray[0]) {
            case "take":
                if (commandArray[1] == "key") {
                    Item key = new Item("key");
                    player.pickUp(key);
                }
                else if (commandArray[1] == "potion") {
                    Item potion = new Item("potion");
                    player.pickUp(potion);
                    System.out.println("This potion does nothing hehe");
                }
                else if (commandArray[1] == "book") {
                    Item book = new Item("book");
                    player.pickUp(book);
                    System.out.println("Unfortunately, you have no time to read");
                }
                else if (commandArray[1] == "map") {
                    Item map = new Item("map");
                    player.pickUp(map);
                }
                else if (commandArray[1] == "coffee"){
                    Item coffee = new Item("coffee");
                    player.pickUp(coffee);
                }
                else if (commandArray[1] == "coin"){
                    Item coin = new Item("coin");
                    player.pickUp(coin);
                }
                break;
            case "drop":
                if (commandArray[1] == "key") {
                    Item key = new Item("key");
                    player.drop(key);
                }
                else if (commandArray[1] == "potion") {
                    Item potion = new Item("potion");
                    player.drop(potion);
                    System.out.println("That potion was useless anyway");
                }
                else if (commandArray[1] == "book") {
                    Item book = new Item("book");
                    player.drop(book);
                }
                else if (commandArray[1] == "map") {
                    Item map = new Item("map");
                    player.drop(map);
                }
                else if (commandArray[1] == "coffee"){
                    Item coffee = new Item("coffee");
                    player.drop(coffee);
                }
                else if (commandArray[1] == "coin"){
                    Item coin = new Item("coin");
                    player.drop(coin);
                }
                else{
                    System.out.println("This is not a real item. Try again.");
                }
                break;
            case "move":
                int moveTo = Integer.parseInt(commandArray[1]);
                Main.move(moveTo, player);
                break;
            case "inventory":
                player.listInventory();
                break;
            case "whereami":
                player.position.toString();
                break;
            case "help":
                System.out.println("Refer to cheatsheet.md for all commands");
                break;
            case "escape":
                main.escape(player);
            case "quit":
                System.out.println("Thanks for playing!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid command. Try again.");
                break;
        }
    }

    public static void main(String[] args) {
        
    }
    
}
