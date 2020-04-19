package org.methods;

public class MethodParameters implements Feature{
    @Override
    public void display() {
        byte x = 34;
        methodShowingParameters(x);

        //Var args test
        //passing nothing
        //This creates an array of zero size and passes to the method.
        methodShowingVarArgs();

        //This gives an error. As String[] expects an array.
        //methodShowingVarArgsThruArray();

        //Achieving this thru String[]
        methodShowingVarArgsThruArray(new String[0]);

        //passing an array of String.
        //methodShowingVarArgs(new String[]{"1","2","3","4"});

        //passing only a string.
        methodShowingVarArgs("I am learning Java");
    }

    public void methodShowingParameters(int x){
        System.out.println(x);
    }

    public void methodShowingVarArgsThruArray(String[] varArgs){

    }

    //This is similar to writing a String array over here.
    //But in case of string array if we dont want to pass anything
    //then in that case an empty array has to be passed.
    public void methodShowingVarArgs(String...varArgs){

        //Method taking variable arguments is flexible.
        //It can take in 0 or more arguments.
        for (String args : varArgs) {
            System.out.println(args);
        }
    }
}