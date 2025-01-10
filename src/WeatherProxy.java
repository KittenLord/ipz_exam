package exam;

/**
 *  An abstract class that describes a weather proxy
 */
public abstract class WeatherProxy {

    /**
     *  The internal reference to the weather station
     */
    protected WeatherStation station;

    /**
     *  A method to set the weather station
     */
    public void setStation(WeatherStation station) {
        this.station = station;
    }

}
