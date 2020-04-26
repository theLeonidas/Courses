package org.temperature;

import org.calculations.Calculator;

public class TemperatureConverter{
    Calculator cal = new Calculator();
	public float toFahrenhiet(float celcius){return cal.add(cal.multiply(celcius,(9.0f/5.0f)),32);}
	public float toCelcius(float fahrenheit){return cal.multiply(cal.subtract(fahrenheit,32),(5.0f/9.0f));}
}