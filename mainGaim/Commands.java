package mainGaim;
import java.util.Scanner;




public class Commands {
    //defining Buildings
    Building center = new Building("Spunkoids", "Woodlands of the Spirits", 1);
    Library lostLibrary = new Library("Lost Library", "Alibrary full of lost souls", 3, true);
    Building devilLake = new Building("Lake of Devils", "A lake full of devils", 1);
    House hauntedHouse = new House("Haunted House", "A tall house full of ghosts", 5, true, true);
    Cafe frogCafe = new Cafe("Frog Cafe", "A cafe full of hoppity hoppities", 1, 50, 20, 300, 60);

    public static void call(String command, Player player) {
        Scanner input = new Scanner(System.in);
        String[] commandArray = command.split(" ");
        switch (commandArray[0]) {
            case "take":
                if (commandArray[1] == "stick"){
                    player.pickUp(new Item("stick"));
                }
                else if (commandArray[1] == "rock"){
                    player.pickUp(new Item("rock"));
                }
                else if (commandArray[1] == "key") {
                    player.pickUp(new Item("key"));
                }
                else if (commandArray[1] == "potion") {
                    player.pickUp(new Item("potion"));
                }
                else if (commandArray[1] == "book") {
                    player.pickUp(new Item("book"));
                }
                else if (commandArray[1] == "map") {
                    player.pickUp(new Item("map"));
                }
                else if (commandArray[1] == "coffee"){
                    player.pickUp(new Item("coffee"));
                }
                else if (commandArray[1] == "coin"){
                    player.pickUp(new Item("coin"));
                }
                break;
            case "drop":
                if (commandArray[1] == "stick"){
                    player.drop(new Item("stick"));
                }
                else if (commandArray[1] == "rock"){
                    player.drop(new Item("rock"));
                }
                else if (commandArray[1] == "key") {
                    player.drop(new Item("key"));
                }
                else if (commandArray[1] == "potion") {
                    player.drop(new Item("potion"));
                }
                else if (commandArray[1] == "book") {
                    player.drop(new Item("book"));
                }
                else if (commandArray[1] == "map") {
                    player.drop(new Item("map"));
                }
                else if (commandArray[1] == "coffee"){
                    player.drop(new Item("coffee"));
                }
                else if (commandArray[1] == "coin"){
                    player.drop(new Item("coin"));
                }
                else{
                    System.out.println("This is not a real item. Try again.");
                }
                break;
            case "move":
                player.move();
                break;
            case "inventory":
                player.listInventory();
                break;
            default:
                System.out.println("Invalid command. Try again.");
                break;
        }
    }

    public static void main(String[] args) {
        
    }
    
}
