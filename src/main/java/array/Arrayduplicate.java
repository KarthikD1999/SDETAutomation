package array;

import java.util.Arrays;

public class Arrayduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {77917,77918,77919,77920,77921,77922,77923,77924,77925,77919,77926,77927,77928,77929,77930,77931,77932,77933,77934,77935,77958};
		Arrays.sort(marks);
		for (int i = 0; i<marks.length-1; i++) {
			if(marks[i]==marks[i+1]) {
				System.out.println("The duplicate values is"+" "+marks[i]);
				
			}
		}

	}

}
