package org.Interface.inheritance;

public interface ParentInterfaceB {
    Float intConstant = 200f;

    default void defaultMethod(){
        System.out.println("Default method form Interface B.");
    }
}