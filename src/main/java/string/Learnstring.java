package string;

public class Learnstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyname= "Testleaf";
		String company = new String("Testleaf"); 
		String chr1= "testleaf";
		String chr2 = new String("Testleaf"); 
		//Methods
		//1)toCharArray()
		//2)equals()
		//3)contains()
		//4)indexat()
		//5)charat()
		//6)length()
		int length = companyname.length();
		System.out.println(length);
		char[] charArray = companyname.toCharArray();
		System.out.println(charArray);
		boolean equals = companyname.equals(company);
		System.out.println(equals);
		boolean contains = companyname.contains(company);
		System.out.println(contains);
		char charAt = companyname.charAt(0);
		System.out.println(charAt);
		int indexOf = companyname.indexOf('T');
		System.out.println(indexOf);
		boolean equalsIgnoreCase = chr1.equalsIgnoreCase(chr2);
		System.out.println(equalsIgnoreCase);
	}

}
