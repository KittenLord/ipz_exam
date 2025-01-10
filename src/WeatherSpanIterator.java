package exam;

import java.util.List;

/**
 *  An iterator that iterates on the weather data in the selected span
 */
public class WeatherSpanIterator implements WeatherIterator {

    /**
     *  The data the iterator operates on
     */
    private List<WeatherData> data;

    /**
     *  The beginning of the span
     */
    private int begin;
    
    /**
     *  The ending of the span (exclusive)
     */ 
    private int end;

    /**
     *  Internal index
     */
    private int i;

    /**
     *  A method to get the next weather data
     *  @return The next weather data
     */
    public WeatherData getNext() {
        int index = i + begin;
        i++;

        return data.get(index);
    }

    /**
     *  A method that checks whether there is a next weather data
     *  @return true if there is
     */
    public boolean hasNext() {
        return (i + begin < end);
    }

    /**
     *  A constructor for the weather span iterator
     *  @param data The data to operate on
     *  @param begin The beginning index
     *  @param end The ending index
     */
    public WeatherSpanIterator(List<WeatherData> data, int begin, int end) {
        this.data = data;
        this.begin = begin;
        this.end = end;
        this.i = 0;
    }

}
