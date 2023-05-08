package student;

public class Student {
	
	// aggregation
	
	Address address;
	
	int id;
	String name;


	
	public Student(int id, String name, Address address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}

}
