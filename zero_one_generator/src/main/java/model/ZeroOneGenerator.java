/*
** A simple model that generates 0 or 1 
** randomly.
** Author: Fabrício Galende M. de Carvalho
 */
package model;

public class ZeroOneGenerator {
    private int zeroOrOne;
    
    public ZeroOneGenerator(){
        this.zeroOrOne = generateZeroOne();        
    }
    
    public int generateZeroOne(){
        long value = Math.round(Math.random());
        return ((int) value);        
    }

    public int getZeroOrOne() {
        return zeroOrOne;
    }

    public void setZeroOrOne(int zeroOrOne) {
        this.zeroOrOne = zeroOrOne;
    }
    
    
}
