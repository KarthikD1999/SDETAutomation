package foundation_wk3_day2;

import java.util.Arrays;

import junit.framework.Assert;

public class Minimumsumoffourdigit {
	
	
	public void test1() {

		Assert.assertEquals(52,Minsumoffout(2932));
	}
	
	public int Minsumoffout(int input) {

		String pairone="";
		String pairtwo="";
		//String convertinput = Integer.toString(input);
		String string = Integer.toString(input);
		char[] splitted = string.toCharArray();
		Arrays.sort(splitted);
		//pairone=
		
		
		return 0;
	}

}

//Convert to Int array
//sort the array
//pick the 0 and 2 as pairone 
//pick the 1 and 3 as pairtwo
///sum and return
//
//
//