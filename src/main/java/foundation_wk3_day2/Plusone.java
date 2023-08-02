package foundation_wk3_day2;

import org.junit.Assert;
import org.junit.Test;

public class Plusone {
	
	
	@Test
	private void test() {
		
		int [] actual=new int[] {1,2,4};
		Assert.assertArrayEquals(actual, plusone(new int[] {1,2,3}));

	}
	
	public int[] plusone(int[] arr) {

		String empty="";
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			sum=sum+arr[i];
			sum=sum+1;
		}
			int[] result=new int[] {arr.length-1};
			
			for (int i = 0; i < arr.length; i++) {
				
				result[arr[i]]=arr[i];
			}
			return result[];
		
	}

}
