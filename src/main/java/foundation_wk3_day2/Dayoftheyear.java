package foundation_wk3_day2;

import org.junit.Test;

import junit.framework.Assert;

public class Dayoftheyear {
	
	
	
	@Test
	public void test() {
		
		Assert.assertEquals(122, dayoftheyear("2023-05-02"));

	}
	
	public int dayoftheyear(String date) {
		
		
		int addday=0;
		date.toCharArray();
		String y = date.substring(0, 4);
		int year = Integer.parseInt(y);
		String m = date.substring(5, 7);
		int month = Integer.parseInt(m);
		String d= date.substring(8,10);
		int day = Integer.parseInt(d);

		int[] months= new int[]  {31,28,31,30,31,30,31,31,30,31,30,31};
		//System.out.println(day);
		
		for (int i = 0; i<month-1; i++) {
			
			
			addday=addday+months[i];
			
		}
		System.out.println(addday);

		addday=addday+day;
		
		
		return addday;

	}

}
//