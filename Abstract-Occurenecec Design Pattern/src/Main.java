public class Main {
    public static void main(String[] args)
    {
        Episode e1 = new Episode(10, "Fellina");
        TVSeries series = new TVSeries("Breaking Bad");
        Episode e2 = new Episode(11,"Last");
        series.addtoList(e1);
        series.addtoList(e2);
        series.showList();

    }
}
