package testfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class adddigits {


	@Test
	public void soluction() {
		Assert.assertEquals(2, adddigits(38));
	}

	public int adddigits(int num) {

		if(num<=9) {
			return num;
		}
		if(num%9==0) {
			return num;
		}
		else {
			return num%9;
		}

	}

}
