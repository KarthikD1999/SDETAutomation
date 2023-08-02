package foundation_wk2_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Twosum {
	
	@Test
	public void test() {
		
		int[] actual =answer(new int[] {2,7,11,15},9);
		//Assert.assertEquals(new int[] {0,1},actual);
		org.junit.Assert.assertArrayEquals(new int[] {0,1},actual);

	}
	public int[] answer(int[] input,int target) {
		
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


/*initialize nums [], target 
for loop i and j=i+1 initialize
add the two for loops and compare with target(==)
reurn the values num[i] and num[j]*/