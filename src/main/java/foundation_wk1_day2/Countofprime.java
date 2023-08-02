package foundation_wk1_day2;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

//check the number of occurences

public class Countofprime {
	
	@Test
	public void test() {
		
		int[] answer = {2,3,5,7};
		Assert.assertEquals(true, prime(3));
	}
	
	public int prime(int input) {
		
		int primecount=0;
		for (int i = 2; i <=input; i++) {
			if(input%i!=0) {
				primecount++;
			}
		
		
	}
		return primecount;
	
	}
	
}
