public class Main {
    public static void main(String[] args)
    {
        WeatherStation w = new WeatherStation();
        Observer o = new Mobile();
        Observer p = new TV();
        w.add(o);
        w.add(p);
        w.notified();
        w.setweather("Summer");
        w.notified();
        w.setweather("Autumn");
        w.notified();

    }
}
