package foundation_wk3_day1;

import org.junit.Assert;
import org.junit.Test;

public class Firstpalindrome {


	@Test
	public void test() {


		Assert.assertEquals("ada", first(new String[] {"abc","car","ada","racecar","cool"}));
	}
	
	@Test
	public void test1() {


		Assert.assertEquals("madam", first(new String[] {"madam","car","madam","racecar","cool"}));
	}
	
	@Test
	public void test2() {


		Assert.assertEquals("", first(new String[] {"def","ghi"}));
	}
	public String first(String[] arr) {

		for (int i = 0; i < arr.length; i++) {

			String word = arr[i];
			String revword = "";

			for (int j = word.length()-1; j >=0; j--)	{

				revword=revword+word.charAt(j);
					
			}
			if (revword.equals(word)) {
				return word;
			}
		}
		return ""; 

	}

}
