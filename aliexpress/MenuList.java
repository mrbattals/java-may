package aliexpress;

import java.util.ArrayList;

public class MenuList {
	
	public static void main(String[] args) {
		ArrayList<Menu> menuList = new ArrayList<>();
		menuList.add(new Menu(1,"WOMEN FASHION",0,false,"women-fashion"));
		menuList.add(new Menu(2,"SWIM WEAR",1,false,"swim-wear"));
		menuList.add(new Menu(3,"Bikini Sets",2,true,"bikini-sets"));
		System.out.println(menuList);
		menuList.remove(new Menu(2,"SWIM WEAR",1,false,"swim-wear"));
		System.out.println(menuList);
		menuList.set(1, new Menu(5,"BOTTOMS",1,false,"bottoms"));
		System.out.println(menuList);
		
	}

	

	
	
}
