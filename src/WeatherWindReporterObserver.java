package exam;

public class WeatherWindReporterObserver extends WeatherObserver {

    public void update(double temperature, double humidity, double windSpeed) {
        System.out.println("Hello, I am the wind reporter, current wind speed is " + windSpeed);
    }

}
