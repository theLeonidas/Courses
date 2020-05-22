//This is a package statement.
package org.java.imports;

//To import all classes from a package use wildcard '*'
//import org.java.other.*;

//To import a specific class use the fully qualified name.
import org.java.other.UseMe;
//import org.java.other.UseMe1;

//This shows classes in default package cannot be imported.
//Either by naming the class explicitly
//or using a wildcard card character.
//import NonImportableClass;
//import *;

//Example for using same named class from different package.
import org.java.imports.SameNamedClass;

//This imports same named class from different package.
//Compiler flags this as an error.
//because in actual usage we shall only use the
//name of the class and compiler wuould not be abel to resolve
//the exact package from which usage was intended.
//import org.java.other.SameNamedClass;

//java.lanf package is automatically available to all java programs without being
//explicitly imported.

public class PackageAndImports {
    //Test wildcard '*' import.
    //public static void main(String[] args) {
        //No need to import individual class,
        //wildcard '*' imports all the classes
        //and we can use them directly.
        //without having to write the
        //Fully Qualified Class Name.
//        UseMe u = new UseMe();
//        UseMe1 u1 = new UseMe1();
//        UseMe2 u2 = new UseMe2();
//        UseMe3 u3 = new UseMe3();
//    }

    //Test individual import.
    public static void main(String[] args) {
        //This does not show a compilation error
        //because this class has already been imported.
        //UseMe u = new UseMe();

        //This usage will show compilation issue
        //because it has not been imported.
        //If import this specific class the error goes off.
        //UseMe1 u1 = new UseMe1();

        //Non importable default class.
        //NonImportableClass c1 = new NonImportableClass();


        //FQCN for one of the same named classes.
        //org.java.other.SameNamedClass c2 = new org.java.other.SameNamedClass();

        //Since other class has been already imported hence
        //we can directly use the class name.
        //SameNamedClass c3 = new SameNamedClass();

        //Usage from java.lang package without importing any of the classes
        //System.out.println(Math.random());
    }
}