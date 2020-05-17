package org.java.calculation.divide;
import org.java.calculation.Result;

public class Division {
    public Float i1;
    public Float i2;

    public Division(Float i1,Float i2){
        this.i1 = i1;
        this.i2 = i2;
    }

    public Result divide(){
        Number result = i1 / i2;
        return new Result(result);
    }
}