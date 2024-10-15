public class Human extends Entity {
    // instance variables for humans
    private int armor; 
    private int atk;
    // constructor for human class
    
    public Human(int health, String name, int armor, int atk){
        super(health, name);
        this.armor = armor;
        this.atk = atk;
    }
    
    // humans can wear armor (but can't regenerate)
    public void setArmor(int armor){
        this.armor = armor;
    }
    public int getArmor(){
        return this.armor;
    }
    // set attack 
    public void setAtk(int atk){
        this.atk = atk;
    }
    // get attack
    public int getAtk(){
        return this.atk;
    }

    // no need for a specific human attack method 
    // since the character class already has an attack method
    // only if a human finds a sword, they use it to attack 

    // humans can use swords
    // this is different than the attack method from the Entity class
    // this is a specific human attack method and it increases damage from the base attack of the Entity class
    public void attackWithSword(Entity target, int damage){
        System.out.println("Using a sword to attack");
        System.out.println("Dealing " + damage + " damage");
        // 
        target.receiveDamage(damage);
    }
    // override the receiveDamage method from the Entity class because Humans wear armor 
    // and armor reduces damage taken
    @Override
    public void receiveDamage(int damage){
        // if there is armor, absorb damage with armor first 
        if(this.armor > 0){
            if (damage >= this.armor){
                // if damage is greate than or equal to armor, reduce armor to 0 
                // and subtract the remaining damage from health 
                damage -= this.armor; 
                this.armor = 0;
                this.setHealth(this.getHealth() - damage); 
            }else{
                // if damage is less than armor, only reduce the armor
                this.armor -= damage; 
            } 
        }else{
            // if no armor, directly reduce health 
            this.setHealth(this.getHealth() - damage);
        }
    }

}
    
