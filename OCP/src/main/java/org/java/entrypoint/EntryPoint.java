package org.java.entrypoint;

public class EntryPoint {
    //This method should have exactly the same signature as given.
    //name of the method must be main
    //It must be declared as public & static
    //and sice it does not return anything hence has a return type of void.
//    public static void main(String[] args) {
//        System.out.println("I guard the enrtry to the world of Java !!!");
//    }

    //Correct way of writing entry point method.
//    public static void main(String... args) {
//        System.out.println("I guard the entry to the world of Java !!!");
//    }

    //Correct way of writing entry point method.
//    public static void main(String args[])throws Exception {
//        System.out.println("I guard the entry to the world of Java !!!");
//    }

    //Correct way of writing entry point method.
    //This is a valid entry point implementation.
    //'native' keyword on a method means that the actual implementation
    //of this method would be provided by a sperate library
    //that shall be linked at runtime.
    //We just need to remember that this is a valid way of writing
    //the entry point method.
    //We cannot give an implementation to the method declared a native.
    //The implementation would be hooked at the runtime.
    //public static native void main(String args[])throws Exception;

    //Incorrect way
    //This is declared an abstract method.
    //Abstract methods would be covered later in the course.
    //Methods are declared abstract when we intent to give the method definition
    //later in some inheriting class.
    //Also a static method cannot be declared abstract.
//    public static abstract void main(String[] args) {
//
//    }

    //Incorrect way
//    static void main(String[] args) {
//
//    }

    //Incorrect way
//    public native void main(String[] args) {
//        System.out.println("I guard the entry to the world of Java !!!");
//    }
}