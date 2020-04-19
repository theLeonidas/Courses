package org.methods;

public class MultipleConstructors extends DefaultConstructor{

    //This constructor signature matches that of a default constructor.
    //This a case where an explicit constructor has been defined, hence
    //now the no argument default constructor is not no longer available.
    //Every time an object is created using no argument default constructor
    //This constructor is called.
    //This constructor initializes theh float value to 10.45f,
    //while other members are already initialized to their default values.
    public MultipleConstructors(){
        System.out.println("No argument explicit constructor called.");
        System.out.println("Initializing the (float) value to " + 10.45f);
        floatValue = 10.45f;
    }

    //One argument overloaded constructor.
    public MultipleConstructors(int intValue){
        System.out.println("One argument constructor called.");
        System.out.println("Initializing the integer value to " + intValue );
        this.intValue = intValue;
    }

    //Two argument overloaded constructor.
    public MultipleConstructors(int intValue, String stringValue){
        System.out.println("Two argument constructor called.");
        System.out.println("Initializing the (integer,string) value to (" + intValue + "," + stringValue + ")");
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    //Three argument overloaded constructor.
    public MultipleConstructors(int intValue, String stringValue, boolean booleanValue){
        System.out.println("Three argument constructor called.");
        System.out.println("Initializing the (integer,string,boolean) value to (" + intValue + "," + stringValue + "," + booleanValue + ")");
        this.intValue = intValue;
        this.stringValue = stringValue;
        this.booleanValue = booleanValue;
    }

    //Many more combinations of overloaded constructors can be created
    //depending on the need of the situation.

    //Const
}