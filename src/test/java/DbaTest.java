import TechStaff.Dba;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DbaTest {
     Dba Dba;

     @Before
     public void before(){
          Dba = new Dba ("John", "JM1010", 100 );
     }
     @Test
     public void canGetName(){
          assertEquals("John", Dba.getName());
     }@Test
     public void canGetNINum(){
          assertEquals("JM1010", Dba.getNINum());
     }@Test
     public void canGetSalary(){
          assertEquals(100, Dba.getSalary());
     }
     @Test
     public void canRaiseSalary(){
          Dba.raiseSalary(0.1);
          assertEquals(110, Dba.getSalary());
     }
     @Test
     public void canGetPayBonus(){
          assertEquals(1.0, Dba.payBonus(), 0.01);
     }


}
