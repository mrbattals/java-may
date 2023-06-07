package inheritince;

import java.time.LocalDate;

public class Main {

public static void main(String[] args) {
	
	Senior ismail = new Senior("Ismail", 2600.59, 30, "Tuesday", LocalDate.of(2020, 5, 22), 1291.2);
	Junior alex = new Junior("Alex",2000.98, 40, "Wednesday",LocalDate.of(2022, 2, 11), ismail.getName());
	
	System.out.println(String.format("%s's pay is %f per month", ismail.getName(),ismail.getSalary()));
	System.out.println(String.format("%s's pay is %f per month", alex.getName(),alex.getSalary()));
	
			
}
}