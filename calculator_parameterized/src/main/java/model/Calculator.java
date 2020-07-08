package model;

public class Calculator{
    
    private int objectId;
    
    public Calculator(int id){
        setObjectId(id);
    }
    
    public int sum(int x, int y){
        return (x+y);
    }    
    public int subtract(int x, int y){
        return (x-y);
    }    
    public int square(int x){
        return (x*x);
    }  

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }
    
}
