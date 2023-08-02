package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Replacethevalueofchar {

	
	@Test
	public void soluction() {
		
		Assert.assertEquals("abcdef",replacechar("a1c1e1"));
	}
	
	@Test
	public void soluction1() {
		
		Assert.assertEquals("abcdef",replacechar("a1b2c3d4e"));
	}
	
	public String replacechar(String input) {
		
		
		String output="";
		char[] arr = input.toCharArray();
		for (int i = 1; i < arr.length; i=i+2) {
			
			arr[i]=(char)((arr[i-1])+(arr[i])-'0');
			
		}
		
		return output=String.valueOf(arr);
		
	}
	
}
