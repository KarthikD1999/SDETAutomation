package foundation_wk2_day1;

import org.junit.Test;

import junit.framework.Assert;

public class Checkprime {
	
	@Test
	public void question() {
		Assert.assertEquals(true, answer(5));
	}
	
	public boolean answer(int input) {
		
		if(input>1) {
			
			for (int i = 2; i <=input; i++) {
				if(input%i==0) {
					
					return true;
				}
			}
		}
		
		return false;
	}
}
