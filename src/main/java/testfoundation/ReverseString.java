package testfoundation;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString {

	@Test
	public void test() {


		char[] actual = new char[] {'h','e','l','l','a'} ;

		Assert.assertArrayEquals(new char[] {'h','e','l','l','a'}, reverse(actual));

	}


	public char[] reverse(char[] arr) {


		char[] newarr=new char[arr.length-1]; 
		int count=0;
		String chrtype=Character.toString();
		
		for (int i = arr.length-1; i>=0; i--) {


			newarr[count]=arr[i];
			count++;
		}
		System.out.println(newarr);
		return newarr;


	}		//count++;

}
