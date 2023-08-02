package foundation_wk2_day2;

import org.junit.Assert;
import org.junit.Test;

public class Candies {

	
	@Test
	public void solution() {

		int[] alice =  {1,1,2,2,3,3,4,4};
		Assert.assertEquals(4, candies(alice));
	}
	@Test
	public void test() {

		int[] alice =  {6,6,6,6};
		Assert.assertEquals(2, candies(alice));
	}


	public int candies(int[] input) {

		int n=0;
		int count=0;
		int type =  input.length;
		n=type/2;

		if(n%2==0) {

			for (int i = 0; i < input.length; i++) {
				for (int j = i+1; j < input.length; j++) {
					if(input[i]==input[j]) {
						count++;
					}
				}
			}
			return count;
		}
		
		return n%2;
	}

}
