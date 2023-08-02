package testfoundation;

import org.junit.Test;

import junit.framework.Assert;

public class ShuffleString {
	@Test
	public void test() {

		String	actual= Stufflestring("codeleet",new int[] {4,5,6,7,0,2,1,3});
		Assert.assertEquals("leetcode",actual);
	}

	public String Stufflestring(String input,int[] arr) {

		String temp = input;
		char[] chararr = new char[input.length()];
		String answer= "";
		for (int i = 0; i < chararr.length; i++) {
			chararr[arr[i]] = input.charAt(i); 

		}
		answer = String.valueOf(chararr);
		return answer;
	}


}
