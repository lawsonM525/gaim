**Design Justification**

**Game Design**
The game is generally designed to guide the player through a series of tasks and challenges in order to escape the "Nightmare Land." The game begins by welcoming the player and providing them with a brief introduction to the setting and their objective. The player is then given a set amount of time (in this case, 5 minutes) to find the exit and escape the Nightmare Land.

To achieve this goal, the player is able to move between different locations within the game world and interact with the various buildings and objects within these locations. The player can also collect items, such as keys and coins, which can be used to solve puzzles and overcome obstacles.

The game is structured around a series of tasks, each of which is designed to challenge the player's problem-solving skills and knowledge. These tasks are presented in a linear fashion (but the player can access them in any order), with each task building upon the skills and knowledge acquired in the other tasks. This structure helps to gradually introduce new concepts and mechanics to the player, allowing them to learn and adapt as they progress through the game.

The game also includes a variety of non-essential activities, such as visiting the cafe to purchase items or completing minigames for rewards, which serve to enrich the player's experience and provide additional challenges.

Overall, the design of the game is intended to create a sense of progression and challenge for the player as they work towards their ultimate goal of escaping the Nightmare Land. The combination of task-based gameplay, collectible items, and non-essential activities creates a well-rounded and engaging experience for the player.

**Alternative Design**
One alternative design that could have been used in the Main class is to create a separate class for handling the game timer. This design would involve creating a Timer class with methods such as startTimer, endTimer, and getTimeElapsed. The Main class could then instantiate a Timer object and use its methods to handle the game's time limit.

This alternative design was not chosen because it would have added additional complexity to the code, as it would require creating and implementing a new class. Additionally, the current design of using a combination of timeStart, timeEnd, and timeDelta variables in the Main class is simple and effective in handling the game's time limit. It also takes advantage of Java's built-in System class. Using separate variables to track the start time, end time, and time elapsed is a straightforward approach that requires minimal additional code. As such, it was determined that the current design was a better choice for this game.

**Story & Narrative**
The narrative of the game is centered around the player being trapped in a nightmare world and their goal is to escape by finding the exit. This adds a sense of urgency to the game and creates a clear objective for the player to work towards. The various buildings and locations in the game, such as the "Lost Library" and the "Haunted House," contribute to the overall atmosphere of the game being set in a nightmare world. The inclusion of tasks and challenges that the player must complete in order to progress through the game adds an element of gameplay and keeps the player engaged in the story. Overall, the story and narrative of the game effectively sets the tone and provides a clear goal for the player to work towards, adding to the overall enjoyment of the game.

**Class Design**

(Class Architecture)[Annotated architecture diagram.jpg]

(World Map)[Map.jpg]
We used a graph class to implement the map of the game world instead of a grid system, as we believe it would be easier for a user to hop from place to place when the places are small, finite and connected by edges.
Since users are limited by a timer, we simplified the game by only adding five locations on the map so they can all have tasks and the user can navigate through them before the timer ends.

(Items)[Item.java]
The items class represents various items that a player can pick up and use within a game. The class includes instance variables for the name and description of each item, as well as two constructors for creating new items.

The first constructor allows for the creation of an item with just a name, while the second constructor allows for the creation of an item with both a name and a description. This allows for a range of items to be created with different levels of detail, depending on the needs of the game.

The Item class also includes a main method, which creates three example items (Coffee, Coin, and Key) using the two constructors. This allows for the creation and use of these items within the game.

Overall, the design of the Item class is intended to provide a simple and flexible representation of various items that a player can pick up and use within the game. The inclusion of both name and description variables allows for a range of different items to be created, while the use of constructors allows for easy creation of new items.

(Tasks)[Task.java]
The task class represents various tasks that a player can complete within a game. The class includes several static methods, each of which represents a different task that the player can complete.

The first task, Task_1, is a simple guessing game in which the player must guess a randomly generated number between 1 and 9. If the player correctly guesses the number, they are rewarded with an item. The second task, Task_2, is a game of "higher or lower" in which the player must guess whether a subsequent randomly generated number will be higher or lower than the previous one. If the player correctly guesses three numbers in a row, they are rewarded with an item. The third task, Task_3, is a quiz with a series of multiple choice questions. If the player correctly answers at least three of the questions, they are rewarded with an item.

Overall, the design of the Task class is intended to provide a range of simple, self-contained tasks that the player can complete within the game, with coins for successful completion. The use of static methods allows these tasks to be easily called and completed by the player at various points within the game. 

(Players)[Player.java]
The player class represents a player in the game. It includes various methods for managing a player's inventory of items, as well as methods for moving the player to different buildings and interacting with items within the game.

The Player class includes instance variables for the player's name and current position, as well as a hashtable to store the player's inventory of items. The inventory is implemented as a hashtable to allow for efficient insertion, retrieval, and update of items, as well as to easily keep track of the number of each item in the inventory.

The class also includes various methods for adding and removing items from the inventory, as well as for moving the player to different buildings and using items within the game. The pickUp and drop methods allow the player to add and remove items from their inventory, while the move method allows the player to change their current position within the game. The useItem method allows the player to consume items in their inventory. Finally, the listInventory method allows the player to view a list of the items in their inventory.

Overall, the design of the Player class is intended to provide a robust and flexible representation of a player in the game, with a range of methods for managing their inventory and interacting with the game world.

(Commands)[Command.java]
The command class provides a range of commands that a player can use within a game. The class includes a call method which takes in a command string and a Player object and calls the appropriate action based on the command.

The call method includes a switch statement with several case blocks, each of which represents a different command that the player can use. Some of the available commands include take, which allows the player to pick up an item, drop, which allows the player to drop an item, move, which allows the player to move to a different location, and inventory, which displays the player's inventory. Other commands include whereami, which displays the player's current location, help, which displays a list of available commands, and quit, which exits the game.

Overall, the design of the Commands class is intended to provide a range of simple and intuitive commands that the player can use to interact with the game world and make progress through the game. The use of a switch statement and individual case blocks allows for easy expansion of the available commands as the game is developed further.


(Buildings)[Building.java]
For the buildings, we brought in the building classes we created from previous assignments. This saved us some time with coding. However, there are a few functions within these building classs that we did not use. We did not take them out though, because we would like to build on the game some more and use them in the future.
The (house)[House.java], (cafe)[Cafe.java], and (library)[Library.java] classes all extend the building class are they all types of buildings with different functions. The Lake of Devils within the world is the only direct instance of the building class, as it does not fall under a house, cafe, or library.

