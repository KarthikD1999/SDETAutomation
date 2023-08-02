package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Findthedifference {


	@Test
	public void test1() {

		Assert.assertEquals('e',finddiff("abcd","abcde"));
	}

	public char finddiff(String a,String b) {

		char[] charArray1 = a.toCharArray();
		char[] charArray2 = b.toCharArray();
		for (int i = 0; i < charArray2.length; i++) {
			for (int j = i+1; j < charArray1.length; j++) {

				if(charArray2[i]!=charArray1[j]) {


				}

			}

		}
		return 'a';

	}
}
