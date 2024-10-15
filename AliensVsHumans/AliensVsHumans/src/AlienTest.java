// this is a Junit testing class
import org.junit.*; 

public class AlienTest {
    // create an alien object to work with 
    Alien alien1;
    // create a human object to attack 
    Human human1; 

    // initialize alien and human objects before each test 
    @Before
    public void setUp(){
        alien1 = new Alien(100, "Manny");
        human1 = new Human(100, "John", 10, 10);
    }
    @Test 
    public void testRegenerate() {
    alien1.regenerate(90);
    Assert.assertEquals(120, alien1.getHealth());
    }
    // test attackWithCyberClaws method 
    @Test
    public void testAttackWithCyberClaws() {
        alien1.attackWithCyberClaws(human1, 20);
        Assert.assertEquals(90, human1.getHealth());
    }

    
}
