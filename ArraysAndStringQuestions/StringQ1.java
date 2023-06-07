package ArraysAndStringQuestions;

public class StringQ1 {

	public static void main(String[] args) {
		// 1. Write a program to check whether the given input string is a palindrome
		String name = "lemelss";
		String name2 = "";
		
		
		for(int i=name.length()-1;i>=0;i--) {
			name2 = name2 + name.charAt(i) ;
			if(name.equals(name2)) {
				System.out.println("Yes it is");
			
			}
			else {
				System.out.println("Not really");
			}
		}

	}

}
