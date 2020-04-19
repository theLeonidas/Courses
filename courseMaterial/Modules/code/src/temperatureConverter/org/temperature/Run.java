package org.temperature;

public class Run{
    public static void main(String args[]){
        TemperatureConverter converter = new TemperatureConverter();
        int operation = Integer.parseInt(args[0]);
        float result = 0,temperature = Integer.parseInt(args[1]);
        
        System.out.println("Operation : " + operation);
        System.out.println("Temperature : " + temperature);

        switch(operation){
           case 1 :  result = converter.toFahrenhiet(temperature);
                     break;
           case 2 :  result = converter.toCelcius(temperature);
                     break;
           default : System.out.println("Operation not supported");
                     System.exit(-1); 
        }
        System.out.println("Converter Temperature = " + result);
    }
}