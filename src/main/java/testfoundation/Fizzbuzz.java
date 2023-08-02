package testfoundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class Fizzbuzz {
	

@Test
public void test() {
	
		List <String> expected =  Arrays.asList(new String[] {"1","2","FIZZ"});
		Assert.assertEquals(expected, fizzbuzz(3));
}
	
	public List<String> fizzbuzz (int input){
		List<String> output = new ArrayList<String>();
		for ( int i = 1; i <=input; i++) {
			if(i%3==0 && i%5==0) {
				output.add("FIZZBUZZ");
			}
			else if(i%3==0) {
				output.add("FIZZ");
				
			}
			else if (i%5==0) {
				output.add("BUZZ");
			}
			else {
				output.add(Integer.toString(i));
			}
		}
		
		
		return output;
	}
	
}
//
