// JUnit test class 
import org.junit.*; 

public class EnvironmentTest {
    // test the constructor from the Environment class
    @Test
    public void testEnvironmentConstructor(){
        Environment environment1 = new Environment("Earth", "A planet full of humans");
        Assert.assertEquals("Earth", environment1.getPlace());
        Assert.assertEquals("A planet full of humans", environment1.getDescription());
}

    // test the setAlienInitialEnvironment method from the Environment class
    @Test
    public void testSetAlienInitialEnvironment(){
        // initialize the environment
        Environment environment1 = new Environment("Unknown", "unknown");
        // call the setAlienInitialEnvironment method
        environment1.setAlienInitialEnvironment();  
        // assert that the place is "Alien Home World"
        Assert.assertEquals("Alien Home World", environment1.getPlace());
    }
    // test the setHumanInitialEnvironment method from the Environment class
    @Test
    public void testSetHumanInitialEnvironment(){
        // initialize the environment
        Environment environment1 = new Environment("Unknown", "unknown");
        // call the setHumanInitialEnvironment method
        environment1.setHumanInitialEnvironment();
        // assert that the place is "Earth"
        Assert.assertEquals("Earth", environment1.getPlace());
    }

}
