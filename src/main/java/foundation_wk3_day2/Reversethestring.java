package foundation_wk3_day2;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class Reversethestring {

	@Test
	public void soluction1() {

		Assert.assertEquals("yM eman si kihtraK",Reversesentance("My name is Karthik") );

	}
	
	@Test
	public void soluction3() {

		Assert.assertEquals("sdfsd43@",Reversesentance( "@34dsfds") );

	}

	public String Reversesentance(String actual) {

		//"@34dsfds" "sdfsd43@"
		String temp = "";
		String out="";
		String[] words = actual.split(" ");

		for (int i = 0; i < words.length; i++) { //My name is karthik

			for (int j = words[i].length()-1; j >=0; j--) { //Ym eman

				
				temp=temp+words[i].charAt(j);
				
			}
			
			out+=temp+" ";
			temp="";
		}	
		
		//out+=rev+" ";

		//String expected = temp.toString();
		System.out.println(out.trim());
		return out.trim();
		

	}
}



/*
 * 
 * Yes
 * Test data : 
 * 
 * "My name is Karthik", "kihtrak si eman My", 
 * " ", " "
 * "@34dsfds" "sdfsd43@"
 * 
 * bruteforce
 * pesudo code : 
 * in the given string using split method split the words in the sentance
 * using for loop iterate every words and reverse the order
 * store it in the new String and compare it with output
 * 
 * 
 * 

 * 
 */
