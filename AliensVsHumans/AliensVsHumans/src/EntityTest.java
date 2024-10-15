import org.junit.*;

public class EntityTest {
    Entity entity2;

    @Before
    public void setup() {
        entity2 = new Entity(100, "Jane");
    }
    // test get health method 
    @Test
    public void testEntityGetHealth() {
        Assert.assertEquals(100, entity2.getHealth());
    }
    // test set health method
    @Test
    public void testEntitySetHealth() {
        entity2.setHealth(150);
        Assert.assertEquals(150, entity2.getHealth());
    }
    // test get name method
    @Test
    public void testEntityGetName() {
        Assert.assertEquals("Jane", entity2.getName());
    }
    // test set name method 
    @Test 
    public void testEntitySetName() {
        entity2.setName("Jane Doe");
        Assert.assertEquals("Jane Doe", entity2.getName());
    }

    @Test
    public void testEntityAttack() {
        Entity entity1 = new Entity(100, "John");
        entity1.attack(entity2, 10);
        Assert.assertEquals(90, entity2.getHealth());
    }

    @Test
    public void testEntityReceiveDamage() {
        Entity entity1 = new Entity(100, "John");
        entity1.receiveDamage(10);
        Assert.assertEquals(90, entity1.getHealth());
    }
}
