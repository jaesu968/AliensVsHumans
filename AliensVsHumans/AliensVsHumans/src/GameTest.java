// JUnit test class 
import org.junit.*; 

public class GameTest {
    // check checkhealth method
    @Test
    public void testCheckHealth() {
        // create a new game object
        Game game = new Game();
        // set the health of the alien to 0
        game.alien1.setHealth(0);
        // check if the health of the alien is 0
        Assert.assertEquals(0, game.alien1.getHealth());
        // check if the health of the human is 0
        Assert.assertEquals(100, game.human1.getHealth());
    }
}
   


