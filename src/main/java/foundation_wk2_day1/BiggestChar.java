package foundation_wk2_day1;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BiggestChar {

	@Test
	public void soluction() {

		char[] ch = {'b','d','h'};
		Assert.assertEquals('b',answer(ch,'e'));
	}

	public char answer(char[] arr,char target) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>target) {
				return arr[i];
			}
		}
		

		return target;
	}
}
