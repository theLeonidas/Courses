package org.arrays;

import java.util.Arrays;

public class OneDArray implements Feature{
    @Override
    public void displayFeatures() {
        arrayDeclaration();
        creationAndInitialization();
        playingWithOneDArrays();
    }

    private void arrayDeclaration(){
        //Correct ways of array declaration.
        int [] arrayOfInts;
        int anotherArrayOfInts[];

        float [] arrayOfFloats;
        char arrayOfChars[];

        //Incorrect ways of declaring
        //int [5] incorrectIntArray;
        //float incorrectFloatArray [24];
        //CustomType [5] incorrectCustomType;
        //CustomType incorrectCustomType[23];
    }

    //Using the new Operator
    private void creationAndInitialization() {
        int [] arrayOfInt = new int [5];
        int [] arrayOfInteger = {1,2,3,45,6};

        float arrayOfFloats[] = new float[5];
        float arrayOfFloat[] = {1.2f,3.3f,4.32f,4.5f};

        char [] arrayOfChar = new char[5];
        char [] arrayOfChars = {'a','b','c','d','e'};

        //Array of References.
        String [] arrayOfString = new String[5];
        String [] arrayOfStrings = {new String("OCP-1"),new String("OCP-2"),new String("OCP-3")};

        //Displaying the default values.
        //All  primitives are assigned
        //Array of integers are initialized to all zeroes.
        System.out.println("Default values in array of Integers.");

        for(int i=0;i<arrayOfInt.length;i++)
            System.out.print(arrayOfInt[i] + ",");

        System.out.println();
        System.out.println();

        System.out.println("Default values in array of floats.");
        //Array of float are initialized to all 0.0.
        for(int i=0;i<arrayOfFloats.length;i++)
            System.out.print(arrayOfFloats[i] + ",");

        System.out.println();
        System.out.println();

        System.out.println("Default values in array of characters.");
        //Array of character are initialized to all blank.
        for(int i=0;i<arrayOfChar.length;i++)
            System.out.print(arrayOfChar[i] + ",");

        System.out.println();
        System.out.println();

        System.out.println("Default values in array of String.");
        //Array of Strings are initialized to all nulls.
        for(int i=0;i<arrayOfString.length;i++)
            System.out.print(arrayOfString[i] + ",");

        System.out.println();

        //Anonymous Array creation & initialization.
        int [] arrayOfIntegers = new int[]{1,2,3,45,6};
        char anonArrayOfChars[] = new char[]{'a','c','b','g'};
        float[] annonymousArrayOfFloats = new float[]{1.22f,22.22f,123.22f,99.22f};

        //Incorrect way of Anonymous creation.
        //Supplying a size in anonymous array is not allowed.
        //int [] AnonymousArrayOfIntegers = new int[5]{1,2,3,45,6};

        System.out.println();
    }

    private void playingWithOneDArrays() {
        System.out.println();

        int [] arrayOfInts = new int[5];

        //Array assignment.
        for(int i=0;i<arrayOfInts.length;i++){
            //Using index into the array we assign values to a specific location in the array.
            arrayOfInts[i] = i+1;
        }

        Arrays.stream(arrayOfInts).forEach(System.out::print);

        System.out.println();
        System.out.println();

        //Cloning an array.
        //Cloning primitive types.
        int[] clonedArrayOfInts = arrayOfInts.clone();
        //For primitiive type copying of the value happens.
        Arrays.stream(clonedArrayOfInts).forEach(System.out::print);

        System.out.println();
        System.out.println();

        //Cloning non-primitive types , result in copying the references, the actual object to which the
        //the references point remains the same.
        CustomType[] arrayOfCustomType = {new CustomType(),new CustomType(),new CustomType(),new CustomType(),new CustomType()};
        CustomType clonedArrayOfCustomeTypes[] = arrayOfCustomType.clone();

        //Cloned array also has references pointing to the same object.
        System.out.println("Reference at index 2 of the original array and cloned array points to the same Object : " + (arrayOfCustomType[2] == clonedArrayOfCustomeTypes[2]));

        System.out.println();
        System.out.println();

        //Referencing arrays through Object and Object[].
        //Referencing array through Object.
        //This means that obj is a reference to the array object that could possibly hold any sort of values.
        //Whether primitive or non-primitive.
        Object obj = new int []{1,2,3,4,5};
        Object objArrayOfRefs = new int[]{5,65,6,7,8,9,0};

        Arrays.stream((int[])obj).forEach(System.out::print);

        //On the other hand assigning and array to Object[] means that the assigned array
        //must be of noin-primitvie type that is object types and not primitive type.
        Object[] objectArray = new CustomType[5];

        //This does not work.
        //Object[] arrayOfPrimitves = new int[]{1,2,3,34,45};
        int[] primitiveArray = new int[]{1,2,3,4,5};
        //Object [] objectArrayPointingToPrimitive = primitiveArray;
    }
}