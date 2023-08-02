package string;

public class Reverse {
	public static void main(String[] args) {
		String name="cognizant";
		char[] charArray = name.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
