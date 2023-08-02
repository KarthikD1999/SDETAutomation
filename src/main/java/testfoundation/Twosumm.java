package testfoundation;

import org.junit.Assert;
import org.junit.Test;

public class Twosumm {

	
	@Test
	public void test() {

		int[] Actual= addtwosum(new int[] {2,7,11,15},9);


		Assert.assertArrayEquals(new int[] {0,1},Actual);

	}


	public int[] addtwosum(int[] input,int target) {
		// TODO Auto-generated method stub

		for (int i = 0; i < input.length; i++) {

			for (int j = i+1; j < input.length; j++) {

				if(input[i]+input[j]==target) {
					return new int[] {i,j};
				}

			}
		}
		
		return new int[] {-1,-1};

	}
}
