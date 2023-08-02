package foundation_wk2_day1;

import org.junit.Assert;
import org.junit.Test;

public class CheckDuplicates {
	
	@Test
	public  void test2() {
		
		int[] arr= {1,2,3,4};
		Assert.assertEquals(false,soluction(arr));

	}
	
	@Test
	public  void test1() {
		
		int[] arr= {1,2,3,1};
		Assert.assertEquals(true,soluction(arr));

	}
	@Test
	public  void test3() {
		
		int[] arr= {1};
		Assert.assertEquals(false,soluction(arr));

	}
	
	
	public boolean soluction(int[] input) {
		

		int n=1;
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i]==input[j]) {
					n++;
				}
			}
			
		}
		
		if(n>=2) {
			return true;
		}
		else {
			return false;
		}
	}

}
