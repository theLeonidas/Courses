package org.Interface;

//A class inheriting an interface.
public class DigitalTemperatureConverter implements TemperatureConverter {
    String convertedTemperature;

    //It is mandatory to give definition to abstract method.
    @Override
    public Float convertToFahrenheit(Float temperatureInCelcius) {
        return temperatureInCelcius*(9/5) + 32;
    }

    @Override
    public Float convertToCelcius(Float temperatureInFahrenhiet) {
        return (temperatureInFahrenhiet-32)*(5/9);
    }

    static void aStaticMethod(){
        //This gives a compiler error as static methods declared in an interface cannot be shared with subclasses.
        //System.out.println(iAmAStaticMethod());
    }
}