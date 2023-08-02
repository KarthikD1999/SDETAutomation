package foundation_wk3_day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Selfdividingnum {
	
	
	@Test
	public void soluction() {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
		Assert.assertEquals(list,selfdivisible(1,22));
		
		
	}
	
	
	private boolean mainmethod(int n) {
		
		int num=n;//12
		while(num>0) {//true
			int remainder= num%10;//
			num=num/10;
			if(remainder==0 || n%remainder !=0 ) {
				return false;
			}
		}
		
		return true;

	}
	
	
	public List<Integer> selfdivisible(int left,int right) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = left; i <=right; i++) {
			
			if(mainmethod(i)==true) {
				result.add(i);
			}
			
		}
		
		return result;
	}
	
	

}
