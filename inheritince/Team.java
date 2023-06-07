package inheritince;

import java.time.LocalDate;

public abstract class Team {
	private String name;
	private double salary;
	private double workingHours;
	private String dayOff;
	private LocalDate startingDate;
	
	public Team(String name, double salary, double workingHours, String dayOff, LocalDate startingDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.workingHours = workingHours;
		this.dayOff = dayOff;
		this.startingDate = startingDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	

}
