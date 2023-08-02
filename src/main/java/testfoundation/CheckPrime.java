package testfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class CheckPrime {


	@Test
	public void test() {

		Assert.assertEquals(true,checkprime(3));

	}
	@Test
	public void test2() {

		Assert.assertEquals(false,checkprime(6));

	}
	@Test
	public void test3() {

		Assert.assertEquals(true,checkprime(7));

	}
	@Test
	public void test4() {

		Assert.assertEquals(true,checkprime(8));

	}

	public boolean checkprime(int input) {
		// TODO Auto-generated method stub
		if(input>=2) {
			for (int i = 2; i <input; i++) {

				if(input%i==0) {
					return false;
				}
			}
		}
		return true;
	}
}
