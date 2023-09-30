package foundation_wk3_day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Setmismatch {


	@Test
	public void test() {

		int[] actual = new int[] {5,6,7,7,9};
		int[] exp = new int[] {5,6,7,8,9};
		Assert.assertArrayEquals(exp, sets(actual));

	}
	@Test
	public void test1() {

		int[] actual = new int[] {5,5,7};
		int[] exp = new int[] {5,6,7};
		Assert.assertArrayEquals(exp, sets(actual));

	}

	public int[] sets(int[] arr) {

		int siz = arr.length;
		int[] newarr = new int[siz];
		for (int i = 0; i < arr.length; i++) {

			int count=1;
			int sum=1;
			for (int j = i+1; j < arr.length; j++) {

				if(arr[i]==arr[j]) {
					count++;
					sum=sum+arr[j];
					newarr[i]=arr[j];
					arr[j]=sum;

				}
			}
			if(count==1) {
				newarr[i]=arr[i];
			}
		}


		System.out.println(Arrays.toString(newarr));
		return newarr;

	}

}
