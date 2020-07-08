package model;

/* A simple adder, with id, model to exemplify
** JUnit 5 usage.
*/
public class AdderFloat{
    private int objectId;
    
    public float add(float x, float y){
        return (x+y);
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }
    
    
}

