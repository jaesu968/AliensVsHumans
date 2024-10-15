// This class is used to create different environments in the game.
// this class also handles interactions with entities in the game. 
public class Environment {
    // instance variables
    // places 
    private String place; 
    private String description; 

    // method to create a new environment 
    public Environment(String place, String description){
        this.place = place;
        this.description = description;
    }
    // getters and setters
    public String getPlace(){
        return this.place;
    }
    public void setPlace(String place){
        this.place = place;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    // set up the initial environment for an alien 
    public void setAlienInitialEnvironment(){
        // if the user chooses to be an alien , you are taken to the alien home world
        this.place = "Alien Home World";
        System.out.println("You are in " + this.place + ".");
        System.out.println("You see " + this.description + ".");
    }
    // set up the initial environment for a human
    public void setHumanInitialEnvironment(){
        // if the user chooses to be a human, you are taken to Earth
        this.place = "Earth";
        System.out.println("You are in " + this.place + ".");
        System.out.println("You see " + this.description + ".");
    }


}
