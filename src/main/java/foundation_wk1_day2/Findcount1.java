package foundation_wk1_day2;

import org.junit.Assert;

import org.junit.Test;

//check for duplicates

public class Findcount1 {
	
	@Test
	public void test() {
		
		int[] a = {0,0,0,1,1,1,};
		Assert.assertEquals(3,findone(a));
	
	}
	
	
	public int findone(int[] a) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1) {
				count=count+1;
			}
		}
		
		return count;
	}

}
