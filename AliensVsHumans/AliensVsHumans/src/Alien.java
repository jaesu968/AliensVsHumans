// class for unique characteristics of Aliens 
public class Alien extends Entity {
    // instance variable for aliens
    // aliens can't regenerate above max health 
    private int maxHealth = 120;
    // Alien constructor
    public Alien(int health, String name){
        super(health, name);
    }
    // aliens regenerate so here is a method for that
    // will use this method in Game class to regenerate alien health 
    public void regenerate(int healthToRegenerate){
       // aliens regenerate by increasing their health 
       this.setHealth(this.getHealth() + healthToRegenerate); 
       // if health is greater than max health, set health to max health
       if(this.getHealth() > maxHealth){
        this.setHealth(maxHealth);
       }
    }

    // Aliens can use cyberclaws for special attack
    public void attackWithCyberClaws(Entity target, int damage){
        System.out.println("Using cyberclaws to attack");
        System.out.println("Dealing " + damage + " damage");
        target.receiveDamage(damage);
    }

    
}
