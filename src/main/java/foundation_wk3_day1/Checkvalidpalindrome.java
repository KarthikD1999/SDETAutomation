package foundation_wk3_day1;

import org.junit.Assert;
import org.junit.Test;

public class Checkvalidpalindrome {

	
	
	@Test
	public void test2() {
	
		Assert.assertEquals(true, checkpalindrome("A man, a plan, a canal: Panama"));
		
		
	}
	
	public boolean checkpalindrome(String input) {
		//String changed=	input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String changed =input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		String org = changed;
		String rev ="";
		for (int i = changed.length(); i >=0; i--) {
			
			rev=rev+changed.charAt(i);
			
		}
		return rev.equals(org);
		//System.out.println(ans);

	}
	
}
