package org.methods;

public class DefaultConstructor {
    protected byte byteValue;
    protected short shortValue;
    protected char charValue;
    protected int intValue;
    protected long longValue;
    protected float floatValue;
    protected double doubleValue;
    protected String stringValue;
    protected boolean booleanValue;

    public String toString(){
        return new StringBuilder().append("Name of the class : ")
                           .append(this.getClass())
                           .append("\nbyteValue : ")
                           .append(byteValue)
                           .append("\nshortValue : ")
                           .append(shortValue)
                           .append("\ncharValue : ")
                           .append(charValue)
                           .append("\nintValue : ")
                           .append(intValue)
                           .append("\nlongValue : ")
                           .append(longValue)
                           .append("\nfloatValue : ")
                           .append(floatValue)
                           .append("\ndoubleValue : ")
                           .append(doubleValue)
                           .append("\nstringValue : ")
                           .append(stringValue)
                           .append("\nbooleanValue : ")
                           .append(booleanValue)
                           .toString();
    }
}