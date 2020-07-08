/*
** Examples of parameterized tests using
** ValueSource, CsvSource and CsvFileSource
**
** Author: Fabrício Galende Marques de Carvalho
*/
package model;

import model.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {    
    private Calculator calc;  
    
    public CalculatorTest(){
        int id = (int) (Math.random()*100);
        calc = new Calculator(id);
    }
    
    
    /* Parameterized test that sends only one value
    ** per method call. The values are initialized
    ** in an array literal. Array value types include
    ** shorts, bytes, ints, longs, strings, doubles, floats,
    ** chars, etc..
    */ 
    @Disabled
    @ParameterizedTest 
    @ValueSource(ints={1,2,3,4,5,9})
    public void squareTest(int par01) {
            int result ;
            result = calc.square(par01);
            System.out.println(calc.getObjectId());
            assertEquals(par01*par01, result);            
    }
    
    /* In CsvSource tests each array entry is considered as a
    ** row in a CSV text file, whose delimiter is specified by
    ** delimiter named parameter. Values are passed in the same
    ** order they appear in the string value array to the 
    ** the corresponding method parameters.
    */
    @Disabled
    @ParameterizedTest
    @CsvSource(value={"1:2:3","4:5:9", "11:12:23"},
               delimiter=':')
    public void sumTest(int x, int y, int result){
        System.out.println(calc.getObjectId());
        assertEquals(result, calc.sum(x, y));
    }
    
    /* In a parameterized test a name can be used to each
    ** test case in the report. Argument values can be printed
    ** according to their order in the columns of values.
    */
    
    @ParameterizedTest(name="Teste {index} => x={0} y={1},"
                       + " resultado={2}")
    @CsvFileSource(resources="/valores_teste.csv", 
                   delimiter=',')
    public void sumTestCSV(int x, int y, int result){
        
        System.out.println(calc.getObjectId());
        assertEquals(result, calc.sum(x, y));
    }
    
}
