import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Sandy", "JM4020", 100, "IT");
    }
    @Test
    public void canGetDeptName(){
        assertEquals("IT", manager.getDeptName());
    }@Test
    public void canGetName(){
        assertEquals("Sandy", manager.getName());
    }@Test
    public void canGetNINum(){
        assertEquals("JM4020", manager.getNINum());
    }@Test
    public void canGetSalary(){
        assertEquals(100, manager.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.1);
        assertEquals(110, manager.getSalary());
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(1.0, manager.payBonus(), 0.01);
    }


}
