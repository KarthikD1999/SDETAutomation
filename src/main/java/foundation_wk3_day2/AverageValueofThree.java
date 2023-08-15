package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class AverageValueofThree {
	
	
	@Test
	public void test() {

		int[] actuals =new int [] {1,3,6,10,12,15};
		
		Assert.assertEquals(9,averageofthree(actuals));
		
	}
	@Test
	public void test1() {

		int[] actuals =new int [] {1,2,4,7,10};
		
		Assert.assertEquals(0,averageofthree(actuals));
		
	}
	
	public int averageofthree(int [] arr) {
		
		int average=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				if(arr[i]%3==0) {
					average=average+arr[i];
				}
			}
			
		}
		int intaverage = average/2;
		System.out.println(intaverage);
		if(intaverage!=0) {
			return intaverage;
		}
		return 0;
		
	}

}

