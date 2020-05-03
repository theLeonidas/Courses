package org.inherit.finals.method;

public class B extends A{
//    public void noBodyCanChangeMe(){
//        System.out.println("I could not change this.");
//    }

    //Here there is a problem in compiler message.
    //It should be saying hiding instead of overriding.
//    public static void staticMethod(){
//        System.out.println("static form B.");
//        staticMethodA();
//    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}