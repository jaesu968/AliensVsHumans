// This where we will include our common characteristics and methods 
// for all characters (aliens and humans) in our game.
public class Entity {
    // instance variables 
    // what do Humans and Aliens have in common?
    private int health; 
    private String name; 

    // constructor 
    public Entity(int health, String name){
        this.health = health;
        this.name = name;
    }
    

    // getters and setters
    // health methods
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = Math.max(0, health); // Health can't go below 0 
    }
    // name methods
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name; 
    }

    // attack method 
    public void attack(Entity target, int damage){
        System.out.println("Attacking " + target.getName() + " with damage: " + damage); 
        // let each character handle how they take damage
        target.receiveDamage(damage); 
        // display the health of the target after the attack 
        System.out.println(target.getName() + " has " + target.getHealth() + " health left.");
    }
    // receiveDamage method
    public void receiveDamage(int damage){
        setHealth(getHealth()- damage); // by default, apply full damage 
    }

    

}
