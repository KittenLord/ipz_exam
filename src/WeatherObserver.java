package exam;

public abstract class WeatherObserver {

    public void subscribe(WeatherStation station) {
        station.subscribe(this);
    }

    public abstract void update(double temperature, double humidity, double windSpeed);

}
