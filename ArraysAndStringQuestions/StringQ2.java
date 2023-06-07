package ArraysAndStringQuestions;

public class StringQ2 {

	public static void main(String[] args) {
		//2. Write a program to count the occurrence of letter ‘e’ in string InterviewBit
		
		String name = "InterviewBit";
		String total = "";
		char eLetter = 'e';
		int count = 0;
		for(int i=0;i<name.length();i++) {		
			if(name.charAt(i) == eLetter) {
				count++;
						}
				
		}
		System.out.println("Total e is "+ count);

	}

}
