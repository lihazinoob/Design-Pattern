import java.util.ArrayList;
import java.util.List;

public class TVSeries {
   private String Seriesname;
   private List<Episode> episodelist;

   public TVSeries(String name)
   {
      Seriesname=name;
      episodelist = new ArrayList<>();
   }
   public void addtoList(Episode e)
   {
      episodelist.add(e);
   }

   public void showList()
   {
      for(Episode episode : episodelist)
      {
         System.out.println("The Episode Number is " + episode.shownumber());
         System.out.println("The Episode Name is " + episode.showname());
      }
   }

}
