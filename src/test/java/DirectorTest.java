import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("John", "JM4011", 2000, "Head Huncho", 10000);
    }
    @Test
    public void canGetBudget(){
        assertEquals(10000, director.getBudget(), 0.01);
    }
    @Test
    public 



}
