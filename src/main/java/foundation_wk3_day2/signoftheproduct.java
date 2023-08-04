package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class signoftheproduct {


	@Test
	public void test() {

		int [] actual =new int[] {-1,-2,-3,-4,3,2,1};
		Assert.assertEquals(1, signtoproduct(actual));

	}

	@Test
	public void test1() {

		int [] actual =new int[] {1,5,0,2,-3};
		Assert.assertEquals(0, signtoproduct(actual));

	}

	@Test
	public void test3() {

		int [] actual =new int[] {-1,1,-1,1,-1};
		Assert.assertEquals(-1, signtoproduct(actual));

	}

	public int signtoproduct(int[] arr) {
		// TODO Auto-generated method stub

		int negcount=0;
		for (int i = 0; i < arr.length; i++) {

			if(arr[i]<0) {
				negcount++;
			}
			if(arr[i]==0) {
				return 0;
			}
		}
		if(negcount%2==0) {
			return 1;
		}
		return -1;

	}

}
