package org.dataTypes.reference;

import java.util.Arrays;

public class ComplexType {
    byte byteType = 12;
    short shortType = 23;
    char charType = 'A';
    int integerType = 4555;
    long longType = 4567890;

    AnotherComplexType anotherComplexType = new AnotherComplexType();

    public void printComplexType(){
        System.out.println("Hi!! I am a complex data type.");
        System.out.println("I am made up of primitive as well as reference types.");
        System.out.println("My primitive types are : ");
        System.out.println();
        Arrays.stream(ComplexType.class.getDeclaredFields())
              .filter((field -> !field.getType().equals(AnotherComplexType.class)))
              .forEach((field -> System.out.println(field.getType())));

        System.out.println();
        System.out.print("My referece types are : ");
        anotherComplexType.printAnotherComplexType();
        System.out.println();
    }
}