package Date;

import java.time.*;
import java.time.format.DateTimeFormatter;
  
public class Date1 {
    public static void main(String[] args)
    {

   
        LocalDate dt = LocalDate.now();
        System.out.println(dt);
  
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        System.out.println(formatter.format(dt));
    }
}