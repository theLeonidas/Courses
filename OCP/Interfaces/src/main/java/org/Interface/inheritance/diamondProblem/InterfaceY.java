package org.Interface.inheritance.diamondProblem;

public interface InterfaceY {
    default void hello(){
        System.out.println("Method from Interface Y");
    }
}