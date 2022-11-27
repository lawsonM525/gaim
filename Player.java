// Player is a person who plays the game.
public class Player{
    public String name;
    public int[] position;
    private String[] inventory;
    //TODO: Make inventory a HashTable

    // Constructor
    public Player(String name){
        this.name = name;
        this.position = new int [0,0];
        this.inventory = new String[30];
        System.out.println("Player created");
    }

    /**
     * Getter for inventory
     */
    public String[] getInventory(){
        return this.inventory;
    }

    /**
     * Picks up item for inventory
     * @param item item to add to inventory
     */
    public void pickUp(String item){
        // TODO: Add otem to inventory if capacity not reached
    }

    /**
     * Drops item from inventory
     * @param item item to drop from inventory
     */
    public void drop(String item){
        //TODO: Remove item from inventory if in inventory
    }
    
}