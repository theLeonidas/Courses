package org.java.calculation.subtract;
import org.java.calculation.Result;

public class Subtraction {
    public Float i1;
    public Float i2;

    public Subtraction(Float i1, Float i2){
        this.i1 = i1;
        this.i2 = i2;
    }

    public Result subtract(){
        Number result = i1 - i2;
        return new Result(result);
    }
}