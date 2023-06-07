package inheritince;

import java.time.LocalDate;

public class Senior extends Team {
	
	private double bonus;
	
	public Senior(String name, double salary, double workingHours, String dayOff, LocalDate startingDate, double bonus) {
		super(name, salary, workingHours, dayOff, startingDate);
		
	}
	
	
	
	@Override
	public double getSalary() {
		 return super.getSalary() + bonus;
	}
	
	
	

}


