package exam;

public class WeatherOperatorProxy extends WeatherProxy {

    public void update(double temperature, double humidity, double windSpeed) {
        station.updateData(temperature, humidity, windSpeed);
    }

}
