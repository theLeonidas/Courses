package org.run;

import org.dataTypes.reference.Customer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeclareAndInitializeVariables {
    public static void main(String[] args) {

        //Only declarations

        //Primitives.

        //Variable declaration for byte types.
        byte b1,b2,b3,b4;

        //Variable declaration for short types.
        short s1,s2,s3,s4;

        //Variable declaration for character types.
        char a1,a2,a3;

        //Variable declaration for integer types.
        int x,y,z,number;

        //Variable declaration for long types.
        long x1,y1,z1,number1;

        //Variable declaration for float types.
        float f1,f2,f3;

        //Variable declaration for double types.
        double d1,d2,d3;

        //Reference types
        String str;
        Object obj;
        Customer customer;

        //Definition along with declaration.

        //Primitives

        //Variable declaration & definition at the same time for byte types.
        byte by1=1 , by2=2 , by3=3 , by4=4;

        //Variable declaration & definition at the same time for short types.
        short sh1=1 , sh2=2 , sh3=3 , sh4=4;

        //Variable declaration & definition at the same time for character types.
        char c1='a' , c2='b' , c3='z';

        //Variable declaration & definition at the same time for integer types.
        int i1=1, i2=2 , i3=3 , num=4;

        //Variable declaration & definition at the same time for long types.
        long l1=1, l2=2 , l3=3l , numL=4l;

        //Variable declaration & definition at the same time for float types.
        float fl1=2.5f , fl2=3.6f , fl3=4.9f , fl4=8.8f;

        //Variable declaration & definition at the same time for float types.
        double db1=2.5 , db2=3.6 , db3=4.9d , db4=8.8d;

        //Reference types
        String strVar = "Java 11";
        Object objVar = new Object();
        Customer anotherCustomer = new Customer();

        //Mixing declaration & initialization.

        //For byte type.
        byte byt1=3 , byt2=4 , byt3 , byt4;

        byt3 = byt1;
        byt4=byt2;

        //Variable declaration & definition at the same time for short types.
        short sht1=6 , sht2=55 , sht3 , sht4;

        sht3=sht1;
        sht4=sht2;

        //Variable declaration & definition at the same time for character types.
        char ch1='z' , ch2='A' , ch3 , ch4;

        ch3=ch1;
        ch4=ch2;

        //Variable declaration & definition at the same time for integer types.
        int it1=3234, it2=92911, it3 , it4;

        it3=it1;
        it4=it2;

        //Variable declaration & definition at the same time for long types.
        long lg1=993939l, lg2=826352l , lg3 , lg4;

        lg3=lg1;
        lg4=lg2;

        //Variable declaration & definition at the same time for float types.
        float flt1=444.333f , flt2=31331.32332f , flt3 , flt4;

        flt3=flt1;
        flt4=flt2;

        //Variable declaration & definition at the same time for float types.
        double dbl1=848484.4444d , dbl2=392839222.3333d , dbl3 , dbl4;

        dbl3=dbl1;
        dbl4=dbl2;

        //Reference types
        String anotherStr;
        Object anotherObj;
        Customer yetAnotherCustomer;

        //Explain what does this mean.
        anotherStr=strVar;
        anotherObj=objVar;
        yetAnotherCustomer=anotherCustomer;

        //Some illegal ways of initializations
        //int intVar=222,int anotherIntVal;
        //float floatVar=1212.33f,char chVar='s';
        //String strVal="ssss",Object objectVal=new Object();
        //int var1=var2=12121;
        //int intValue=null;

        //Compiler raises errors if a variable is declared but not initialized.
        //Below statement raises a compile error as variable longVar is not initialized before being used.
//        long longVar;
//
//        longVar = longVar + 2322;

    }
}