package testfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class Validpalindrome {
	
	@Test
	public void test1() {
		
		Assert.assertEquals(true,ispalindrome("A man, a plan, a canal: Panama"));
		
	}
	
	public boolean ispalindrome(String input) {
		String exp="";
		String org = input.replaceAll("[^a-zA-Z09]","").toLowerCase();
		String answer= org;
		for (int i = org.length()-1; i>=0; i--){
			
			
			exp=exp+org.charAt(i);
			
		}
		
		return  exp.equals(answer);
	}

}
