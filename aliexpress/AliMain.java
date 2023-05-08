package aliexpress;

public class AliMain {

	public static void main(String[] args) {
		
		//assignment 1-2

		Menu womenFashion = new Menu(1,"WOMEN FASHION",0,false,"women-fashion");
			Menu swimWear = new Menu(2,"SWIM WEAR",1,false,"swim-wear");
				Menu bikiniSets = new Menu(3,"Bikini Sets",2,true,"bikini-sets");
				Menu coverUps = new Menu(4,"Cover Ups",2,true,"cover-ups");
			Menu bottoms = new Menu(5,"BOTTOMS",1,false,"bottoms");
				Menu skirts = new Menu(6,"Skirts",5,true,"skirts");
				Menu shorts = new Menu(7,"Shorts",5,true,"shorts");
				Menu jeans = new Menu(8,"Jeans",5,true,"jeans");
			Menu wedding = new Menu(9,"WEDDING",1,false,"wedding");
				Menu weddingDresses = new Menu(10,"Wedding Dresses",9,true,"wedding-dresses");
				Menu promDresses = new Menu(11,"Prom Dresses",9,true,"prom-dresses");
				Menu eveningDresses = new Menu(12,"Evening Dresses",9,true,"evening-dresses");
	}

}
