public class World {
    public String name;
    public int[] size;
    public Task[] tasks;
    public Building[] buildings;
    //TODO: Make Building[] an ArrayList

    //Constructor
    public World(String name, int[] size){
        this.name = name;
        this.size = size;
        this.tasks = new Task[5];
        this.buildings = new Building[10];
        System.out.println("The" + name+ " world has been created");
    }

    /**
     * Create world Buildings
     * @param building the building to be added to the world
     */
    public World addBuilding(Building building){
        for (int i = 0; i < buildings.length; i++) {
            if (buildings[i] == null) {
                buildings[i] = building;
                break;
            }
        }
        return this;
    }
    
}
