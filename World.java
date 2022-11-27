public class World {
    public String name;
    public int[] size;
    public Task[] tasks;
    public Building[] buildings;

    //Constructor
    public World(String name, int[] size){
        this.name = name;
        this.size = size;
        this.tasks = new Task[5];
        this.buildings = new Building[10];
        System.out.println("The" + name+ " world has been created");
    }
    
}
