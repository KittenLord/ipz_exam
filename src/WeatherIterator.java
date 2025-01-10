package exam;

/**
 *  An interface that describes an iterator of the weather data
 */
public interface WeatherIterator {

    /**
     *  A method to get the next element
     *  @return The next element
     */
    public WeatherData getNext();

    /**
     *  A method to check if there is a next element
     *  @return True if exists
     */
    public boolean hasNext();

}
