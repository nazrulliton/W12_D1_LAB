import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Dave", "JM10101", 100);

    }@Test
    public void canGetName(){
        assertEquals("Dave", developer.getName());
    }@Test
    public void canGetNINum(){
        assertEquals("JM10101", developer.getNINum());
    }@Test
    public void canGetSalary(){
        assertEquals(100, developer.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.1);
        assertEquals(110, developer.getSalary());
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(1.0, developer.payBonus(), 0.01);
    }
}
