package Programming.Array;

import java.util.Arrays;

public class Larget_Number_Array {
	/**
	 * this is an one approach to find the largest number in an Array
	 * @param n
	 */
	public static void maximum_1(int []n) {
		int max=n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]>max) {
				max=n[i];
			}
		}
		System.out.println("Larget number in an Array");
		System.out.println(max);
	}
	/**
	 * this is a second approach to find the second maximum number in an Array
	 * @param n
	 */
	public static void maximum_2(int []n) {
		Arrays.sort(n);
		System.out.println("Larget number in an Array");
		System.out.println(n[n.length-1]);
	}
	public static void main(String[] args) {
		int n[] = { 35, 6, 94, 78, 18, -65, 54, -36, 64,48 };
		System.out.println(Arrays.toString(n));
		
		maximum_1(n);
		maximum_2(n);
	}
}
