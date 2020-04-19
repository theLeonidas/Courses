package org.methods;

public class ComplexType {
    int intValue;
    float floatValue;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    @Override
    public String toString() {
        return "intValue = " + this.intValue + " , floatValue = " + this.floatValue;
    }
}