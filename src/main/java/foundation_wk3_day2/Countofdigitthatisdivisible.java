package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Countofdigitthatisdivisible {

	

	
	@Test
	public void test1() {
		
		Assert.assertEquals(4, findthecount(1248));
	}
	@Test
	public void test2() {
		
		Assert.assertEquals(0, findthecount(0));
	}
	@Test
	public void test4() {
		
		Assert.assertEquals(0, findthecount(-1));
	}
	@Test
	public void test5() {
		
		Assert.assertEquals(2, findthecount(121));
	}
	
	public int  findthecount(int num) {

		if (num<=0) {
			return 0;
		}
		int temp=num;
		int lastdigit=0;
		int count=0;
		
		while(num!=0) {
			
			lastdigit=num%10;
			if(temp%lastdigit==0) {
				count++;
			}
			num=num/10;
			
		}
		System.out.println(count);
		return count;
	}
}

//Understand Y
//Test data : 2348,121,0,-1
//Psudocode : initialize the variable ,lastdigit,count
//				modulo the given number store it in lastdigit
//				again module the whole num with lastdigit
//				if it is zero increase the count
//				divide the num by 10 and repeat the steps till we get 0 
//				return the count
