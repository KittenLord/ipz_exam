package exam;

import java.util.List;
import java.util.ArrayList;

/**
 *  A class that represents a weather station
 */
public class WeatherStation {

    /**
     *  The single instance of the weather station
     */
    private static WeatherStation singleton;

    /**
     *  A method to get the single instance of the weather station
     *  @return The weather station
     */
    public static WeatherStation get() {
        if(singleton == null) { initialize(); }
        return singleton;
    }

    /**
     *  The private constructor for the weather station
     */
    private WeatherStation() {
        this.observers = new ArrayList<>();
        this.data = new ArrayList<>();
        data.add(new WeatherData(15, 15, 15));
    }

    /**
     *  A method to initialize the singleton weather station
     */
    private static void initialize() {
        singleton = new WeatherStation();
    }



    /**
     *  The data that the weather station has
     */
    private List<WeatherData> data;

    /**
     *  The list of observers that subcribed to this weather station
     */
    private List<WeatherObserver> observers;

    /**
     *  A method to add a subcriber to the observer list
     *  @param observer An observer to add
     */
    public void subscribe(WeatherObserver observer) {
        observers.add(observer);
    }

    /**
     *  A method to get the current data
     *  @return The current weather data
     */
    private WeatherData getCurrentData() {
        WeatherData currentData = data.get(data.size() - 1);
        return currentData;
    }

    /**
     *  A method to get the current temperature 
     *  @return Current temperature
     */
    public double getTemperature() {
        return getCurrentData().temperature;
    }

    /**
     *  A method to get the current humidity
     *  @return Current humidity
     */
    public double getHumidity() {
        return getCurrentData().humidity;
    }

    /**
     *  A method to get the current wind speed
     *  @return Current wind speed
     */
    public double getWindSpeed() {
        return getCurrentData().windSpeed;
    }

    /**
     *  A method to update the current data
     *  @param temperature The new temperature
     *  @param humidity The new humidity
     *  @param windSpeed The new wind speed
     */
    public void updateData(double temperature, double humidity, double windSpeed) {
        data.add(new WeatherData(temperature, humidity, windSpeed));

        for(WeatherObserver observer : observers) {
            observer.update(temperature, humidity, windSpeed);
        }
    }

    public List<WeatherData> getData() {
        return data;
    }

}
