package org.dataTypes;

public class NarrowingAndWidening {
    public static void main(String[] args) {

//        showWideningAssignments();
//        showNarrowingAssignments();
    }

    private static void showWideningAssignments() {
    //-----------------------Widening-----------------//
        byte byteDataType = 64;
        short shortDataType = 177;
        char charDataType = 'A';
        int intDataType = 723634;
        long longDataType = 9867468l;
        float floatDataType = 12121.212f;
        double doubleDataType = 11.121d;

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
    }

    private static void showNarrowingAssignments() {
        //-----------------------Narrowing-----------------//

        byte byteDataType = 64;
        short shortDataType = 177;
        char charDataType = 'A';
        int intDataType = 723634;
        long longDataType = 9867468l;
        float floatDataType = 12121.212f;
        double doubleDataType = 11.121d;

        //Compiler errors
//        byteDataType =  shortDataType;
//        byteDataType =  intDataType;
//
//        shortDataType = intDataType;
//        shortDataType = longDataType;
//
//        intDataType = longDataType;
//        intDataType = floatDataType;
//
//        longDataType = floatDataType;
//        longDataType = doubleDataType;
//
//        floatDataType = doubleDataType;

        //Explicit narrowing.
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

        //Implicit Narrowing.
        byte b1 = 100;
    }
}