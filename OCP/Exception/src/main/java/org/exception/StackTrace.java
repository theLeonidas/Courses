package org.exception;

//This class shows the functioning of JVM's default handler &
//stack trace of a thread.
public class StackTrace {
    public static void print()throws Exception {
        method();
    }

    public static void method()throws Exception {
        anotherMethod();
    }

    public static void anotherMethod()throws Exception {
        yetAnotherMethod();
    }

    //Since no handling done hence further propagated.
    public static void yetAnotherMethod()throws Exception {
        iAmTheLastMethod();
    }

    //throws clause is used to propagate the exception down the stack.
    //It literally means that the current method is incapable of handling the exception
    //hence it is asking the callers of the current methodd to handle it.
    public static void iAmTheLastMethod() throws Exception {
        //First point where the exception is thrown
        //Some unexpected situation like a file which was asked could not be found.
        //An exception gets thrown using throw clause.
        //All Exceptions are objects.
        int dividend= 50;
        int divisor = 0;

        //Below code raises a DivideByZeroException as the value of anything divided by 0 is unknown &
        //java treats is as an exception.
        int result = dividend/divisor;
    }
}