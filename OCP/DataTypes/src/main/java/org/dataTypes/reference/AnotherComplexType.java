package org.dataTypes.reference;

import java.util.Arrays;

public class AnotherComplexType {
    float floatType = 3456.2232f;
    double doubleType = 3434343.12121;

    public void printAnotherComplexType(){
        System.out.println(AnotherComplexType.class.getCanonicalName());
        System.out.println();
        System.out.println("I am another complex type defined within the complex type.");
        System.out.println("I am made up of following primitives : ");
        Arrays.stream(AnotherComplexType.class.getDeclaredFields())
              .forEach(field -> System.out.println(field.getType()));
        System.out.println();
    }
}