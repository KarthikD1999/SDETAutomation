package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Maximum69 {

	
	@Test
	public void test() {
		
		Assert.assertEquals(9969, max(9669));
		
	}
	
	public int max(int input) {
		
		String num = Integer.toString(input);
		String replaceFirst = num.replaceFirst("6","9");
		
		if(Integer.parseInt(replaceFirst)>input) {
			return Integer.parseInt(replaceFirst);
		}
		return input;
	}
}
			