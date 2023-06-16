package Date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
	
	public static void main(String[] args) {
		
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Please enter your DOB (yyyy-mm-dd) ");
		        String st = scan.nextLine();
		        LocalDate Dob;
		        Dob = LocalDate.parse(st);
		        System.out.println("Age is :- "+ calcAge(Dob));
		    }

	public static int calcAge(LocalDate Dob)
		    {
		        LocalDate currentDate = LocalDate.now();
		        int age = Period.between(Dob,currentDate).getYears();
		        return age;
		    }
		}
	


