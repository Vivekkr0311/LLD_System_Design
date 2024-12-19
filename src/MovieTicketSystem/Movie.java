package MovieTicketSystem;

import java.util.List;

public class Movie {
   private String name;
   private List<String> showTimes;

   public Movie(String name, List<String> showTimes){
       this.name = name;
       this.showTimes = showTimes;
   }

   public String getName(){
       return this.name;
   }

   public List<String> getShowTime(){
       return this.showTimes;
   }
}
