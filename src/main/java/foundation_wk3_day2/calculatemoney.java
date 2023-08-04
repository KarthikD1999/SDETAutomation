package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class calculatemoney {
	
	@Test
	public void test() {
		
		Assert.assertEquals(4, bank(4));

	}
	
	@Test
	public void test1() {
		
		Assert.assertEquals(37, bank(10));

	}
	
	public int bank(int n) {

		int w=7;
		
		int b=0;
		for (int i = 1; i<=n; i++) {
			int r=0;
			r=r+1;
			b=r;
			
		}
		int b2=0;
		for (int j = 8; j<=n; j++) {
			int r=0;
			
			r=r+2;
			b2=r;
		}
		b2+=b;
		
		
		System.out.println(b2);
			
		return b2;
	}

}
