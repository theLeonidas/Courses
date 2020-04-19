package org.classes;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MembersOfAClass {

    //These members are called as instance members.
    //Primitive Members
    byte byteMember;
    short shortMember;
    char charMember;
    int intMember;
    long longMember;
    float floatMember;
    double doubleMember;

    //Reference type Members
    String stringMember;
    List list;
    Collection collection;

    //Constructors.
    public MembersOfAClass(){
        //initialize all member variables here.
    }

    //Instance member initializer
    {
        //Initialize members here.
    }

    //Instance methods of a class
    //This method does not return anything
    public void memberMethodOfClass(){
        System.out.println("I am a member method of this class.");
        anotherMemberMethodOfTheClass("Calling another method of the class.");
    }

    //This member method returns an int value.
    public int anotherMemberMethodOfTheClass(String inputString){
        System.out.println("I am another member method of this class.");
        stackMemoryAllocation();
        printCurrentStack();
        return 1;
    }

    //This member methods depicts the allocation of variable
    //on stack.
    private void stackMemoryAllocation() {
        //All these are allocated memory on stack
        //as they are the local variables of the method.
        int intOnStack;
        char charOnStack;
        String str;
        MembersOfAClass refOnStackOne;
        InstantiatingAClass refOnStackTwo;
    }

    private void printCurrentStack(){
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println();
        System.out.println("--------------Current situation of stack---------------");
        System.out.println();

        Arrays.stream(stackTrace)
                .forEach((stackTraceElement)-> System.out.println("  " + stackTraceElement));
        System.out.println();
        System.out.println("--------------End---------------");
        System.out.println();
    }

    //Static members.

    //static member variables
    static int staticMember;
    static String staticStringMember;

    //static member methods
    public static void staticMethodOfTheClass(){
        System.out.println("I am a static member of the class.");
    }

    //static member methods which return a String
    public static String yetAnotherStaticMethodOfTheClass(float inputMember){
        System.out.println("I am yet another static member of the class.");
        return "I am yet another static member of the class.";
    }
}