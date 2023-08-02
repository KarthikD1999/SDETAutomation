package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Pivot {
	
	
	@Test
	public void test() {
		
		Assert.assertEquals(3,pivot(new int[] {1,7,3,6,5,6}));

	}
	
	public int pivot(int[] arr) {
		
		int left=0;
		int right=0;
		int rightsum=0;
		
		for (int i = 0; i < arr.length; i++) {
			right+=arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			
			right=right-arr[i];
			if(left==right) {
				return i;
			}
			else {
				left=left+arr[i];
			}
		}
		
		
		return -1;
	}

}
