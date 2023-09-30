package foundation_wk3_day2;

import java.nio.Buffer;
import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Faultykeyboard {

	@Test
	public void test1() {
		// TODO Auto-generated method stub
		Assert.assertEquals("rtsng", result("string",'i'));
	}

	@Test
	public void test2() {
		// TODO Auto-generated method stub
		Assert.assertEquals("bala", result("bala",'i'));
	}
	@Test
	public void test4() {
		// TODO Auto-generated method stub
		Assert.assertEquals("r", result("r",'i'));
	}
	@Test
	public void test3() {
		// TODO Auto-generated method stub
		Assert.assertEquals("vdrng", result("driving",'i'));
	}
	//dr rdv vdrng

	public String result(String input,char faulty) {
		if(input.length()<2) 
			return input;
		else if  (input.indexOf('i')<1) 
			return input;
		else {

			StringBuilder buf = new StringBuilder(input.replace("i","").length());
			for (int i = 0; i < input.length(); i++) {
				if(input.charAt(i)=='i') {
					buf.reverse();
				}
				else {
					buf.append(input.charAt(i));
				}
			}
			return buf.toString();
		}
	}
}
