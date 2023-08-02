package foundation_wk2_day1;

import org.junit.Test;

import junit.framework.Assert;

public class Majorityelement {


	@Test
	public void test() {

		Assert.assertEquals(1,element(new int[] {2,2,1,1,1,1,1,2,2}));

	}
	@Test
	public void test1() {

		Assert.assertEquals(2,element(new int[] {2,2,1,1,1,2,2}));

	}

	public int element(int[] input) {
		
		for (int i = 0; i < input.length; i++) {
			int count=1;
			for (int j = i+1; j < input.length; j++) {
				if(input[i]==input[j]) {
					count++;
				}
			}
			if(count>input.length/2) {
				return input[i];
			}
		}
		return -1;
	}
}


