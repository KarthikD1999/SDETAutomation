package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Lastword {

	@Test
	public void test() {
		
		Assert.assertEquals(5, lastword(" Hello World "));

	}
	
	public int lastword(String word) {
		
		int count=0;
		String wrd=word.trim();
		return	count= wrd.substring(wrd.lastIndexOf(" ")+1,wrd.length()).length();
	
		
	}
	
}
