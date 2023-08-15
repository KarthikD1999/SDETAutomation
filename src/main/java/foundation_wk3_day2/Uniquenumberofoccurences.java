package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Uniquenumberofoccurences {
	
	
	@Test
	public void test() {
		
		Assert.assertEquals(true, unique(new int[] {1,2,1,2,3,1}));
		//2,3,1,

	}
	
	public boolean unique(int [] arr) {//{1,2,0,2,3,2},{1,2,0,0,3,0},{}
		
		int[] newarr =new int[arr.length];	
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					count++;
				arr[j]=0;
				}
			}
			newarr[i]=count;
			
		}
		
		for (int i = 0; i < newarr.length; i++) {
			for (int j = i+1; j < newarr.length; j++) {
				if(newarr[i]==newarr[j]) {
					return false;
				}
			}
		}
		return true;

	}

}
