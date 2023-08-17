package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Productandsum {
	
	@Test
	public void test() {

		Assert.assertEquals(15, findthediff(234));
		
	}
	
	public int findthediff(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		int multi=1;
		int lastdigit=0;
		int diff=0;
		 while(num!=0) {
			 
			 lastdigit=num%10;
			 sum=sum+lastdigit;
			 multi=multi*lastdigit;
			 num=num/10; 
			 
		 }
		 diff=multi-sum;
			System.out.println(diff); 
		return  diff;
	}

}

//Yes understand the problem
//test date {234},{000}
//Pduedocode : In the given int -->modulo by 10 u will get the last num
			//save the value in sum +0;
			// divide by 10 check it is not zero
			//divided value reinitialize it to num and repeat the steps 2 and 3 till the divide value gets 0
			//mutiple the values in arr and store it in variable
			//add the values in arr and store it in variable
			//subtract the both values
