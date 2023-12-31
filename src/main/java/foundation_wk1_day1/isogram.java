package foundation_wk1_day1;

import org.junit.Assert;
import org.junit.Test;

public class isogram {

	@Test
	public void test() {
		Boolean actual=isogram("stop");
		Assert.assertEquals(true, actual);
	}
	@Test
	public void testtwo() {
		Boolean actual=isogram("test");
		Assert.assertEquals(true, actual);
	}
	

	public Boolean isogram (String input) {
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length-1; i++) {
			for (int j =i+1 ; j < charArray.length-1; j++) {
				if(charArray[i]==charArray[j]) {
					return false;
				}
			}
		}
		return true;
	}
}



/* 1) Did I understand the problem?  
		 * 		-> If yes, go to next step !!
		 * 
		 *    What is the input(s)? String
		 *    What is the expected output? boolean
		 *    Do I have constraints to solve the problem?
		 *    Do I have all informations to go to next step!!
		 *    // How big is your test data set will be?
		 *    
		 * 2) Test data set
		 *  	
		 *  	Minimum of 3 data set !! Positive, Edge, Negative 
		 *      Validate with the interviewer if the data set is fine by his/her assumptions
		 * 		positive : "top"
		 *		edge     :"aaa"
		 *		negative : "a"
		 * 3) Do I know how to solve it?
		 * 		
		 * 		Yes - great, // is there an alternate?
		 * 
		 * 4) Ask for hint (If you do not know how to solve)
		 *  
		 * 5) // Do I know alternate solutions as well? No
		 * 
		 * 		No - That is still fine, proceed to solve by what you know !!
		 * 
		 * 6) // If you know alternate solutions -> find out the O Notations (Performance)
		 * 
		 * 		Then, explain either both or the best (depends on the time)
		 * 
		 * 		Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
		 * 		Approach 2: Write down the options and benefits and code the best 
		 * 
		 * 7) Start always with Psuedo code 
		 * 
		 * 8) Implement them in the code (editor)
		 * 
		 * 9) Test against the different data set 
		 * 
		 * 10) If it fails, debug them to solve it !!
		 * 
		 */