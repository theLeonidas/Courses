package org.Interface.inheritance.diamondProblem;

//Since the inheriting class receives the hello() method from both interface X & Y
//Hence their arises ambiguity for the compiler as to which hello() to use.
//Hence it raises a compile time exception.
//This is referred to as diamond problem.
public class MultipleInterfaceInheritingClass implements InterfaceX,InterfaceY{

    //The compile time error is resolved only if we implement hello() method
    //in the interface implementing class.
    @Override
    public void hello() {
        System.out.println("I override the hello method inherited from both interfaces X & Y");
    }
}