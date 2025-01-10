package exam;

/**
 *  An abstract class that describes a weather station observer
 */
public abstract class WeatherObserver {

    /**
     *  A method to subcribe to the station
     */
    public void subscribe(WeatherStation station) {
        station.subscribe(this);
    }

    /**
     *  A method that is triggered when the weather station gets new data
     */
    public abstract void update(double temperature, double humidity, double windSpeed);

}
