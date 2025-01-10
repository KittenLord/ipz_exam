package exam;

public class WeatherNewsObserver extends WeatherObserver {

    public void update(double temperature, double humidity, double windSpeed) {
        System.out.println("NEWS: current temperature is " + temperature + ", and we don't care about the rest");
    }

}
