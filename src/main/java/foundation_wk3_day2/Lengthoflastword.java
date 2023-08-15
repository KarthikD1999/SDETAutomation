package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Lengthoflastword {
	
	
	@Test
	public void test2() {
		
		Assert.assertEquals(4,legthofword("test leaf"));

	}
	
	
	public int legthofword(String input) {
		
		int count=0;
		String trimd = input.trim();
	//	System.out.println(trimd);
		int lastIndexOf = trimd.lastIndexOf(" ")+1;
		//System.out.println(lastIndexOf);
		int num = trimd.substring(trimd.lastIndexOf(" ")+1,trimd.length()).length();// Startvalue is 5 endingindex is length of string
		System.out.println(num);
		return num;
		
	}

}
