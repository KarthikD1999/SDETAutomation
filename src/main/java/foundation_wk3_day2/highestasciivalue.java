package foundation_wk3_day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class highestasciivalue {
	
	
	@Test
	public void test1() {
		
		char[]	chars=new char[] {'a','b','c','d','s','t','u','v'};
		Assert.assertArrayEquals(new char[] {'v','u','t','s'}, values(chars));

	}
	
	public char[] values(char[] arr) {

		Arrays.sort(arr);
		char[]	newarr=new char[4];
		int j=0;
		for (int i = arr.length-1; i <=3; i--) {
			
			newarr[j]=arr[i];
			j++;
			
		}
		System.out.println(newarr);
		
		return newarr;
	}

}
