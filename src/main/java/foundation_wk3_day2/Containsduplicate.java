package foundation_wk3_day2;

import org.junit.Assert;
import org.junit.Test;

public class Containsduplicate {

	
	
	@Test
	public void soluction() {
		
		Assert.assertEquals(true,containsDuplicate(new int[] {1,2,3,1}));

	}
	@Test
	public void tesst2() {
		
		Assert.assertEquals(false,containsDuplicate(new int[] {1,2,3,4}));

	}
	@Test
	public void test3() {
		
		Assert.assertEquals(true,containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));

	}
	
	 public boolean containsDuplicate(int[] nums) {

	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]==nums[j]){
	                    return true;
	                }
	            }

	        }
	        return false;

	        
	    }
	}


