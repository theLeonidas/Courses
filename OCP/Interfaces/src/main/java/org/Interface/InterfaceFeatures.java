package org.Interface;

public class InterfaceFeatures implements Feature{

    @Override
    public void display() {
        //Interface fields are public static final.
        //Hence are accessible anywhere using the  "className." method.
        //Since being a final variable, its value cant be changed.
        System.out.println("Interface constant value : " + TemperatureConverter.intValue);

        //Trying to change value , results ina compile error.
        //TemperatureConverter.intValue = 300;

        //An interface cannot be instantiated.Hence we cannot make objects of an interface.
        //TemperatureConverter converter = new TemperatureConverter();

        //Anonymous Class.
        //Java provides a way of quick and at-the-site object creation faculty
        //through the use of anonymous classes.
        //In this the implementation of the abstract method must be given at the point of object creation.
        TemperatureConverter converter = new TemperatureConverter() {
            @Override
            public Float convertToFahrenheit(Float temperatureInCelcius) {
                return null;
            }

            @Override
            public Float convertToCelcius(Float temperatureInFahrenhiet) {
                return null;
            }
        };

        //Interface static mehthods are accessible on the interface.
        TemperatureConverter.iAmAStaticMethod();

        //While they are not available to subclasses.
        //DigitalTemperatureConverter.iAmAStaticMethod();

        
    }
}