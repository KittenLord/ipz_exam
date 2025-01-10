package exam;

/**
 *  The Main class that contains the entry point of the program
 */
public class Main {

    /**
     *  The entry point of the program
     *  @param args The arguments to the program
     */
    public static void main(String[] args) {
        WeatherStation station = WeatherStation.get();

        WeatherViewerProxy user1 = new WeatherViewerProxy();
            user1.setStation(station);
        WeatherViewerProxy user2 = new WeatherViewerProxy();
            user2.setStation(station);
        WeatherOperatorProxy operator = new WeatherOperatorProxy();
            operator.setStation(station);

        WeatherNewsObserver newsOutlet1 = new WeatherNewsObserver();
            newsOutlet1.subscribe(station);
        WeatherNewsObserver newsOutlet2 = new WeatherNewsObserver();
            newsOutlet2.subscribe(station);
        WeatherWindReporterObserver windReporter = new WeatherWindReporterObserver();
            windReporter.subscribe(station);

        operator.update(20, 20, 20);

        System.out.println("User1 reports temperature: "+ user1.getTemperature());

        operator.update(30, 30, 30);
        operator.update(25, 69, 420);
        operator.update(100, 100, 100);

        System.out.println("Here's all the data except for the first day: ");
        WeatherSpanIterator iterator = new WeatherSpanIterator(station.getData(), 1, 5);
        while(iterator.hasNext()) {
            iterator.getNext().display();
        }
    }

}
