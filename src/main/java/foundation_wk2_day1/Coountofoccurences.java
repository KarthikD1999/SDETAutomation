package foundation_wk2_day1;

import org.junit.Assert;
import org.junit.Test;

public class Coountofoccurences {
	
	@Test
	public void test1() {
		int  actual =countofoccurences (new int[] {1, 1, 2, 2, 2, 2, 3,},2);
		Assert.assertEquals(4,actual);	
		
	}
	
	@Test
	public void test2() {
		int  actual =countofoccurences (new int[] {1},2);
		Assert.assertEquals(0,actual);	
		
	}
	
	
	
	public int countofoccurences(int[] num, int nums) {
			
		int x=0;
		for (int i = 0; i <num.length; i++) {
			if(num[i]==nums) {
				x++;
			}
		}
		
		return x;
	} 
	
}
