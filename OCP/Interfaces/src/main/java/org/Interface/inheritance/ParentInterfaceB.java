package org.Interface.inheritance;

public interface ParentInterfaceB {
    Float intConstant = 200f;

    default void defaultMethod(){
        Integer intValue = new Integer(11);
        Object objValue = intValue;
        System.out.println("Default method form Interface B.");
    }
}