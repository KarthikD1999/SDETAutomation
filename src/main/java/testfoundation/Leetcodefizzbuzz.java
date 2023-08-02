package testfoundation;

import java.util.ArrayList;
import java.util.List;

public class Leetcodefizzbuzz {

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
            // Print the current element added to the answer list
          //  answer.toString(answer
		}
		return answer;
	}
	public static void main(String[] args) {
        Leetcodefizzbuzz fizzBuzz = new Leetcodefizzbuzz();
        fizzBuzz.fizzbuzz(3);
        System.out.println(fizzBuzz); // Example usage of the fizzbuzz method
	}
}

