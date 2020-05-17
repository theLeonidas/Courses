package org.java.calculation.multiply;
import org.java.calculation.Result;

public class Multiplication {
    public Float i1;
    public Float i2;

    public Multiplication(Float i1, Float i2){
        this.i1 = i1;
        this.i2 = i2;
    }

    public Result multiply(){
        Number result = i1 * i2;
        return new Result(result);
    }
}