package exam;

/**
 *  An observer that operates as a news outlet
 */
public class WeatherNewsObserver extends WeatherObserver {

    /**
     *  A method that sends an update message
     *  @param temperature The new temperature
     *  @param humidity The new humidity
     *  @param windSpeed The new wind speed
     */
    public void update(double temperature, double humidity, double windSpeed) {
        System.out.println("NEWS: current temperature is " + temperature + ", and we don't care about the rest");
    }

}
