package testfoundation;

import org.junit.Assert;
import org.junit.Test;

public class Isogram {
	
	@Test
	public void soluction() {
		
		boolean	 isogram = answer("test");
		Assert.assertEquals(false, isogram);

	}	
	
	public boolean answer(String input) {
		char[] charArray = input.toCharArray();
		for (int i = 0; i <=charArray.length-1; i++) {
			for (int j = i+1; j <=charArray.length-1; j++) {
				if(charArray[i]==charArray[j]) {
					return false;
				}
			}
		}
		
		return true;
	}
}
