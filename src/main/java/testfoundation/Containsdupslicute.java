package testfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Containsdupslicute {


	@Test
	public void test() {

		int[] actual=new int[] {1,2,3,1};
		Assert.assertEquals(1, numbers(actual));

	}
	@Test
	public void test1() {

		int[] actual=new int[] {1,2,3,4,5};
		Assert.assertEquals(0, numbers(actual));

	}

	public int numbers(int[] arr) {

		int count=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {

				if(arr[i]==arr[j]) {
					//count++;
					return arr[i];
				}

			}
		}

		return 0;
	}

}
