package foundation_wk3_day2;


import junit.framework.Assert;

public class CheckAbeforeB {
	
	@org.junit.Test
	public void test() {
		
		Assert.assertEquals(true,check("aaabbb"));

	}
	@org.junit.Test
	public void test1() {
		
		Assert.assertEquals(true,check("bbbb"));

	}
	
	public boolean check(String word) {
		
		int a=word.lastIndexOf('a');
		int b= word.indexOf('b');
		if(a<b) {
			return true;
		}
		return false;
	
	}

}
