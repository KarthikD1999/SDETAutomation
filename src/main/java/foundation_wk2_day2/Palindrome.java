package foundation_wk2_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Palindrome {
	
	@Test
	public void test () {
		Assert.assertEquals(true, palindrome(121));
	}
	public boolean palindrome(int num) {
		
		int org = num;
		int rem=0;
		while(num>0) {
			
			rem = rem*10 + num%10; //1//2
			num = num/10; //12
			
		}

		return rem==org;
	}
}

//rem 1 (10+2=12)12  120+1=121  
//num 12 1 