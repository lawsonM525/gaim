public class Main {
    public static void main(String[] args) {
        
        // Desiging our world

        //Creating world and its locations
        World world = new World("Nightmare Land", new int[]{10,10});
        Building center = new Building("Spunkoids", "Woodlands of the Spirits", 1);
        Library lostLbrary = new Library("Lost Library", "Alibrary full of lost souls", 3, true);
        Building devilLake = new Building("Lake of Devils", "A lake full of devils", 1);
        House hauntedHouse = new House("Haunted House", "A tall house full of ghosts", 5, true, true);
        Cafe frogCafe = new Cafe("Frog Cafe", "A cafe full of hoppity hoppities", 1, 50, 20, 300, 60);
        world.addBuilding(center);
        world.addBuilding(lostLbrary);
        world.addBuilding(devilLake);
        world.addBuilding(hauntedHouse);
        world.addBuilding(frogCafe);
        //Connecting world locations
        world.connectBuildings(center, lostLbrary);
        world.connectBuildings(center, devilLake);
        world.connectBuildings(center, hauntedHouse);
        world.connectBuildings(center, frogCafe);
        world.connectBuildings(lostLbrary, devilLake);
        world.connectBuildings(lostLbrary, hauntedHouse);
        world.connectBuildings(hauntedHouse, frogCafe);
        world.connectBuildings(frogCafe, devilLake);
        // TODO: create function to print visual map of world

        


    }
}

