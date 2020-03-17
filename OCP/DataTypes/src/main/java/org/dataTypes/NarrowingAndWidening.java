package org.dataTypes;

public class NarrowingAndWidening {
    public static void main(String[] args) {

        byte byteDataType = 1;
        short shortDataType = 1;
        char charDataType = 'A';
        int intDataType = 1;
        long longDataType = 1;
        float floatDataType = 1.0f;
        double doubleDataType = 1.0;

        //IMPLICIT WIDENING CONVERSIONS.//
        //Since a smaller data type is being assigned to a larger data type
        //Hence compiler allows this.

        //widening to short.
        shortDataType = byteDataType;

        //widening to int.
        intDataType = byteDataType;
        intDataType = shortDataType;
        intDataType = charDataType;

        //widening to int.
        longDataType = intDataType;
        longDataType = charDataType;
        longDataType = shortDataType;
        longDataType = byteDataType;

        //widening to float.
        floatDataType = longDataType;
        floatDataType = intDataType;
        floatDataType = charDataType;
        floatDataType = shortDataType;
        floatDataType = byteDataType;

        //widening to double.
        doubleDataType = floatDataType;
        doubleDataType = intDataType;
        doubleDataType = charDataType;
        doubleDataType = shortDataType;
        doubleDataType = byteDataType;

        //NARROWING CONVERSION
        //Narrowing conversion need an explicit cast.
        byteDataType = (byte)shortDataType;
        byteDataType = (byte)intDataType;

        shortDataType = (short) intDataType;
        shortDataType = (short)longDataType;

        intDataType = (int) longDataType;
        intDataType = (int) floatDataType;

        longDataType = (long) floatDataType;
        longDataType = (long) doubleDataType;

        floatDataType = (float)doubleDataType;

        //Conversion from byte or short to char is considered a narrowing conversion
        //as byte or short could contain a negative number which is not representable in a
        //char type.
        charDataType = (char)byteDataType;
        charDataType = (char)shortDataType;

        //Similarly float & int are of same size, but assigning float to int results in loss of information
        //& similarly for double to long.Hence compiler asks to cast explicitly.
        intDataType = (int)floatDataType;
        longDataType = (long)doubleDataType;

        //However vice versa assignment from int to float  & long to double is allowed
        //and happens implicitly.
        floatDataType = intDataType;
        doubleDataType = longDataType;

        //Above rule does not apply to a assignment by the way of method calls
        //narrowingMethodCall(122);
    }

    public static void narrowingMethodCall(short s1){

    }
}