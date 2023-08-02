package testfoundation;

import org.junit.Assert;
import org.junit.Test;

public class BiggestCharacter {
	
	
	@Test
	public void question() {
		
		char[] ch = {'b','d','h'};
		Assert.assertEquals('h',character(ch,'e'));
		
	}
	@Test
	public void question1() {
		
		char[] ch = {'a','b','d','h','i','k'};
		Assert.assertEquals('j',character(ch,'h'));
		
	}
	
	public char character(char[] arr,char target) {
		
		for (int i = 0; i < arr.length; i++) {
			if(target<arr[i]) {
				return arr[i];
			}
		}
		
		return target;

	}

}
