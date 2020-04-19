package org.wrapper;

import org.dataTypes.primitive.Display;

import javax.jnlp.IntegrationService;

public class WrapperClasses implements Display{

    @Override
    public void print() {

        //Wrapper for 'int' primitive.

        //Ways of getting an Integer wrapper from primitive int.
        // Creation through constructor.
        Integer integerWrapper = new Integer(20);

        //Other ways.
        Integer intWrapper = 30;
        Integer anotherIntWrapper = Integer.valueOf(45);

        //Getting back primitive from wrapper class.
        int primitiveInt = integerWrapper;
        int anotherPrimitiveInt = integerWrapper.intValue();

        //Converting String to primitive.
        int yetAnotherInt = Integer.parseInt("50");
        int yetYetAnotherInt = Integer.valueOf("80");

        //Autoboxing.
        Integer autoboxToWrapper = 70;
        int autoboxToPrimitive = Integer.valueOf(100);
    }
}