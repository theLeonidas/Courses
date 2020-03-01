package org.java.imports.staticimports;

//This is a static import.
import static org.java.imports.staticimports.ClassWithStatics.*;

public class TheStaticImportWay {
    public static void main(String[] args) {
        System.out.println("This is fun!!!");
        System.out.println("No need to use fully qualified name of the static member of class.");

        //Here we directly invoke the static members without their class name.
        System.out.println(staticFieldMessage);
        System.out.println(callStaticMethod());
    }
}