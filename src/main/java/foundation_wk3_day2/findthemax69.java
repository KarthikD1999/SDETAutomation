package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class findthemax69 {
	
	@Test
	public void test() {

		Assert.assertEquals(9999, findmax(9969));
	}
	
	@Test
	public void test1() {

		Assert.assertEquals(9666, findmax(6666));
	}
	@Test
	public void test2() {

		Assert.assertEquals(9999, findmax(6999));
	}
	
	public int findmax(int input) {
		
		
		String num = Integer.toString(input);
		String string = num.replaceFirst("6","9");
		int max = Integer.parseInt(string);
		if(max>input) {
			return max;
		}
		return input;
	}
	

}


//Yes
//6666
//9999
//9669
//Convert the input to String
//Using replace first check replace the 6 to 9
//check the condition if replaced value is greater than input
//if its true return
// return 69
