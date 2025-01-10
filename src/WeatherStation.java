package exam;

import java.util.List;
import java.util.ArrayList;

public class WeatherStation {

    private static WeatherStation singleton;
    public static WeatherStation get() {
        if(singleton == null) { initialize(); }
        return singleton;
    }

    private WeatherStation() {
        this.observers = new ArrayList<>();
        this.data = new ArrayList<>();
        data.add(new WeatherData(15, 15, 15));
    }

    private static void initialize() {
        singleton = new WeatherStation();
    }



    private List<WeatherData> data;
    private List<WeatherObserver> observers;

    public void subscribe(WeatherObserver observer) {
        observers.add(observer);
    }

    private WeatherData getCurrentData() {
        WeatherData currentData = data.get(data.size() - 1);
        return currentData;
    }

    public double getTemperature() {
        return getCurrentData().temperature;
    }

    public double getHumidity() {
        return getCurrentData().humidity;
    }

    public double getWindSpeed() {
        return getCurrentData().windSpeed;
    }

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
