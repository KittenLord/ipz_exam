package exam;

/**
 *  A class that represents a proxy that can only view the weather station data
 */
public class WeatherViewerProxy extends WeatherProxy {

    /**
     *  A method to get the current temperature
     *  @return Current temperature
     */
    public double getTemperature() {
        return station.getTemperature();
    }

    /**
     *  A method to get the current humidity
     *  @return Current humidity
     */
    public double getHumidity() {
        return station.getHumidity();
    }

    /**
     *  A method to get the current wind speed
     *  @return Current wind speed
     */
    public double getWindSpeed() {
        return station.getWindSpeed();
    }

}
