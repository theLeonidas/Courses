package org.classes;

public class StaticMembers implements Feature{

    //Static members of the class.
    static int staticIntMember;
    static char staticCharMember;
    static float staticFloatMember;

    //Static reference variable.
    static Person person;

    //Static member methods of class.
    public static void staticMemberMethod(){
        //Accessing assigning values to the static members.
        StaticMembers.staticIntMember = 100;
        StaticMembers.staticCharMember = 'A';
        StaticMembers.staticFloatMember = 10.222f;

        System.out.println("Value of static int variable = " + StaticMembers.staticIntMember);
        System.out.println("Value of static char variable = " + StaticMembers.staticCharMember);
        System.out.println("Value of static float variable = " + StaticMembers.staticFloatMember);

        int staticIntMember = 1;
        staticIntMember = staticIntMember;
        System.out.println(staticIntMember);
        System.out.println(StaticMembers.staticIntMember);
    }

    @Override
    public void displayFeature() {
        //Calling the static member method of the class.
        StaticMembers.staticMemberMethod();
    }
}