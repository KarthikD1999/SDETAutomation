package foundation_wk1_day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Missingnum {
	
	@Test
	public void test() {
		 Assert.assertEquals(2, answer(new int[] {0,1,3}));
	}
	
	public int answer(int[] input) {
		
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			
			if(input[i]!=i) {
				return i;
			}
		}
		
		
		return input.length-1; 
	}

}
