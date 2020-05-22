package org.java.commandline;

//Inputs
// a b c
// a    b c
// "a " b c
//no arguments.
public class CommandLineArguments{
    public static void main(String args[]){
        for(int i=0;i<args.length;i++){
           System.out.print(args[i] + ",");
        }
    }
}