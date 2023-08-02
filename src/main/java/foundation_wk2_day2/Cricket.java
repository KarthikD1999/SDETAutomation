package foundation_wk2_day2;

import org.junit.Assert;
import org.junit.Test;

public class Cricket {

	@Test
	public void soluction() {
		Assert.assertEquals(6, answer(7));

	}

	public  int answer(int n) {

		int matches=0;
		int totalmatches=0;

		while(n>1) {

			if(n%2==0) {
				matches=n/2;
				n=n/2;
			}
			else {
				matches=(n-1)/2;
				n=((n-1)/2)+1;
			}
			totalmatches+=matches;
		}
		
		return totalmatches;
	}
}
