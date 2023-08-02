package testfoundation;

import org.junit.Assert;
import org.junit.Test;

public class Twosum {
	
	@Test
	public void soluction() {
		
		int[] arr = {2,7,11,15};
		Assert.assertArrayEquals(new int[] {0,1},twosum(arr,9));
		
	}
	public int[] twosum(int[] sum,int target) {
		
		for (int i = 0; i < sum.length; i++) {
			for (int j = i+1; j < sum.length; j++) {
				if(sum[i]+sum[j]==target) {
					
					return new int[] {i,j};
				}
			}
		}
		
		
		return new int[] {-1,-1};
	}

}
