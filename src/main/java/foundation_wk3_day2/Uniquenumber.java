package foundation_wk3_day2;

import java.util.Arrays;

import junit.framework.Assert;

public class Uniquenumber {


	public void test1() {
		int[] actual= new int [] {1,2,2,1,1,3};
		Assert.assertEquals(true,findunique(actual));

	}
	public boolean findunique(int[] arr) {
		// TODO Auto-generated method stub

		//Arrays.sort(arr);//1,1,1,2,2,3

		for (int i = 0; i < arr.length; i++) {

			int count=1;
			//int value=0;
			for (int j = i+1; j < arr.length; j++) {

				if(arr[i]==arr[j]) {
					count++;
				}


			} 



		}



		return false;

	}

}
