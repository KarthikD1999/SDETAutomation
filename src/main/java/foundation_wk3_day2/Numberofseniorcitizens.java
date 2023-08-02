package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Numberofseniorcitizens {


	@Test
	public void test() {

		Assert.assertEquals(2, noofpeple(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
	}
	@Test
	public void test1() {

		Assert.assertEquals(0, noofpeple(new String[] {"7868190130M3322","5303914400F2211","9273338290F4120"}));
	}

	public int noofpeple(String[] input) {

		int count=0;

		for (int i = 0; i < input.length; i++) {
			String substring = input[i].substring(11, 13);
			int age = Integer.parseInt(substring);
			if(age>60) {
				count++;
			}
		}
		return count;
	}
}
