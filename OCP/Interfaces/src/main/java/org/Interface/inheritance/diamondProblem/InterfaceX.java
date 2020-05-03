package org.Interface.inheritance.diamondProblem;

public interface InterfaceX {
    Integer intValue = 100;
    default void hello(){
        System.out.println("Method from Interface X");
    }
}