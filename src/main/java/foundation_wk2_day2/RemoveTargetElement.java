package foundation_wk2_day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTargetElement {

	@Test
	public void test() {

		int[] input = {1,3,4,5,2,2};
		List<Integer> Explist = Arrays.asList(new Integer[] {1,4,5,2,2});
		List<Integer> checkndRemoveTargetEle = checkndRemoveTargetEle(input, 3);
		Assert.assertEquals(Explist, checkndRemoveTargetEle);
	}

	public List<Integer> checkndRemoveTargetEle(int[] input, int target) {
		// TODO Auto-generated method stub
		List<Integer> op = new ArrayList<Integer>();
		for (int i = 0; i <input.length; i++) {
			if(input[i]!=target) {
				op.add(input[i]);
			}

		}
		return op;
	}

}


/*input int[] 
 *out int[]
 *initialize target element
 *iterate over the array and compare
 *remove that particular element from array
 *return the array
 *
 */
