package foundation_wk2_day2;

import org.junit.Assert;
import org.junit.Test;

public class Movezeros {

	@Test
	public void soluction() {
		
		Assert.assertArrayEquals(new int[] {1,3,12,0,0}, movezero(new int[] {0,1,0,3,12}));

	}
	
	public int[] movezero(int[] input) {
		
		
		int nz=0;
		int z=0;
		while(nz<input.length) {
		

				if(input[nz]!=0) {
					
					int temp = input[nz];
					input[nz]=input[z];
					input[z]=temp;
					z++;
					nz++;
					
				}
				else {
					nz++;
				}
				
		}
		
		return input;

	}
	
}
