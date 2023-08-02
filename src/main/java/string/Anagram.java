package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String charr = "hello";
		String chars = "elloh";
		boolean isanagram;
		char[] chr1 = charr.toCharArray();
		char[] chr2 = chars.toCharArray();
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		for (int i = 0; i < chr1.length; i++) {
			if(chr1[i]!=chr2[i]) {
				System.out.println("Given wird is not anagram");
				isanagram=false;
			}
		}
		if(isanagram=true) {
			System.out.println("The given word is anagram");
		}
		
	}

}
