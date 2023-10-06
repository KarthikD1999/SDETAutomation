package accsii;

import org.junit.Test;

import junit.framework.Assert;

public class StoneandJewels {
	
	@Test
	public void soluction() {
		// TODO Auto-generated method stub
		
		String Jewels="uvw";
		String stones="uvwxyZUVW";
		Assert.assertEquals(3, output(Jewels,stones));

	}
	@Test
	public void soluction1() {
		// TODO Auto-generated method stub
		
		String Jewels="z";
		String stones="ZZ";
		Assert.assertEquals(0, output(Jewels,stones));

	}
	
	public int output(String jewel,String stone) {

		
		boolean[] isjewel = new boolean[128];
		
		for (int i = 0; i < jewel.length(); i++) {
			
			char j = jewel.charAt(i);
			isjewel[j]= true;
		}
		
		int jewelscount= 0;
		
		for (int i = 0; i < stone.length(); i++) {
			
			char s = stone.charAt(i);
			if(isjewel[s]) {
				jewelscount++;
			}
		}
		
		return jewelscount;
	}

}
