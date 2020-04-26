package org.exception;

import java.util.Arrays;

public class Errors implements Feature{

    @Override
    public void display() throws Exception {
        //This raises a StackOverFlowError.
        //showStackOverFlowError();

        //Not guaranteed.
        showOutOfMemoryError();
    }

    //This raises a StackOverFlowError.
    //Each method calls pushes a new frame on to the call stack of the current thread.
    //Since this process goes on infinitely hence the memory on Stack finishes
    //and an a StackOverFlowError is raised.
    //Since this is a memory related error and memory in Java is entirely managed by JVM
    //hence there is not much the application can do apart from aborting.
    private void showStackOverFlowError(){
        //This is an infinite loop, It will keep running endlessly.
        showStackOverFlowError();
    }

    private void showOutOfMemoryError(){
        for (int i=0;i<Integer.MAX_VALUE;i++){
            StringBuilder builder = new StringBuilder("Java");
        }
    }
}