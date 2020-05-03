package org.inherit.finals.method;

public class A {
    public static int a = 44;
    public final void noBodyCanChangeMe(){
        System.out.println("I shall print what I like. Noboy interferes in my business!!!");
    }

    public final static void staticMethod(){
        System.out.println("static form A.");
    }
}
