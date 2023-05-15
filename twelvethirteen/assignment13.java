package twelvethirteen;

import java.util.Scanner;

public class assignment13 {
	/*
N = any number
Suppose 
    if N = 123 then you need to add 1+2+3 = 5(output)
    if N = 1000 then you need to add 1+0+0+0 = 1 (Output)
        Note : Don't use string
		 */	

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number:");
		 int userNumber = scan.nextInt();
	        int result = 0; 

	        while (userNumber > 0) {

	            result = result + userNumber % 10;

	            userNumber = userNumber / 10;

	        }

	        System.out.println(result); 
   
		
	}

}
