package exam;

import java.util.List;

public class WeatherSpanIterator implements WeatherIterator {

    private List<WeatherData> data;

    private int begin;
    private int end;

    private int i;

    public WeatherData getNext() {
        int index = i + begin;
        i++;

        return data.get(index);
    }

    public boolean hasNext() {
        return (i + begin < end);
    }

    public WeatherSpanIterator(List<WeatherData> data, int begin, int end) {
        this.data = data;
        this.begin = begin;
        this.end = end;
        this.i = 0;
    }

}
