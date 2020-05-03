package org.Interface.inheritance;

public interface ParentInterfaceA {
    Integer intConstant = 100;

    default void defaultMethod(){
        System.out.println("Default method form Interface A.");
    }
}