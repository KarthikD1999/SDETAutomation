package foundation_wk2_day2;

import org.junit.Test;

import junit.framework.Assert;

public class BuyandSell {
	
	
	@Test
	public void test() {
		
		int[] ar = {7,1,5,3,6,4};
		Assert.assertEquals(5,BuySell(ar));

	}

	public int BuySell(int[] prices) {
			
		int maxprofit=0;
		int currentprofit=0;
		int buyvalue = Integer.MAX_VALUE;
		
		for (int i = 0; i < prices.length; i++) {
			
			if(prices[i]<buyvalue) {
				buyvalue=prices[i];
			}
			currentprofit=prices[i]-buyvalue;
			
			if(maxprofit<currentprofit) {
				
				maxprofit=currentprofit;
			}
		}
		
		return maxprofit;
	}
}


/*
*initialize the maxprofit as 0
*initialize the currentprofit=0
*initialize buyvalue as max int
*iterate through the array
*if array[i]< buy value assign it to buyvalue
*current profit = today price-buyvalue 
*
*if(maxproft<currentprofit){
*assign to max profit
*}
*
*
*
*/
