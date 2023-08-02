package string;

public class Duplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dup="testleaf";
		char s='t';
		int c=0;
		char[] chr1 = dup.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			if(chr1[i]==s) {
			c++;
			}
		}
		System.out.println(c);
	}

}
