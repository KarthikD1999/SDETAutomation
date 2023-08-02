package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Litstset {
	public static void main(String[] args) {
		List<Integer> test = new ArrayList<Integer>();
		test.add(12);
		test.add(22);
		test.add(33);
		test.add(22);
		test.add(24);
		test.add(35);
		test.add(46);
		test.add(57);
		test.add(89);
		test.add(46);
		test.add(12);
		Collections.sort(test);
		for (int i = 0; i <test.size()-1 ; i++) {
			if(test.get(i)==test.get(i+1)) {
				System.out.println("Duplication values are "+test.get(i));
			}

		} 	
	}

}
