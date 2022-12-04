import java.util.ArrayList;
/* House class defines houses within the world */
public class House extends Building {

    private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
    private Boolean hasDiningRoom;
    private Boolean hasElevator;

    /* Overloaded constructor with definition only */
    public House(String definition) {
      super(definition);
    }

    /** 
     *  Constructor for House Building
     *  @param name Name of the House
     *  @param definition Location of the House
     *  @param nFloors Number of Floors in the house
     *  @param hDR Whether or not the house has a dining room
     *  @param hE Whether or not the house has an elevator
     */
    public House(String name, String definition, int nFloors, Boolean hDR, Boolean hE) {
      super(name, definition, nFloors);
      this.residents = new ArrayList<String>();
      this.hasDiningRoom = hDR;
      this.hasElevator = hE;
      System.out.println("You have built a house: 🏠");
    }
    
    /** 
     *  Shows options available for house class
     */
    public void showOptions() {
      super.showOptions();
      System.out.println("\n + moveIn(n) \n + moveOut(n) \n +isResident(n) \n + hasDiningRoom()");
    }

    /** 
     *  Checks whether the house has a  dining room
     *  @return T/F: Does this house have a dining room?
     */
    public Boolean hasDiningRoom(){
      return this.hasDiningRoom;
    }

    /** 
     *  Counts number of residents in the house
     *  @return The number of residents is the residents array
     */
    public int nResidents(){
      return this.residents.size();
    }

    /** 
     *  Adds a student to the array of residents
     *  @param name Name of the Student
     */
    public void moveIn(String name){
      this.residents.add(name);
    }

    /**
     * Adds multiple students to a house's array of residents
     * @param names array with names of students to be added
     */
    public void moveIn(String [] names){
      for(int i = 0; i < names.length; i++){
        this.residents.add(names[i]);
      }
    }

    /** 
     *  Removes a student from the array of residents
     *  @param name Name of the students
     *  @return Message that says a student has moved out
     */
    public String moveOut(String name){
      this.residents.remove(name);
      return name+" has moved out. Bye!";
    }

    /** 
     *  Checks whether a student is a resident of the house
     *  @param person Name of the person
     *  @return T/F: Is the person a resident of the house?
     */
    public boolean isResident (String person){
      return this.residents.contains(person);
    }

    /**
     * Moves user to a new selected floor or lets them climb up or down if there is no elevator
     * @param floorNum number of the floor user wants to go to
     */
    public void goToFloor(int floorNum){
      if (this.hasElevator){
        super.goToFloor(floorNum);
      }
      else{
        if (floorNum < 1 || floorNum > this.nFloors) {
          throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
      }
        if (this.activeFloor == -1) {
          throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
      }
        while(this.activeFloor != floorNum){
          if (this.activeFloor<floorNum){
            this.activeFloor += 1;
          }
          if (this.activeFloor>floorNum){
            this.activeFloor -= 1;
          }
        }
        System.out.println("You have successfully climbed to floor " + floorNum);
      }
    }

    /** 
     *  Main Method
     */
    public static void main(String[] args) {
      House wilson = new House("Wilson House", "27 Elm Street", 4, false, true);
      wilson.enter();
      wilson.goToFloor(3);
    }

}