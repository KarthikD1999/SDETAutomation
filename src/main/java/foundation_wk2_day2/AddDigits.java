package foundation_wk2_day2;

import org.junit.Test;

import junit.framework.Assert;

public class AddDigits {
	
	@Test
	public void test() {
		
		Assert.assertEquals(7,add(34));
	}
	
	@Test
	public void tes1t() {
		
		Assert.assertEquals(9,add(27));
	}

	
	public int add (int input) {
		
		if(input<9) {
			return input;
		}
		if(input%9==0) {
			return 9;
		}
		return input%9;
				
	}
	
	
}
