package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Set;

//import Week3.day2.Arraylist;

public class Listunique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> demo = new ArrayList<Integer>();
		Set<Integer> demo = new LinkedHashSet<Integer>();
		//Hashset-->Random order
		//Treeset-->order based on Ascii 
		//LinkedHashset-->FIFO
		
		demo.add(12);
		demo.add(22);
		demo.add(33);
		demo.add(2);
		demo.add(24);
		demo.add(35);
		demo.add(46);
		demo.add(57);
		demo.add(89);
		demo.add(46);
		demo.add(12);
		//Collections.sort(null);
		System.out.println(demo);
		
	
	}

}
