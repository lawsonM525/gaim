package mainGaim;
import java.util.Scanner;
public class Task {
    public static Scanner keyboard = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    //Creating a random number generator 
    //Task for the user to guess the random generated number
    public static void Task_1(Player player){
        int min = 1;
        int max = 9;
        int number = (int)(Math.random()*(max-min+1)+min);  
        int count = 0;
        System.out.println("Your task is to guess the randomly generated number. If you succeed you will recieve a coin or you have to try again.");
        System.out.println("Guess the number between 0 to 9");
        int guess = keyboard.nextInt();
        while(guess != number){
            System.out.println("Guess again");
            guess = keyboard.nextInt();
            count = count + 1;
            if(count > 3){
                System.out.println("Hint: You have 1 in 9 chance to guess the number. Guess different number each time to improve your odds");
            }
        }
        if(guess == number){
            System.out.println("Congrats you have passed the task. Here is your coin"); 
            player.pickUp(new Item("Emerald coin", "A shiny coin"));
        } 
    }

    public static void Task_2(Player player){
        int min = 1;
        int max = 9;
        int number = (int)(Math.random()*(max-min+1)+min); 
        int old_number = number;
        String guess;

        System.out.println("Are you familiar with the game higher or lower? For this task you need to guess if the number is going to be higher or lower than number provided");
        System.out.println("You need to have 3 right guess in a row to complete this task successfully");
        System.out.println("Number ranges from 1 to 9");
        
        int count = 0;
        System.out.println("The current number is: " + number);
        System.out.println("Higher or lower?");
        guess = input.next();
        guess.toLowerCase();
        old_number = number;
        number = (int)(Math.random()*(max-min+1)+min); 

        while(count < 2){
            if(guess.equals("higher") && old_number < number ){
                count = count + 1;
                System.out.println("Correct!");    
                System.out.println("Count:" + count);
                System.out.println("You count should reach 3 to pass the task. If you guess wrong the count goes to 0");
                System.out.println("The current number is: " + number);
                System.out.println("Higher or lower?");
                guess = input.next();
                old_number = number;
                number = (int)(Math.random()*(max-min+1)+min); 
            }

            else if (guess.equals("lower") && old_number > number ){
                count = count + 1;
                System.out.println("Correct!");    
                System.out.println("Count:" + count);
                System.out.println("You count should reach 3 to pass the task. If you guess wrong the count goes to 0");
                System.out.println("The current number is: " + number);
                System.out.println("Higher or lower?");
                guess = input.next();   
                old_number = number;
                number = (int)(Math.random()*(max-min+1)+min); 
            }

            else if (guess.equals("lower") || guess.equals("higher") && old_number == number ){
                count = count + 1;
                System.out.println("Correct!");    
                System.out.println("Count:" + count);
                System.out.println("You count should reach 3 to pass the task. If you guess wrong the count goes to 0");
                System.out.println("The current number is: " + number);
                System.out.println("Higher or lower?");
                guess = input.next();   
                old_number = number;
                number = (int)(Math.random()*(max-min+1)+min); 
            }

            else{
                count = 0;
                System.out.println("Wrong!");    
                System.out.println("Count:" + count);
                System.out.println("You count should reach 3 to pass the task. If you guess wrong the count goes to 0");
                System.out.println("The current number is: " + number);
                System.out.println("Higher or lower?");
                guess = input.next();  
                old_number = number;
                number = (int)(Math.random()*(max-min+1)+min); 
            }
            
        }

        System.out.println("Congrats on passing the task. Here is your coin");
        player.pickUp(new Item("Ruby coin", "A shiny coin"));

    }

    public static void Task_3(Player player){    
        // Math quiz game which generates random numbers to create random questions
        int min = 10;
        int max = 50;
        int a = (int)(Math.random()*(max-min+1)+min); 
        int b = (int)(Math.random()*(max-min+1)+min);
        int c = (int)(Math.random()*(max-min+1)+min);
        int answer = a * b + c;
        int guess;
        System.out.println("Solve the following problem to receive a coin.");
        System.out.println(a + " * " + b + " + " + c);
        guess = input.nextInt();
        while(answer != guess){
            System.out.println("Wrong! Try again");
            guess = input.nextInt();
        }
        if(answer == guess){
           System.out.println("Correct! Here is your coin");
           player.pickUp(new Item("Sapphire coin", "A shiny coin"));
        }
    }

}


