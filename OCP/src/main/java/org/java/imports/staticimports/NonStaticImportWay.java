package org.java.imports.staticimports;

import javax.jnlp.IntegrationService;
import java.util.*;

public class NonStaticImportWay{
    public static void main(String[] args) {
        System.out.println("This is the boring way of using statics!!!");
        System.out.println("Here we need to use fully qualified name of the static member of class.");

        //Here we re using fully qualified name to access both field & method.
        System.out.println(ClassWithStatics.staticFieldMessage);
        System.out.println(ClassWithStatics.callStaticMethod());

        Set<Integer> set = new HashSet<Integer>();
        Integer i1= 40;
        Integer i2= 50;

        set.add(i1);
        set.add(i1);
        set.add(i2);

        set.remove(i1);
        i2=47;
        set.remove(i2);
        System.out.println(set.size());

        Random rand = new Random();
    }
}