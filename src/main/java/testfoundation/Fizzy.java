package testfoundation;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import Week3.day2.Arraylist;

	

public class Fizzy {
	
	
	@Test
	public void soluction() {
		List <String> expected =  Arrays.asList(new String[] {"1","2","FIZZ"});
		Assert.assertEquals(expected, fizzbuzz(3));

	}
	
	public List<String> fizzbuzz (int input){
		List<String> answer = new ArrayList<String>();
		for (int i = 1; i <=input; i++) {

			boolean isidivisibleby3 =(i%3==0);
			boolean isidivisibleby5 = (i%5==0);

			if(isidivisibleby3 && isidivisibleby5) {
				answer.add("FIZZBUZZ");
			}
			else if(isidivisibleby3) {
				answer.add("FIZZ"); 
			}
			else if(isidivisibleby5) {
				answer.add("BUZZ");
			}
			else {
				answer.add(Integer.toString(i));
			}
		}
		return answer;
	}
	

}

//
