package array;

import java.util.Arrays;

public class Arraytest {
	public static void main(String[] args) {
		int[] nums = {22,3981,-22,82,0,45,29};
		Arrays.sort(nums);
		System.out.println("smallest number is"+" "+nums[0]);
		System.out.println("Laregedt number is "+nums[nums.length-1]);
	}
}
