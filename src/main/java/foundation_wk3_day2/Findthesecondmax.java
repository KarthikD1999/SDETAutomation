package foundation_wk3_day2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Findthesecondmax {

	@Test
	public void test() {

		int[]	actual=new int [] {7,3,4,2,9,6,10};
		Assert.assertEquals(9, findsecondmax(actual));

	}
	@Test
	public void test1() {

		int[]	actual=new int [] {1,1};
		Assert.assertEquals(0, findsecondmax(actual));

	}

	public int findsecondmax(int [] arr) {


		Arrays.sort(arr);
		if(arr.length>2) {
			System.out.println(arr[arr.length-2]);
			return arr[arr.length-2];
		}
		
		return 0;
	}

}

//input Array = {7,3,4,2,9,6,10}, Find 2nd maximum

//inp int[]
// out int
// Pseudo code -->using sort
//-->return arr[length-2]

