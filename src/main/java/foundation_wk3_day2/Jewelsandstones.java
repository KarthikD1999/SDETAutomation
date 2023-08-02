package foundation_wk3_day2;

import org.junit.Assert;
import org.junit.Test;

public class Jewelsandstones {
	
	@Test
	public void test() {
		
		Assert.assertEquals(3,findjewelcount("aA","aAABBB"));
	}
	
	@Test
	public void test1() {
		
		Assert.assertEquals(0,findjewelcount("z","ZZZZZZ"));
	}
	
	public int findjewelcount(String jewels,String Stones) {
		int finalcount=0;
		char[] charArray = jewels.toCharArray();
		int jcount=1;
		for (int i = 0; i < charArray.length-1; i++) {
			
			if(charArray[i]!=charArray[i+1]) {
				
				jcount++;
			}
		}
		char[] charArray2 = Stones.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
			for (int j = 0; j < charArray2.length; j++) {
				
				if(charArray[i]==charArray2[j]) {
					finalcount++;
				}
			}
		}
		
	
		return finalcount;
				

	}

}
