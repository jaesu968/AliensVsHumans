// this is a class for Junit testing

import org.junit.*;

public class HumanTest {
    // create a human object to work with 
    Human human1;  
    Alien alien1; 

    // set up human and alien 
    @Before 
    public void setUp(){
        human1 = new Human(100, "John", 10, 10);
        alien1 = new Alien(100, "Manny");
    }

    // test the armor method 
    @Test
    public void testAttributes() {
        human1.setArmor(10);
        // get armor
        Assert.assertEquals(10, human1.getArmor());
        // get attack damage
        Assert.assertEquals(10, human1.getAtk()); 
        // get health 
        Assert.assertEquals(100, human1.getHealth());
    }
    @Test
    public void  testHumanAttackWithSword(){
        human1.attackWithSword(alien1, 20);
        Assert.assertEquals(80, alien1.getHealth());
    }
    
}
