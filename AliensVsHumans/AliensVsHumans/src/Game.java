// import the Scanner class so we can get user input
import java.util.Scanner;

public class Game {
    // create a scanner object for user input
    Scanner scanner = new Scanner(System.in);
    // create an instance variable for the Alien environment 
    Environment alienEnvironment = new Environment("Alien Home World", "a strange alien world");
    // create an instance variable for the Human environment
    Environment humanEnvironment = new Environment("Earth", "Welcome to Earth!");
    // create a generic Entity object for the user to input their choice and 
    // make it an alien or human 
    Entity player; 
    Entity opponent; 

    String userChoice; //  a variable to store the user's choice
    boolean validChoice = false; // a variable to check if the user's choice is valid

    public static void main(String[] args) throws Exception {
        // reset health of characters 

        // start the game and load the environment 
        Game game1 = new Game(); 
        game1.startGame(); // this will start the game and call the play game method 

        
    }
    // start game method 
    public void startGame() {
        System.out.println("Starting the game...");
        System.out.println("Welcome to Aliens Vs. Humans!");

        // reset validChoice for a new game 
        validChoice = false;
        // loop to keep asking the user for a valid choice
        while(!validChoice){
            System.out.println("Time to choose, your character, alien or human? (a/h)");
            // get the user's choice
            userChoice = getUserChoice(); 
            // use if-else statement to check if the user's choice is valid
            if (userChoice.equals("alien")){
                // set the alien environment , this will create an alien object as well 
                alienEnvironment.setAlienInitialEnvironment();
                player = new Alien(110, "Zyrgas"); 
                opponent = new Human(100, "Max", 10, 10);
                validChoice = true;
                System.out.println("Humans have arrived on your planet! Time to battle!"); 
            } else if (userChoice.equals("human")){
                // set the human environment , this will create a human object as well
                humanEnvironment.setHumanInitialEnvironment();
                player = new Human(120, "Max", 10, 10);
                opponent = new Alien(100, "Zyrgas");
                validChoice = true;
                System.out.println("Aliens have invaded Earth! Time to battle!");
            } else {
                System.out.println("Invalid choice, please try again.");{
                
                }
            }
            // start the battle after choosing character
            playGame(); 
        }
    }
    // play game method that activates the make choice method 
    public void playGame() {
        // while both characters are alive, the game continues
        while(player.getHealth() > 0 && opponent.getHealth() > 0) {
            // call the make choice method
            makeChoice();
            checkHealth(); 
        }
    }

    // method to get if user is an alien or human from startGame method
    public String getUserChoice() {
        // get the user's input
        String userInput = scanner.nextLine();
        // check the user's choice
        switch (userInput.toLowerCase()) { // ensure case-insensitivity 
            case "a":
                System.out.println("You chose to be an alien!");
                // return "alien" 
                return "alien";
            case "h":
                System.out.println("You chose to be a human!");
                // return "human" 
                return "human";
            default:
                System.out.println("Invalid input, please try again");
                return getUserChoice(); // using recursion to get user input again
        }
    }

    // method that allows users to make choices in the game 
    // a user can choose to attack, find a weapon, or use a speical ability or weapon
    public void makeChoice() {
        // Display the menu of choices 
        System.out.println("What would you like to do?");
        System.out.println("1. Attack");
        System.out.println("2. Use weapon or special ability"); 
        // get the user's choice
        int choice = scanner.nextInt();
        // consume the newline character
        scanner.nextLine();
        // check the user's choice
        switch (choice) {
            case 1:
                System.out.println("You chose to attack!"); 
                // call the attack method from the Entity class
                // use if-else statement to check if the user is an alien or human
                player.attack(opponent, 10); 
                break;
            case 2: 
                System.out.println("You use a weapon or special ability!");
                // use the if-else statement to check if the user is an alien or human
                if (player instanceof Alien){
                    // call the attackWithCyberClaws method from the Alien class
                    ((Alien)player).attackWithCyberClaws(opponent, 20); 
                } else if (player instanceof Human){
                    // call the attackWithSword method from the Human class
                    ((Human)player).attackWithSword(opponent, 20);
                }   
                break;
            default: 
            System.out.println("Invalid input, please try again");
            break;
    
        }
    }

    // check health method to see if the battle is over or not
    public void checkHealth() {
        // check the health of the alien and human
        // if the alien's health is less than or equal to 0, the human wins
        // if the human's health is less than or equal to 0, the alien wins
        if (opponent.getHealth() <= 0) {
            System.out.println("The human wins!");
            endGame();
        } else if (player.getHealth() <= 0) {
            System.out.println("The alien wins!");
            endGame();
        }
    }
    // end game method
    public void endGame() {
        System.out.println("Ending game...");
        System.out.println("Thanks for playing!");
        // ask the user if they want to play again or exit 
        System.out.println("Would you like to play again? (y/n)");
        String userInput2 = scanner.nextLine();
        if (userInput2.equalsIgnoreCase("y")){
            startGame();
        } else {
            exitGame();
        }
    }
        // exit game method 
        public void exitGame() {
            System.out.println("Exiting game...");
            // check if user really wants to close the game
            System.out.println("Are you sure you want to exit? (y/n)");
            String userInput3 = scanner.nextLine();
            if (userInput3.equalsIgnoreCase("y")){
                System.out.println("Exiting game...");
                System.out.println("Thanks for playing!");
                // close the scanner object
                scanner.close();
                System.exit(0); // terminate the program 
            } else {
                startGame();
            }
        }

}
