package annotation;

public class Javadoc {


		public static void main(String[] args) {
			

		}
		
		/**
		 * Function name : greet
		 * 
		 * Inside the function: 
		 * 1. prints : 'Hi!'
		 * 
		 * 
		 */
		
		public static void greet() {
			System.out.println("Hi!");
		}
		
		/**
		 * Function name : printText
		 * @param name
		 * @param age
		 * 
		 * Inside the function :
		 * 1. print the name and age as part of a text.
		 */
		
		public static void printText(String name, String age) {
			System.out.println("Hi, I am " + name + ", " + age + "y.o!");
		}
		
		/**
		 * 
		 * Function name : calculateArea
		 * @param a (double)
		 * @param b (double)
		 * @return (double)
		 * 
		 * Inside the function :
		 * 1. calculates the area and returns it!
		 */
		
		public static double calculateArea (double a, double b) {
			double area = a*b;
			return area;
			
			
		}

	}

