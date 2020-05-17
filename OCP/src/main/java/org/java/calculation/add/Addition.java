package org.java.calculation.add;
import org.java.calculation.Result;

public class Addition {
    public Float i1;
    public Float i2;

    public Addition(Float i1, Float i2){
        this.i1 = i1;
        this.i2 = i2;
    }

    public Result add(){
        Number result = i1 + i2;
        return new Result(result);
    }
}