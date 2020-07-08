package model;

/* A simple test class
** Note that test class has a name composed by
** the model class name and the suffix Test.
** Author: Fabrício Galende M. de Carvalho
*/
import model.AdderFloat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdderFloatTest{
    private AdderFloat adderFloat;
    
    @BeforeEach
    public void init(){
        adderFloat = new AdderFloat();
        int id = (int) (Math.random()*100);
        adderFloat.setObjectId(id);
    }
    
    @DisplayName("A simple test for add method (++)")
    @Test
    public void addTestPosPos(){
        System.out.println(adderFloat.getObjectId());
        assertEquals(2.1f, adderFloat.add(1f,1.1f), 0.1, "Should be 2.1");
    }
    
    @DisplayName("A simple test for add method (+-)")
    @Test
    public void addTestPosNeg(){
        System.out.println(adderFloat.getObjectId());
        assertEquals(-0.19f, adderFloat.add(1f,-1.2f), 0.001, "Should be -0.2");
    }
}
