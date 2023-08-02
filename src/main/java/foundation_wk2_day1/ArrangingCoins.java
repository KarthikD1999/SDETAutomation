package foundation_wk2_day1;

import org.junit.Assert;
import org.junit.Test;

public class ArrangingCoins {
	
	
	@Test
	public void test() {
		
		Assert.assertEquals(2, Steps(5));
	}
	
	@Test
	public void test1() {
		
		Assert.assertEquals(3, Steps(8));
	}
	
	@Test
	public void test3() {
		
		Assert.assertEquals(4, Steps(6));
	}
	
	
	
	public int Steps(int input) {
		
		//int coins=0;
		int s=0;
		for (int i = 1; i <=input ; i++) {
			
			input=input-i;
			s=i;
		}
		
		return s;
	}
	
}
