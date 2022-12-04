package mainGaim;
import java.util.ArrayList;
/** World classdefines world map and buildings in the world */
public class World {
    public String name;//name of the world
    public ArrayList<Building> buildings;//list of buildings in the world
    public Graph<Building> map;//map of the world


    //Constructor
    public World(String name, int[] size){
        this.name = name;
        this.buildings = new ArrayList<Building>();
        System.out.println("The" + name+ " world has been created");
    }

    /**
     * Create world Buildings
     * @param building the building to be added to the world
     * @return new world with added building
     */
    public World addBuilding(Building building){
        this.buildings.add(building);
        this.map.addVertex(building);
        return this;
    }

    /**
     * Connect buildings in the world
     * @param building1 the first building to be connected
     * @param building2 the second building to be connected
     * @return new worldmap with added connection
     */
    public Graph<Building> connectBuildings(Building building1, Building building2){
        this.map.addEdge(building1, building2, true);
        return this.map;
    }
    
}


