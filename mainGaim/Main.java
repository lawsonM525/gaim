package mainGaim;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static long timeStart;
    private static long timeEnd;
    private static long timeDelta;
    private static long timeLimit;
    public static World world;
    public static Building center;
    public static Library lostLibrary;
    public static Building devilLake;
    public static House hauntedHouse;
    public static Cafe frogCafe;
    public Player player;

    

    /**
     * Moves player from one building to another within the game's world
     * @param building to move to
     */
    public static void move(int destination, Player player){
        if (destination == 1){
            player.position = center;
            System.out.println(player.position.toString());
        }
        else if (destination == 2){
            player.setPosition(lostLibrary);
            System.out.println(player.position.toString());
        }
        else if (destination == 3){
            player.position = hauntedHouse;
            System.out.println(player.position.toString());
        }
        else if (destination == 4){
            player.position = frogCafe;
            System.out.println(player.position.toString());
        }
        else if (destination == 5){
            player.position = devilLake;
            System.out.println(player.position.toString());
        }
        else{
            System.out.println("Invalid input");
        }

    }
    public static void main(String[] args) {
        
        // DESIGNING OUR WORLD
        //Creating world and its locations
        world = new World("Nightmare Land", new int[]{10,10});
        center = new Building("Spunkoids", "Woodlands of the Spirits", 1);
        lostLibrary = new Library("Lost Library", "Alibrary full of lost souls", 3, true);
        devilLake = new Building("Lake of Devils", "A lake full of devils", 1);
        hauntedHouse = new House("Haunted House", "A tall house full of ghosts", 5, true, true);
        frogCafe = new Cafe("Frog Cafe", "A cafe full of hoppity hoppities", 1, 50, 20, 300, 60);
        world.addBuilding(center);
        world.addBuilding(lostLibrary);
        world.addBuilding(devilLake);
        world.addBuilding(hauntedHouse);
        world.addBuilding(frogCafe);
        //Connecting world locations
        world.connectBuildings(center, lostLibrary);
        world.connectBuildings(center, devilLake);
        world.connectBuildings(center, hauntedHouse);
        world.connectBuildings(center, frogCafe);
        world.connectBuildings(lostLibrary, devilLake);
        world.connectBuildings(lostLibrary, hauntedHouse);
        world.connectBuildings(hauntedHouse, frogCafe);
        world.connectBuildings(frogCafe, devilLake);
        System.out.println("World created successfully.");
        // TODO: create function to print visual map of world

        //Creating our player

        //Taking input for player name
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        Player player = new Player(name, center);


        //GAME BEGINS
        
        //TODO: create timer to start game
        System.out.println("Welcome to the Nightmare Land, "+ player.name+"!");
        System.out.println("You are in the center of the land. Look through your cheatsheet to find commands you can use to explore the land.");
        System.out.println("You have 5 minutes to find the exit and escape. The clock is ticking! ");
        timeStart = System.nanoTime();

        //While loop to determine whether or not user has escaped world
        boolean free = false;
        boolean shutDown = false;

        //Main game runs within this while loop
        while ((!free)&&(!shutDown)) {
            //Creating timer
            timeEnd = System.nanoTime();
            timeDelta = timeEnd - timeStart;
            timeLimit = 180000000000L;//3 minutes as nano seconds
            
            Commands.call(input.nextLine(), player);

            //Center of the world
            if (player.position == center){
                System.out.println("You are in Spunkoinds. The Woodlands of the Spirits.");
                System.out.println("The great door to the exit is here. Can you open it?");
            }

            //Lost Library events
            if (player.position == lostLibrary){
                System.out.println("You are in the Lost Library. A library full of lost souls.");
                System.out.println("This place is full of books and it befits a knowledge task.");
                System.out.println("Would you like to complete the task to earn a coin?");
                System.out.println("Type 'yes' or 'no' to answer.");
                String answer = input.nextLine();
                if ((answer.equals("yes"))||(answer.equals("Yes"))||(answer.equals("YES"))){
                    Task.Task_3(player);
                } else {
                    System.out.println("You can proceed with exploring the world then.");
                }
            }

            //Lake of Devils events
            if (player.position == devilLake){
                System.out.println("You are in the Lake of Devils. A lake full of devils.");
                System.out.println("This place is full of water and it befits a task that gets you swimming through your mind.");
                System.out.println("Would you like to complete the task to earn a coin?");
                System.out.println("Type 'yes' or 'no' to answer.");
                String answer = input.nextLine();
                if ((answer.equals("yes"))||(answer.equals("Yes"))||(answer.equals("YES"))){
                    Task.Task_2(player);
                } else {
                    System.out.println("You can proceed with exploring the world then.");
                }
            }

            //Haunted House events
            if (player.position == hauntedHouse){
                System.out.println("You are in the Haunted House. A tall house full of ghosts.");
                System.out.println("This place is full of ghosts and it befits a task that gets you thinking about the past.");
                System.out.println("Would you like to complete the task to earn a coin?");
                System.out.println("Type 'yes' or 'no' to answer.");
                String answer = input.nextLine();
                if ((answer.equals("yes"))||(answer.equals("Yes"))||(answer.equals("YES"))){
                    Task.Task_1(player);
                } else {
                    System.out.println("You can proceed with exploring the world then.");
                }
            }

            //Frog Cafe events
            if (player.position == frogCafe){
                System.out.println("You are in the Frog Cafe. A cafe full of hoppity hoppities.");
                System.out.println("This place is full of frogs and has a *slightly* contaminated coffee bar.");
                System.out.println("Would you like to make some coffee to increase your time?");
                System.out.println("Type 'yes' or 'no' to answer.");
                String answer = input.nextLine();
                if ((answer.equals("yes"))||(answer.equals("Yes"))||(answer.equals("YES"))){
                    frogCafe.makeCoffee(1);
                    Item Coffee;
                    player.pickUp(Coffee = new Item("Coffee"));
                    player.useItem(Coffee);
                } else {
                    System.out.println("You can proceed with exploring the world then.");
                }
            }

            // check if time limit has been reached
            if (timeDelta >= timeLimit) {
                System.out.println("Time's up. You're stuck here forever. :(");
                break;
            }
            else{
                System.out.println("You have " + (timeLimit - timeDelta)/1000000000 + " seconds left.");
            }


        }
        input.close();

    }
}

