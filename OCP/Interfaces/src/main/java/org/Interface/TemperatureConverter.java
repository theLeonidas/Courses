package org.Interface;

public interface TemperatureConverter {
    //Interface fields are by default public static final.
    //Since they are final, hence cant be modified further
    //Hence they must be initialized with a value at the point where they are declared.
    Integer intValue = 200;

    //All interface methods are public by default.
    //Else where if we do not specify any access specifier, it means that member has default accessibility.
    //No need to write public, here they are treated as public by default.
    Float convertToFahrenheit(Float temperatureInCelcius);
    Float convertToCelcius(Float temperatureInFahrenhiet);

    //Protected methods are not allowed.
    //protected void showTemperature();

    //This is a default method.
    //This has been introduced with Java 8.
    //In case if we have a large inheritance hierarchy and have large number of classes down the hierarchy
    //Then if we need to introduce a method with default implmentation that is available in all
    //the classes down the hierarchy, we do it by inserting a default method in the top level interface.
    default void showTemperature(Float temperature, boolean isCelcius){
        String temperatureRepresentation = temperature + " `";
        System.out.println(temperatureRepresentation + formTemperatureString(temperature,isCelcius));
    }

    //Starting Java 9, private methods also can be declared inn an interface.
    //This was introduced so as to collate common piece of code used in multiple default methods
    //in a private methods.
    private String formTemperatureString(Float temperature, boolean isCelcius){
        String formattedTemperature = "";
        if(isCelcius)
            formattedTemperature+="C";
        else formattedTemperature+="F";
        return formattedTemperature;
    }

    //Java 9 also came up with static methods in an interface.
    static void iAmAStaticMethod(){
        System.out.println("I am a static method.");
    }
}