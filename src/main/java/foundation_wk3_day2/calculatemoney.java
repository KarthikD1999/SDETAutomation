package foundation_wk3_day2;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class calculatemoney {
	
	@Test
	public void test2() {
		
		Assert.assertEquals(10, bank(4));

	}
	
	
	
	@Test
	public void test1() {
		
		Assert.assertEquals(37, bank(10));

	}
	
	public int bank(int n) {

		
		int noofweeks=n/7;//1
		int noofdays=n%7;//3
		int res=0;
		int endday=7;
		
		
		for (int week = 0; week <noofweeks+1; week++) {
			
			if(week==noofweeks)
				endday=noofdays;
			
			
			for (int day = 1; day<=endday; day++) {
				
				res=res+day+week;
				
			}
		}
		System.out.println(res);
		return res;
	}

}
