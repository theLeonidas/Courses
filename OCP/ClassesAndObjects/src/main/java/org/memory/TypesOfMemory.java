package org.memory;

import java.sql.Types;

public class TypesOfMemory {

    //Instance member of the class.
    //str is allocated memory
    String str = "Java Memory.";


    public void printString(){
        //Here i is the local variable declared inside the method.
        //i is allocated memory within this method and then when this
        //method completes , that memory is de-allocated.
        //So this is a case of temporary memory allocation.
        for (int i=1;i<=100;i++){
            System.out.println(this.str);
        }

        //Here referenceVariable is a reference variable and
        //is of type TypesOfMemory, which denotes that it points
        //to objects of type TypesOfMemory.
        TypesOfMemory referenceVariable = new TypesOfMemory();

        //Assigning null to reference variable denotes that
        //currently the reference variable is not pointing to any object.
        referenceVariable = null;
    }

    //Here we see that str is used across different methods.
    //Hence str should have some permanent memory allocation
    //that is available across different method calls.
    public void changeString(){
        str = str.toUpperCase();
    }

    public static void main(String[] args) {
        TypesOfMemory typesOfMemory = new TypesOfMemory();
        typesOfMemory.printString();
    }
}