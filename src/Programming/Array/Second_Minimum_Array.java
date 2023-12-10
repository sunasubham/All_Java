package Programming.Array;

import java.util.Arrays;

public class Second_Minimum_Array {
	/**
	 * approach 1
	 * @param n
	 */
	public static void approach_1(int n[]) {
		int max=n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]>max) {
				max=n[i];
			}
		}
		int mini=max,secmini=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]<mini) {
				secmini=mini;
				mini=n[i];
			}
			else if(n[i]<secmini && n[i]!=mini) {
				secmini=n[i];
			}
		}
		System.out.println(secmini);
	}
	/**
	 * approach 2
	 * @param n
	 */
	public static void approach_2(int n[]) {
		Arrays.sort(n);
		int mini=n[n.length-1],secmini=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]<mini) {
				secmini=mini;
				mini=n[i];
			}
			else if(n[i]<secmini && n[i]!=mini) {
				secmini=n[i];
			}
		}
		System.out.println(secmini);
	}
	public static void main(String[] args) {
		int n[]= {10,90,20,60,40,80,60,40,10,30,40,20};
		System.out.println(Arrays.toString(n));
		approach_1(n);
		approach_2(n);
	}
}
