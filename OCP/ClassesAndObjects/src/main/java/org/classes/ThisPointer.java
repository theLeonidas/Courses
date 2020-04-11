package org.classes;

public class ThisPointer implements Feature{
    short shortMember = 34;
    double doubleMember = 4444.2342;
    String stringMember = "Java is Fun !!!";

    @Override
    public void displayFeature() {
        System.out.println("Calling add instance method.");

        //calling the member method.
        add((short) 54,56.231);
    }

    public void add(short shortMember, double doubleMember){

        //This is ambiguous as we want to update the instance member values
        //Instead it updates the value of method parameters.
        //This happens as the name of method parameters is same as that of
        //instance member.
        shortMember += shortMember;
        doubleMember += doubleMember;

        System.out.println("Without this pointer , addition happens on the local variables");
        System.out.println("Value of local short member " + shortMember);
        System.out.println("Value of local double member " + doubleMember);
        System.out.println();

        System.out.println("Using this pointer to display");
        System.out.println("short member variables value for the current object of the class " + this.shortMember);
        System.out.println("double member variables value for the current object of the class " + this.doubleMember);
        System.out.println("String member variables value for the current object of the class " + this.stringMember);
        System.out.println();

        //In order to do what was intended
        //WE need to ake use of this operator.
        this.shortMember += shortMember;
        this.doubleMember += doubleMember;

        System.out.println("With this pointer , addition happens on the instance member variables of the class");
        System.out.println("Value of local short member " + shortMember);
        System.out.println("Value of local double member " + doubleMember);
        System.out.println();

        System.out.println("short member variables value for the current object of the class " + this.shortMember);
        System.out.println("double member variables value for the current object of the class " + this.doubleMember);
        System.out.println("String member variables value for the current object of the class " + this.stringMember);
    }
}