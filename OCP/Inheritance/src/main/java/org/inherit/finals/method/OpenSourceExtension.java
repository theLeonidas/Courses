package org.inherit.finals.method;

public class OpenSourceExtension extends OpenSourceCode{

    //Overriding possible.
    @Override
    public void storeCodeInRepo() {
        System.out.println("My parent stored code in any repository.");
        System.out.println("I store it specifically in GIT.");
        System.out.println("Code is still open and free, downloadable from GIT !!!");
    }
}