
import java.util.Hashtable;
/* Library class: Building to store and take books from */
public class Library extends Building {
    private java.util.Hashtable<String, Boolean> collection;
    private Boolean hasElevator;

    /* Overloaded constructor with address only */
    public Library(String address) {
      super(address);
    }
    /** 
     *  Constructor for Library class
     *  @param name Name of the Library
     *  @param address Location of the library
     *  @param nFloors Number of floors in the library
     */
    public Library(String name, String address, int nFloors, Boolean hE) {
      super(name, address, nFloors);//parent constructor
      this.collection = new Hashtable<String, Boolean>();
      this.hasElevator = hE;
      System.out.println("You have built a library: 📖");
    }

    /** 
     *  Shows options available for cafe class
     */
    public void showOptions() {
      super.showOptions();
      System.out.println("\n + addTitle() \n + removeTitle() \n + checkOut() \n + checkIn() \n + containsTitle() \n + isAvailable()");
    }

    /** 
     *  Add book to collection with isbn number
     * @param isbn ISBN number to be add to collection
     */
    public void addTitle(int isbn){
      this.collection.put(String.valueOf(isbn), true);
    }

    /** 
     *  Adds a book to our library collection and automatically makes it available
     *  @param title Title of the book
     */
    public void addTitle(String title){
      this.collection.put(title, true);
    }

    /** 
     *  Removes a book from our library collection altogether
     *  @param title Title of the book to be removed
     *  @return The title that was removed
     */
    public String removeTitle(String title){
      this.collection.remove(title);
      return(title);
    } 

    /** 
     *  Removes a book from our library collection altogether
     *  @param title Title of the book to be checked out
     */
    public void checkOut(String title){
      if (collection.contains(title)) {
        collection.replace(title, true, false);
      }
      else{
        System.err.println("This title is not is our collection.");
      }
    }
    
    /** 
     *  Removes a book from our library collection altogether
     *  @param title Title of the book to be checked in (returned)
     */
    public void checkIn(String title){
      if (collection.contains(title)) {
        collection.replace(title, false, true);
      }
      else{
        System.err.println("This title is not is our collection.");
      }
    }

    /** 
     *  Checks whether a book is in our library collection
     *  @param title Title of the book
     *  @return T/F: Is the book in our collection?
     */
    public boolean containsTitle(String title){
    if (collection.contains(title)) {
      return true;
    }
    else{
      return false;
    }
  }

  /** 
   *  Checks whether a book is available
   *  @param title Title of the book
   *  @return T/F: Is the book available?
   */
  public boolean isAvailable(String title){ 
    if (collection.contains(title)) {
      return collection.get(title);
    }
    else{
      System.err.println("This bookis not in out collection");
      return false;
    }
  }

  /** 
   *  Prints out our entire library collection
   */
  public void printCollection(){
    System.out.println(this.collection);
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

    public static void main(String[] args) {
      Library x = new Library("Nielson","Chapin Drive",4, true);
      x.addTitle("Bambi - Jidenna");
      x.addTitle("Snow White -Disney");
      x.printCollection();
      x.showOptions();
    }
  
  }