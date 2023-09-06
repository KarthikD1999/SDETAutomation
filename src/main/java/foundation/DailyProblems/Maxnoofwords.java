package foundation.DailyProblems;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Maxnoofwords {


	@Test
	public void testone() {

		String[] str = new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		Assert.assertEquals(6,soluction(str));
	}

	
	@Test
	public void test() {
		// TODO Auto-generated method stub
		String[] str = new String[] {"e", "i", "t"};
		Assert.assertEquals(1,soluction(str));

	}



	public int soluction(String[] input) {

		int[] countarr = new int[input.length];
		for (int i = 0; i < input.length; i++) {

			String[] split = input[i].split(" ");
			countarr[i]=split.length;

		}

		int max = 0;
		for (int i = 0; i < countarr.length; i++) {
			if(countarr[i]>max) {
				max=countarr[i];
			}
		}
		return max;
	}
}
/*U=y
 *method= brute
 *test p: ["alice and bob love leetcode", "i think so too", "this is great thanks very much"] output:6 
 *test n: [""] output:0 
 *test p: ["a","b","c"] output:3 
 * p: Create new int[] with length of input 
 * using for iterate the string[] 
 * using sort int [] find the max
 * for (int i = 0; i < input.length; i++) {

			countarr[i]=input[i].length()-1;

		}
 * 
 * @Test
	public void tesone() {
		// TODO Auto-generated method stub
		String[] str = new String[] {""};
		Assert.assertEquals(0,soluction(str));

	}
	@Test
	public void test() {
		// TODO Auto-generated method stub
		String[] str = new String[] {"e", "i", "t"};
		Assert.assertEquals(1,soluction(str));

	}
 * 
 * 
 * 
 */
