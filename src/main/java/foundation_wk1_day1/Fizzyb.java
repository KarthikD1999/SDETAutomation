package foundation_wk1_day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.junit.Assert;
import org.junit.Test;

public class Fizzyb {
	
	@Test
	public void test1() {
		List<String> expected = Arrays.asList(new String[] {"1", "2", "Fizz"});
		Assert.assertEquals(expected, FIZZBUZZ(3));
	}
	
	@Test
	public void test2() {
		List<String> expected = Arrays.asList(new String[] {"1", "2", "Fizz", "4", "Buzz"});
		Assert.assertEquals(expected, FIZZBUZZ(5));
	}
	
	public List<String> FIZZBUZZ(int input) {
		List<String> output = new ArrayList<String>();
		for (int i = 1; i <=input; i++) {
			if(i%3==0 && i%5==0) {
				output.add("FizzBuzz");
			}
			else if(i%3==0) {
				output.add("Fizz");
				
			}
			else if (i%5==0) {
				output.add("Buzz");
			}
			else {
				output.add(Integer.toString(i));
			}
		}
		
		return output;
	}

}
