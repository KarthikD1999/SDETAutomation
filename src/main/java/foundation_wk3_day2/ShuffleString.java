package foundation_wk3_day2;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleString {

	
	@Test
	public void test() {
		
		String actual= Shufflestring("codeleet",new int[] {4,5,6,7,0,2,1,3});
		Assert.assertEquals("leetcode", actual);
		
	}
	
	public String Shufflestring(String input,int[] arr) {
		
		char[] chararray = new char[input.length()];
		String answer = "";
		for (int i =0; i < arr.length; i++) {
			
			chararray[arr[i]] = input.charAt(i);
			
		}
		answer=String.valueOf(chararray);
		return answer;
	}	
}
