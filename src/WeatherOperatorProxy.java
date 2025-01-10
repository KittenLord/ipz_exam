package exam;

/**
 *  A weather proxy that represents a weather station operator
 */
public class WeatherOperatorProxy extends WeatherProxy {

    /**
     *  A method to update the current weather station data
     *  @param temperature The new temperature
     *  @param humidity The new humidity
     *  @param windSpeed The new wind speed
     */
    public void update(double temperature, double humidity, double windSpeed) {
        station.updateData(temperature, humidity, windSpeed);
    }

}
