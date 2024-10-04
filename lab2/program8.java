package lab2;

class TemperatureConverter{
    static void FahrenheitToCelcius(float temp){
        float result = (temp-32)*(5.0f/9.0f);
        System.out.println("The temperature in Celcius is: "+result);
    }
    static void CelciusToFahrenheit(float temp){
        float result = (9.0f/5.0f)*temp + 32;
        System.out.println("The temperature in Fahrenheit is: "+result);
    }
}

public class program8 {
    public static void main(String[] args) {
        TemperatureConverter.FahrenheitToCelcius(212.0f); // Equals 100 degree celcius
        TemperatureConverter.CelciusToFahrenheit(100.0f); // Equals 212 fahrenheit
    }
}
