package array;

public class Findcountofnum {
	 public static void main(String[] args) {
		int[] marks= {44,555,73,66,22,55,67,24,6,44,77,22,66,45,663,434,65,37,65,23,44,76,34,67,34,67,77,44,77,12,8,633,44};
		//to find the first number 
		System.out.println(marks.length);
		//to find the last number
		System.out.println(marks[marks.length-1]);
		//to find the count of 44
		/*int f=44;
		int result=0;
		for (int i = 0; i<marks.length; i++) {
			if(marks[i]==f) {
				result++;
			}
		}
		System.out.println(result);*/
		for (int i = marks.length-1; i >=0; i--) {
			System.out.println(marks[i]);
		}
	}

}
