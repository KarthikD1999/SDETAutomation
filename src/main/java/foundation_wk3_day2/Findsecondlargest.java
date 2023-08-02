package foundation_wk3_day2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Findsecondlargest {
	
	@Test
	public void test() {
		
		Assert.assertEquals("fasle",secondlar("dfa12321afd"));

	}
	
	@Test
	public void test2() {
		
		Assert.assertEquals(2,("dfa12321afd"));

	}
	
	
	public int secondlar(String word) {
		
		
		String trim = word.replaceAll("[a-zA-z]","");
		
		char[] convert = trim.toCharArray();
		
		Arrays.sort(convert);
		
		if(convert.length<2) {
			return -1;
		}
		
		for (int i = convert.length-1; i >0; i--) {
			
			if(convert[i]>convert[i-1]) {
				return convert[i-1]-48;

			}
			
		}
		
		return -1;
	}

}
