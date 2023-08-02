package testfoundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Fedfd {
	
	@Test
	public void test1() {
		List<String> expected = Arrays.asList(new String[] {"1", "2", "Fizz"});
		Assert.assertEquals(expected, fizzBuzz(3));
	}
	
	@Test
	public void test2() {
		List<String> expected = Arrays.asList(new String[] {"1", "2", "Fizz", "4", "Buzz"});
		Assert.assertEquals(expected, fizzBuzz(5));
	}
	
	/*
	 * 1. Create an output list
	 * 2. Traverse from 1 to n
	 * 3. if i is divisble by 3 and 5, add "FizzBuzz" to output
	 * 4. else if it is divisible by 3, add "Fizz" to output
	 * 5. else if it is divisible by 5, add "Buzz" to output
	 * 6. else add i as a string
	 * 7. Return the output list
	 * 
	 */
	
	public List<String> fizzBuzz(int input){
		List<String> output = new ArrayList<String>();
		for (int i = 1; i <= input; i++) {
			if (i%3==0 && i%5==0) {
				output.add("FizzBuzz");
			} else if (i%3==0) {
				output.add("Fizz");
			} else if (i%5==0) {
				output.add("Buzz");
			} else {
				output.add(Integer.toString(i));
			}
		}
		
		return output;
	}

}
