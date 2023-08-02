package foundation_wk3_day2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Missingnumber {
	
	
	
	@Test
	public void test1() {
		
		Assert.assertEquals(2, Missingnum(new int[] {1,0}));
		
	}
	@Test
	public void test2() {
		
		Assert.assertEquals(2, Missingnum(new int[] {3,1,0}));
		
	}
	@Test
	public void test3() {
		
		Assert.assertEquals(8, Missingnum(new int[] {9,6,4,2,3,5,7,0,1}));
		
	}
	
	
	public int Missingnum(int[] arr) {
		
		
		int num=0;
		Arrays.sort(arr);
		for (int i = 0; i <arr.length; i++) {
			
			if(i!=arr[i]) {
				return i;
			}
		}
		
		return arr.length;
	}

}
