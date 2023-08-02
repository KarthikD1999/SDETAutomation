package foundation_wk2_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Poweroftwo {
	
	@Test
	public void Soluction1() {
		
		Assert.assertEquals(true,powertwo(16));

	}
	
	@Test
	public void Soluction2() {
		
		Assert.assertEquals(true,powertwo(1));

	}
	
	@Test
	public void Soluction3() {
	
	Assert.assertEquals(false,powertwo(3));

}

	public boolean powertwo(int num) {
		
		if(num<=0) {
			
			return true;
		}
	
		while(num!=1) {}
		
		if(num%2!=0) {
			return false;
		}
		else {
			num=num/2;
		}
		
		return true;

	}

}

