import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EmployeeTest {

    Employee employee;
    @Before
    public void before(){
    employee = new Manager("Joeseph", "JM404040", 30000, "Reception");}

    @Test
    public void canGetEmployeeName(){
        assertEquals("Joeseph", employee.getName());
    }
    @Test
    public void canGetNINum(){
        assertEquals("JM404040", employee.getNINum());
    }
    @Test
    public void canGetSalary(){
        assertEquals(30000, employee.getSalary());
    }
    @Test
    public void canSetEmployeeName(){
        employee.setName("Naz");
        assertEquals("Naz", employee.getName());
    }
    @Test
    public void canSetNINum(){
        employee.setNINum("JM1010");
        assertEquals("JM1010", employee.getNINum());
    }
    @Test
    public void canSetSalary(){
        employee.setSalary(1000);
        assertEquals(1000, employee.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(0.2);
        assertEquals(36000, employee.getSalary());
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(300.0, employee.payBonus());
    }


}
