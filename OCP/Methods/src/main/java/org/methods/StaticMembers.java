package org.methods;

public class StaticMembers extends ParentStaticMember implements Feature {

    //This is a static block.This is block of code is executed when the JVM loads the class into memory.
    static {
        System.out.println("I am being printed from the child static block.");
        System.out.println("I am one of the first block of code executed in a class.");
    }

    public static int staticIntValue = 100;
    public int nonStaticIntValue = 210;

    public static class iAmAStaticInnerClass{
        public int intInsideAnInnerClass = 2323;
    };

    static interface iAmStaticInterface{
        public float intInsideAnInnerClass = 2323.233f;
        public void staticInnerInterfaceMethod();
    };

    static enum iAmAStaticInnerEnum{
        RED,
        BLUE,
        GREEN;
    }

    public static void iAmAStaticMethod(){
        System.out.println();
        System.out.println("I am a static method of the class. I was called.");
    }

    public void iAmANonStaticMethod(){
        System.out.println("I am a non static method.");
    }

    public static void iAmAnotherStaticMethod(){

        //Non-static members and the current object reference 'this' is not available inside of the static context.

        //This gives a compile time error as we trying to access a non-static member
        //which belongs to an object inside of a static method.
        //System.out.println(nonStaticIntValue);

        //Current object reference 'this' not allowed in a static context.
        //System.out.println(this.iAmANonStaticMethod());
    }

    public void waysOfAccessingStaticMembers(){
        StaticMembers memberA = new StaticMembers();
        StaticMembers memberB = new StaticMembers();

        System.out.println("Accessing static member of the class through objects");

        System.out.println();

        System.out.println("Value of static field from memberA object : " + memberA.staticIntValue);
        System.out.println("Value of static field from memberB object: " + memberB.staticIntValue);

        memberA.iAmAStaticMethod();
        memberB.iAmAStaticMethod();

        System.out.println();

        System.out.println("Accessing static member of the class through Class Name.");
        System.out.println();

        //Changing the value of the static member.
        StaticMembers.staticIntValue = 250;
        System.out.println("Value of static field : " + StaticMembers.staticIntValue);

        System.out.println("Calling the static method.");
        StaticMembers.iAmAStaticMethod();

        //Within the class of static member , they can be accessed without using the class name.
        System.out.println("Accessing the static integer value of the class directly through name : " + staticIntValue);
        iAmAStaticMethod();

        //Static class/interface/enum
        StaticMembers.iAmAStaticInnerClass staticInnerClass = new iAmAStaticInnerClass();

        //Printing integer instance member of the static inner class.
        System.out.println(staticInnerClass.intInsideAnInnerClass);

        //Ways of accessing static inner class/interface/enum
        StaticMembers.iAmStaticInterface staticInterface = new StaticMembers.iAmStaticInterface(){

            @Override
            public void staticInnerInterfaceMethod() {
                System.out.println("This is static inner interface reporting sir!!");
                System.out.println("This is static inner interface reporting sir!!");
            }
        };

        //Accessing members of the static inner interface.
        staticInterface.staticInnerInterfaceMethod();

        StaticMembers.iAmAStaticInnerEnum staticInnerEnum = iAmAStaticInnerEnum.RED;
    }

    public void staticIsThePropertyOfTheClass(){
        StaticMembers memberA = new StaticMembers();
        StaticMembers memberB = new StaticMembers();

        //First changing the non-static value for memberA.
        memberA.nonStaticIntValue = 333;

        //Since each object of StaticMember class has its own copy of
        //the non-static member of the class, hence above when we change
        //memberA's non-static member, memberB's copy of nonStaticIntValue
        //remains unchanged.
        System.out.println(memberB.nonStaticIntValue);

        //On the other hand,
        //There is only a single copy of static variables that is accessed
        //everywhere.A change in one place is reflected elsewhere as well.
        StaticMembers.staticIntValue = 501;

        System.out.println("Printing value of static member after changing it.");

        //All three show the changed value.
        System.out.println(memberA.staticIntValue);
        System.out.println(memberB.staticIntValue);
        System.out.println(StaticMembers.staticIntValue);
    }

    public void outOfOrdinaryUsageOfStatics(){
        //We point the reference of the class to null.
        StaticMembers staticMembersA = null;

        //Accessing the static members with a reference that points to null happens
        //without a NullPointerException.
        System.out.println("Value of static integer value of the class : " + staticMembersA.staticIntValue);

        //Calling the static method of the class with nul reference.
        staticMembersA.iAmAStaticMethod();
    }

    @Override
    public void display() {
//        waysOfAccessingStaticMembers();
//        staticIsThePropertyOfTheClass();
    }
}