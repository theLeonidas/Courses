package org.inherit;

//All classes in Java inherit from java.lang.Object class.
public class ObjectInitialization implements Feature{

    @Override
    public void display() throws Exception {
    }

    void showDefaultConstructors(){
        //This calls the default no-argument constructor
        //This shows that if super() is not mentioned on the
        //first line, the default super() call is made
        //which in turn calls the default no-arg constructor in the parent class.
        ChildX childX = new ChildX();
    }

    void showThisAndSuper(){
        //Calling the parameterized constructor.
        ChildX childX = new ChildX(57);
    }

    public static void main(String[] args) {
        ObjectInitialization objInit = new ObjectInitialization();
        objInit.showThisAndSuper();
    }
}