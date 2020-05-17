package org.dataTypes;

import org.dataTypes.reference.Customer;

//This showcases default values which are
//present as member variables of a class.
//These member variables are assigned a default values
//if none are assigned to them.
//Hence if we try to make use of them compiler does
//raise an error as they already have been initialized by
//the default values of their types.
public class DefaultValues {

    //Primitive members
    byte memberByte;
    short memberShort;
    char memberChar;
    int memberInt;
    long memberLong;
    float memberFloat;
    double memberDouble;

    //Complex Member
    Customer customer;

    public void complexDefaults(){
        System.out.println("Default Value for member byte = " + memberByte);
        System.out.println("Default Value for member short = " + memberShort);
        System.out.println("Default Value for member char = " + memberChar);
        System.out.println("Default Value for member int = " + memberInt);
        System.out.println("Default Value for member long = " + memberLong);
        System.out.println("Default Value for member float = " + memberFloat);
        System.out.println("Default Value for member double = " + memberDouble);

        //Printing default value for complex member type.
        System.out.println("Default Value for member complex = " + customer);
    }

    //This shows value of uninitialized local variables.
    //Local = method local
    public void localDefaults() {

        //Until we use these uninitialized variables
        //the compiler does not give any errors.
        //But once we start using them without initializing
        //compiler starts complaining.
        //These are the local variables of a method.
        byte localByte;
        short localShort;
        char localChar;
        int localInt;
        long localLong;
        float localFloat;
        double localDouble;

        //Compiler raises error saying
        //the used variables might have been initialized.

//      localByte = localByte + 1;
//      localShort = localShort + 1;
//      localChar = localChar + 1;
//      localInt = localInt + 1;
//      localLong = localLong + 1;
//      localFloat = localFloat + 1;
//      localDouble = localDouble + 1;


        //Similarly for user defined data types.
        //Compiler complains that variable might not have been initialized.
//        Customer anotherCustomer;
//        anotherCustomer.getCustomerId();
    }
}