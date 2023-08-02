package testfoundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class Fimz {
	
	private void test1() {
		
		 // List<String> asList = Arrays.asList(new String[] {"1","2","FIZZ"});
		
		 // Assert.assertEquals(asList, 1fizzbuzz(3));
		  
		  List<String> asList = Arrays.asList(new String[] {"1","2","FIZZ"});
			Assert.assertEquals(asList, Fizzbuzz(3));
	}

	private Object Fizzbuzz(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Fizzbuzz(int input);{
			List<String> output = new ArrayList<String>();
			for (int i = 1; i <=input; i++) {
				
				if(i%3==0 && i%5==0) {
					output.add("FIZZ BUZZ");
				}
				else if (i%3==0) {
					output.add("FIZZ");
				}
				else if(i%5==0) {
					output.add("BUZZ");
				}
				else {
					output.add(Integer.toString(i));
				}
			}
			
			
			return output;
		}
		
	}

}
