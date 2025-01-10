package exam;

/**
 *  A class that describes the weather data
 */
public class WeatherData {

    /**
     *  The temperature
     */
    public double temperature;

    /**
     *  The humidity
     */
    public double humidity;

    /**
     *  The wind speed
     */
    public double windSpeed;

    /**
     *  The constructor for the weather data
     *  @param temperature The temperature
     *  @param humidity The humidity
     *  @param windSpeed The wind speed
     */
    public WeatherData(double temperature, double humidity, double windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    /**
     *  A method to display the weather data
     */
    public void display() {
        System.out.println("Temperature: " + temperature + ", Humidity: " + humidity + ", Wind speed: " + windSpeed);
    }

}
