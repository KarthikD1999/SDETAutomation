package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Stringanagram {
	
	
	@Test
	public void test1() {
		List<Integer> out = new ArrayList<Integer>();
		out.add(0);
		out.add(6);
		Assert.assertEquals(out, anagram("cbaebabacd","abc"));
	}
	
	@Test
	public void test2() {
		List<Integer> out = new ArrayList<Integer>();
		out.add(0);
		out.add(1);
		out.add(2);
		Assert.assertEquals(out, anagram("abab", "ab"));
	}
	
	
	//c b a e b a b a c d

	public List<Integer> anagram(String s, String p) {
		char[] chr1 = p.toCharArray();
		Arrays.sort(chr1);
		String str1 = String.valueOf(chr1);
		int a = 0, b = 0, count = p.length();
		List<Integer> out = new ArrayList<Integer>();
		String tempstring = "";

		while (a < s.length() - count + 1) {
			tempstring += s.substring(a, b + count);
			char[] strch = tempstring.toCharArray();
			Arrays.sort(strch);
			String str2 = String.valueOf(strch);
			if (str1.equalsIgnoreCase(str2)) {
				out.add(a);
			}
			a++;
			b = a;
			tempstring = "";
		}
		return out;

}
}