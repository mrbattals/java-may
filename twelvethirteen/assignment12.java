package twelvethirteen;

import java.util.Scanner;

public class assignment12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 N > 1 and N < 100000
        Given N value, Create a string that contains the odd number of character. Example
        if N = 3 then the string should be dog, if N = 4 ball(X), mice.

        if N is odd
            - Just repeat a N number of time
        if N is even
            - Repeat a for N-1 times and append single b

        Note : Repeation of string should be done in proper way so that it won't consume
        alot of memory.

        N = 5 => aaaaa
        B = 6 => aaaaab 
		 */
		String a = "a";
		String b = "b";
		int finalNumber;
		System.out.println("Please enter the number");
		int userNumber = scan.nextInt();
		String str = Integer.toString(userNumber);
			finalNumber = userNumber%2;
			if(finalNumber == 0) {
				for(int i=0; i<str.length();i++) {
					System.out.print(a);
				}
			
			}
			else if(finalNumber == 1) {
				for(int i=0; i<str.length()-1;i++) {
					System.out.print(a);
				}
				
				System.out.print(b);
		}
	
	}

				

	}



