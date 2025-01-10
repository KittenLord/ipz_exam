package exam;

/**
 *  A class that describes a wind speed reporter observer
 */
public class WeatherWindReporterObserver extends WeatherObserver {

    /**
     *  A method that sends a message whenever the data has been updated
     *  @param temperature The new temperature
     *  @param humidity The new humidity
     *  @param windSpeed The new wind speed
     */
    public void update(double temperature, double humidity, double windSpeed) {
        System.out.println("Hello, I am the wind reporter, current wind speed is " + windSpeed);
    }

}
