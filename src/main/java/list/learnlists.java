package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Week3.day2.Arraylist;

public class learnlists {
	public static void main(String[] args) {
		List<Integer> learn = new ArrayList<Integer>();
		learn.add(100);
		learn.add(200);
		learn.add(300);
		learn.add(100);
		learn.add(232);
		learn.add(432);
		learn.add(233);
		learn.add(543);
		learn.add(0,20);
		System.out.println(learn);
		System.out.println("*******************************************");
		 for (int i = 0; i < learn.size(); i++) {
			System.err.println(learn.get(i));
		}
		 
		System.out.println("*******************************************");

		 for (Integer eachvalue : learn) {
			System.out.println(eachvalue);
		}
			System.out.println("*******************************************");	
		boolean contains = learn.contains(543);
		System.out.println(contains);
		System.out.println("*******************************************");
		learn.remove(0);
		System.out.println(learn);
		System.out.println("*******************************************");
		Collections.sort(learn);
		System.out.println(learn);
		Collections.reverse(learn);
		System.out.println(learn);
	}

}
