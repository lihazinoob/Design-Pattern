import java.util.ArrayList;
import java.util.List;

public class WeatherStation extends Subject{
//    To hold the list of the observer
    private List<Observer> observerlist = new ArrayList<>();
    private String WeatherInfo;

    @Override
    public void add(Observer observer) {
        observerlist.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerlist.remove(observer);
    }

    @Override
    public void notified() {
        for (Observer observer:observerlist)
        {
            observer.update(WeatherInfo);
        }
    }

    public void setweather(String w)
    {
        this.WeatherInfo = w;
    }
}
