public class TV implements Observer{
    private String Weather;
    @Override
    public void update(String Weather) {
        this.Weather = Weather;
        display();
    }
    void display()
    {
        System.out.println("The weather in the TV " + Weather);
    }
}
