package Programming.Array;

import java.util.Arrays;

public class Minimum_Number {
	/**
	 * this method use for find the minimum element in an Array
	 * @param n
	 */
	public static void minimum_1(int []n) {
		int mini=n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]<mini) {
				mini=n[i];
			}
		}
		System.out.println("Minimum Element in an Array");
		System.out.println(mini);
	}
	public static void minimum_2(int []n) {
		Arrays.sort(n);
		System.out.println("Minimum Element in an Array");
		System.out.println(n[0]);
		
	}
	public static void main(String[] args) {
		int n[] = { 10, 90, 50, 60, 40, 90, 10, 50, 90 };
		System.out.println(Arrays.toString(n));
		minimum_1(n);
		minimum_2(n);
	}
}
