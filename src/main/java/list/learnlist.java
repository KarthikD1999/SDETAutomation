package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class learnlist {
	public static void main(String[] args) {
		//list is an interface
		//Automatic increment and dec
		//it wont use primitive data type 
		//we have to use wrapper class
		//fifo
		
		//int[] marks = new int[10];
		List<String> learns = new ArrayList<String>();
		
		//add
		//get
		//size
		//remove
		//clear
		//add(index,value)
		//indxof
		//contains
		learns.add("karthik");
		learns.add("viky");
		learns.add("keerthi");
		learns.add("chikku");
		learns.add("ramesh");
		learns.add("velu");
		learns.add("saravana");
		
		String std1 = learns.get(0);
		System.out.println(std1);
		String std2 = learns.get(1);
		System.out.println(std2);
		String std3 = learns.get(2);
		System.out.println(std3);
		String std4 = learns.get(3);
		System.out.println(std4);
		
		int size = learns.size();
		System.out.println(size);
		
		
		System.out.println(learns);

		
		for (int i = 0; i <learns.size(); i++) {
			
			System.out.println(learns.get(i));
			
		}
		System.out.println("********************");
		
		learns.add(7, "srini");
		System.out.println(learns.contains("srini"));
		
		System.out.println("********************");
		
		
		System.out.println(learns.contains("srini"));
		
		Collections.sort(learns);
		Collections.reverse(learns);
		System.out.println(learns);
		
		
		
	}

}
