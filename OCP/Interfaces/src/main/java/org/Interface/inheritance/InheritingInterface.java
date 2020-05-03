package org.Interface.inheritance;

//Same rules apply for diamond problem in case of interface-to-interface inheritance.
public interface InheritingInterface extends ParentInterfaceA,ParentInterfaceB{
    @Override
    default void defaultMethod() {

    }
}