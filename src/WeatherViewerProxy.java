package exam;

public class WeatherViewerProxy extends WeatherProxy {

    public double getTemperature() {
        return station.getTemperature();
    }

    public double getHumidity() {
        return station.getHumidity();
    }

    public double getWindSpeed() {
        return station.getWindSpeed();
    }

}
