package foundation_wk3_day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Squaresorting {
	
	
	@Test
	public void test() {

		int[]  actual = new int[] {-4,-1,0,3,10};
		int[] exp = new int[] {0,1,9,16,100};
		Assert.assertArrayEquals(exp, squareofall(actual));
	}
	@Test
	public void test1() {

		int[]  actual = new int[] {-7,-3,2,3,11};
		int[] exp = new int[] {4,9,9,49,121};
		Assert.assertArrayEquals(exp, squareofall(actual));
	}
	
	public int[] squareofall(int[] arr) {
		// TODO Auto-generated method stub
		
		int[] newarr=new int[arr.length];
		for (int i = 0; i < newarr.length; i++) {
			int multi=0;
			multi=arr[i]*arr[i];
			newarr[i]=multi;
			
		}
		System.out.println(Arrays.toString(newarr));
		Arrays.sort(newarr);
		System.out.println(Arrays.toString(newarr));

		return newarr;
	}
	
}
