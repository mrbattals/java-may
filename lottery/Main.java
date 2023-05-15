package lottery;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int winnerNumber = randomNumber100();
		int[] userNumbers5 = new int [5];
		int userNumber1 = randomNumber25();

	}
		public static int randomNumber25(){
		double random = Math.random() * 26;
		return (int) random; 
		
	}
	
		public static int randomNumber75(){
		double random = Math.random() * 76;
		return (int) random;
	}
		public static int randomNumber100(){
			double random = Math.random() * 101;
			return (int) random;
		}

	
	}



