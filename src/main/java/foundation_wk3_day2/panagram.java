package accsii;

import org.junit.Test;

import junit.framework.Assert;

public class panagram {
	
	
	@Test
	public void testcase1() {
		// TODO Auto-generated method stub

		Assert.assertEquals(false, output("wasbxpjtsp"));
	}
	
	@Test
	public void testcase2() {
		// TODO Auto-generated method stub

		Assert.assertEquals(true, output("thequickbrownfoxjumpsoverthelazydog"));
	}
	
	public boolean output(String sentence) {
		// TODO Auto-generated method stub

		  int[] temp= new int[26];
	        char[] chr1 =  sentence.toCharArray();
	        for(int i=0;i < chr1.length;i++){
	            //char a = sentence.charAt(i);
	            temp[chr1[i]-'a']++;
	        }
	        int count=0;
	        for(int i=0;i<temp.length;i++){

	            if(temp[i]>=1){
	                count++;
	            }
	        }
	        if(count==26){
	        return true ;
	        }
	        return false;

		
		
		
		
	}

}
