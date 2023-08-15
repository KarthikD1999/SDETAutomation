package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Findthesteps_redo {
	
	@Test
	public void test1() {

			Assert.assertEquals(4,Stepcounts(10));
	}
	@Test
	public void test2() {

			Assert.assertEquals(0,Stepcounts(0));
	}
	@Test
	public void test3() {

			Assert.assertEquals(0,Stepcounts(-1));
	}
	public int Stepcounts(int noofcoins) {
		
		int count=0;

		if(noofcoins>=1) {
			
			for (int i = 1; i <=noofcoins;i++) { 
				
				if(i<=noofcoins) {
				noofcoins=noofcoins-i;
				count++;
				}
				//System.out.println(count);
				
			}
			return count;
			
		}
		System.out.println(count+"last");
		return 0;
	}

}
