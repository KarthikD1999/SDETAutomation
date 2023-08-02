package foundation_wk2_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Singlenumber {
	
	
	@Test
	public void test1() {
		
		Assert.assertEquals(1,singlenum(new int[] {2,2,1}));

	}
	
	
	public int singlenum(int[] num) {
		
		int value=0;
		for (int i = 0; i < num.length; i++) {
			
			value=value^num[i];
			
			}
		return value;
		}
		
	}


