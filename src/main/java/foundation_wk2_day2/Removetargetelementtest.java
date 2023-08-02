package foundation_wk2_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Removetargetelementtest {
	
	
	@Test
	public void test() {
		
		
		int[] exp = new int[] {2, 3, 3, 4, 5};
		int[] res = new int[] {2, 4, 5};

	    Assert.assertEquals(res, removetarget(exp, 3));
		
		
	}
	
	public int[] removetarget(int [] arr,int target) {
		
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				count++;
			}
		}

		int[] newarr = new int[arr.length-count];
		int newindex=0;
		for (int i = 0; i < arr.length; i++) {
	
			if(arr[i]!=target) {
				newarr[newindex]=arr[i];
				newindex++;
			}
		
		}

		return newarr;
	}

}


/*
 * "Remove the target element in the array
 example 1: input = [2, 3, 3, 4, 5], target=3
 output = [2, 4, 5]"
 * 
 * 
 * 
 */

