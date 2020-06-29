package model;

/* A simple test class
** Note that test class has a name composed by
** the model class name and the suffix Test.
** Author: Fabrício Galende M. de Carvalho
*/
import model.Adder;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdderTest{
    @Test
    public void addTest(){
        Adder adder = new Adder();
        assertEquals(2,adder.add(1,1),"should be 2");
   }
}
