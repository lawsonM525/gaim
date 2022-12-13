package mainGaim;
import java.util.Hashtable;
import java.util.Scanner;
import mainGaim.Main;
/* Player is a person who plays the game. */
public class Player{
    public String name;
    public Building position;
    private Hashtable<Item, Integer> inventory;
    private int inventorySize;
    Main main = new Main();
    //TODO: Make undo function and allat

    // Constructor
    public Player(String name, Building position){
        this.name = name;
        this.position = position;
        this.inventory = new Hashtable<Item, Integer>();
        this.inventorySize = 0;
        System.out.println("Player created");
    }

    /**
     * Getter for inventory
     */
    public Hashtable<Item,Integer> getInventory(){
        return this.inventory;
    }

    /**
     * Picks up item for inventory
     * @param item item to add to inventory
     */
    public void pickUp(Item item){
        if (this.inventorySize < 30) {
            if (this.inventory.containsKey(item)){
                this.inventory.put(item, this.inventory.get(item)+1);
                this.inventorySize ++;
                System.out.println(item.name + " has been added to your inventory");
            } else {
                this.inventory.put(item, 1);
                this.inventorySize ++;
                System.out.println(item.name + " has been added to your inventory");
            }
        } else {
            System.out.println("Your inventory is full! Drop some items :)");
        }
    }

    /**
     * Drops item from inventory
     * @param item item to drop from inventory
     */
    public void drop(Item item){
        if (this.inventory.containsKey(item)){
            if (this.inventory.get(item) > 1){
                this.inventory.put(item, this.inventory.get(item)-1);
                this.inventorySize --;
            } else {
                this.inventory.remove(item);
                this.inventorySize --;
            }
        } else {
            System.out.println("You don't have that item in your inventory!");
        }
    }

    public void useItem(Item item){
        if (this.inventory.containsKey(item)){
            if (this.inventory.get(item) > 1){
                this.inventory.put(item, this.inventory.get(item)-1);
                this.inventorySize --;
            } else {
                this.inventory.remove(item);
                this.inventorySize --;
            }
        } else {
            System.out.println("You don't have that item in your inventory!");
        }
    }

    /**
     * Prints out inventory
     */
    public void listInventory(){
        System.out.println("Your inventory contains the following:");
        for (Item item : this.inventory.keySet()){
            System.out.println(item.name + " x" + this.inventory.get(item));
        }
    }

    ///**
    // * Starts a task if user meets requirements
    // * @param task task to be begun
    // */
    //public void startTask(){}

    // /**
    //  * Moves player from one building to another
    //  * @param destination to move to
    //  */
    // public void move(int destination){
    //     if (destination == 1){
    //         this.position = main.center;
    //         System.out.println(this.position.toString());
    //     }
    //     else if (destination == 2){
    //         this.position = main.lostLibrary;
    //         System.out.println(this.position.toString());
    //     }
    //     else if (destination == 3){
    //         this.position = main.hauntedHouse;
    //         System.out.println(this.position.toString());
    //     }
    //     else if (destination == 4){
    //         this.position = main.frogCafe;
    //         System.out.println(this.position.toString());
    //     }
    //     else if (destination == 5){
    //         this.position = main.devilLake;
    //         System.out.println(this.position.toString());
    //     }
    //     else{
    //         System.out.println("Invalid input");
    //     }

    // }

    public void move(Building building){
        this.position = building;
    }
    

    
}