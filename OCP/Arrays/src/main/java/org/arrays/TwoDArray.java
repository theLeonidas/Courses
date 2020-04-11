package org.arrays;

import java.util.Arrays;

public class TwoDArray implements Feature{

    @Override
    public void displayFeatures() {
        arrayDeclaration();
        creationAndInitialization();
        playingWithMultiDimensionalArrays();
    }

    private void arrayDeclaration(){
        //Correct ways of array declaration.
        int [][] arrayOfInts;
        byte anotherArrayOfBytes[][];

        //This array is a double dimensional array declaration.
        int [] arrayOfIntegers[];

        float [][] arrayOfFloats;
        double arrayOfDouble[][];

        //Incorrect ways of declaring
        //int [5][] incorrectIntArray;
        //int [][7] incorrectIntArray;
        //int [5][6] incorrectIntArray;
        //float incorrectFloatArray [24][];
        //float incorrectFloatArray [][56];
        //float incorrectFloatArray [24][23];
        //CustomType [5][] incorrectCustomType;
        //CustomType [][44] incorrectCustomType;
        //CustomType incorrectCustomType[23][8];
    }

    //Using the new operator.
    private void creationAndInitialization() {
        //Creating an array with Initialization.
        int [][] arrayOfInt = new int [3][];
        float arrayOfFloats[][] = new float[56][88];
        char [][] arrayOfChar = new char[88][99];

        //Incorrect Way.Size must be specifed in the creation expression that lies on the right
        //int [][] arrayOfInts = new int[][];

        //Finding length of an array.
        System.out.println("Number of rows in the Integer array : " + arrayOfInt.length);
        //Throws exception as the row column is still not initialized to value.
        //System.out.println("Number of columns in the Integer array : " + arrayOfInt[0].length);

        System.out.println("Number of rows in the Float array : " + arrayOfFloats.length);
        System.out.println("Number of columns in the Float array : " + arrayOfFloats[0].length);

        System.out.println("Number of rows in the Char array : " + arrayOfChar.length);
        System.out.println("Number of columns in the Char array : " + arrayOfChar[0].length);

        /*Initialization.*/

        //Array Initialization.
        for(int i=0;i<arrayOfInt.length;i++){
            System.out.println(arrayOfInt[i]+",");
        }

        Arrays.stream(arrayOfInt).forEach(System.out::println);

        //Anonymous Array creation & initialization.
        int [][] arrayOfIntegers = new int[][]{{1,2,3,45,6},{1,4,2,8}};
        char arrayOfChars[][] = new char[][]{{'a','c','b','g'},{'b','g'}};
        float[] annonymousArrayOfFloats = new float[]{1.22f,22.22f,123.22f,99.22f};

        //Size of Arrays.
        System.out.println("Size of integer array : " + arrayOfInt.length);
    }

    private void playingWithMultiDimensionalArrays() {
        //Understanding how multi dimensional arrays work.
        //One dimensional array is an object which has blocks of specified memory which can hold values or references.
        //Since array is itself an object, hence a reference points to this array object of one dimension.
        //This array of int type can hold 5 values of integer type.
        int [] arrayOfInteger = new int[5];

        //A two dimensional array is an extension of one dimension array.
        int [][] twoDArrayOfIntegers = new int[4][5];
        //A two dimension array reference points to an array object.
        //In the above example int array reference points to a single dimension array of size 4.
        //In this 4 size array each block of memory further points to a single dimension array of sise 5.

        //this prints size of 1 D  array pointed to by first index of the array.
        System.out.println(twoDArrayOfIntegers[0].length);

        //Similarly a 3 D array.
        //Array pointed to by threeDArray has 3 blocks of memory.
        //Each memory location again points to a single dimension array of size 4.
        //This array of size 4 further points to a 1 D array of size 5.
        int [][][] threeDArray = new int[3][4][5];

        //Going by this, the first level of dimension is mandatory for all multi dimensional arrays.
        //Not providing other dimensions other than the first is optionsal and can be assigned at runtime
        //Not providing that is a compile time error.
        //int [][][] threeDArrayNotCompiling = new int[][4][5];

        //This 2 D array does not specify the dimension of the second part of the array.
        //These are referred to as "jagged arrays."
        int [][] twoDArray = new int[3][];

        //Assigning each block of the array twoDArray to another array of 1 D.
        twoDArray[0] = new int[4];
        twoDArray[1] = new int[5];
        twoDArray[2] = new int[6];
    }
}