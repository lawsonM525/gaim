import java.util.regex.MatchResult;

/* Cafe Building for selling and buying cofeee */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /** 
     *  Shows options available for cafe class
     */
    public void showOptions() {
        super.showOptions();
        System.out.println("\n + sellsCoffee() \n + restock()");
    }

    /** 
     * Sells one cup of coffee and reduces coffee ounces accordingly
     * @param size size of coffee in relation to ounces
     */
    public void sellCoffee(int size){
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -=1;

    }

    /** 
     * Sells one cup of coffee and reduces coffee ounces and sugar packets accordingly
     * @param size size of coffee in relation to ounces
     * @param nSugarPackets number of sugar packets used
     */
    public void sellCoffee(int size, int nSugarPackets){
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -=1;

    }    
    
    /** 
     * Sells one cup of coffee and reduces coffee ounces, sugar packets, and creams accordingly
     * @param size size of coffee in relation to ounces
     * @param nSugarPackets number of sugar packets used
     * @param nCreams number of creams used
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -=1;

    }
    
    /** 
     * Restocks shop by adding specified amount of ingredients
     * @param nCoffeeOunces number of ounces of coffee to add
     * @param nSugarPackets number of sugar packets to add
     * @param nCreams number of creams to add
     * @param nCups number of cups to add
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }

    /**
     * Moves user to floor 1 and does nt allow them to move to an other floor
     * @param floorNum number of the floor user wants to go to
     */
    public void goToFloor(int floorNum){
        if (floorNum != 1){
          System.err.println("You can not moe to the other floors!");
        }
        else{
            super.goToFloor(floorNum);
        }
      }
    
    /** 
     * Main Method
     * @param args
     */
    public static void main(String[] args) {
        new Cafe("Compass", "Nielson Drive",1,200,300,100,2);
    }
    
}