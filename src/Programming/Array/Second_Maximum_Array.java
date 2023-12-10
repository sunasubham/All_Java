package Programming.Array;

import java.util.Arrays;

public class Second_Maximum_Array {
	public static void approach_1(int n[]) {
		Arrays.sort(n);
		int max=n[0],secmax=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]>max) {
				secmax=max;
				max=n[i];
			}
			else if(n[i]>secmax && n[i]!=max) {
				secmax=n[i];
			}
		}
		System.out.println(secmax);
		
	}
	public static void approach_2(int n[]) {
		int mini=n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]<mini) {
				mini=n[i];
			}
		}
		int max=mini,secmax=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]>max) {
				secmax=max;
				max=n[i];
			}
			else if(n[i]>secmax && n[i]!=max) {
				secmax=n[i];
			}
		}
		System.out.println(secmax);
	}
	public static void main(String[] args) {
		int n[]= {10,90,20,60,40,80,60,40,10,30,40,20};
		System.out.println(Arrays.toString(n));
		approach_1(n);
		approach_2(n);
	}
}
