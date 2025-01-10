package exam;

public class WeatherData {

    public double temperature;
    public double humidity;
    public double windSpeed;

    public WeatherData(double temperature, double humidity, double windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public void display() {
        System.out.println("Temperature: " + temperature + ", Humidity: " + humidity + ", Wind speed: " + windSpeed);
    }

}
