package Programming.Array;

import java.util.Arrays;

public class Bubble_Sort {
	/**
	 * this is an one approach for Ascending order 
	 * @param n
	 */
	public static void Ascending_Order_1(int []n) {
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(n[i]<n[j]) {
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		System.out.println("Ascending order");
		System.out.println(Arrays.toString(n));
	}
	/**
	 * this is a second approach for Ascending order
	 * @param n
	 */
	public static void Ascending_Order_2(int []n) {
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length-1;j++) {
				if(n[j]>n[j+1]) {
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		System.out.println("Ascending order");
		System.out.println(Arrays.toString(n));
	}
	/**
	 * this is an one approach for Descending order
	 * @param n
	 */
	public static void Descending_Order_1(int n[]) {
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(n[i]>n[j]) {
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		System.out.println("Descending order");
		System.out.println(Arrays.toString(n));
	}
	/**
	 * this is a second approach for Descending order
	 * @param n
	 */
	public static void Descending_Order_2(int []n) {
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length-1;j++) {
				if(n[j]<n[j+1]) {
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		System.out.println("Descending order");
		System.out.println(Arrays.toString(n));
	}
	/**
	 * in this approach we use inbuilt method 
	 * @param n
	 */
	public static void Ascending_Order_3(int n[]) {
		Arrays.sort(n);
		System.out.println("Ascending order");
		System.out.println(Arrays.toString(n));
	}
	
	public static void Descending_Order_3(int n[]) {
		Arrays.sort(n);
		System.out.println("Descending order");
		for(int i=n.length-1;i>=0;i--) {
			if(i==n.length-1)
				System.out.print("[");
			System.out.print(n[i]);
			if(i!=0)
				System.out.print(", ");
			if(i==0)
				System.out.print("]");
		}
	}
	
	public static void main(String[] args) {
		int n[] = { 35, 6, 94, 78, 18, -65, 54, -36, 64,48 };
		System.out.println(Arrays.toString(n));
		
		Ascending_Order_1(n);
		Descending_Order_1(n);
		Ascending_Order_2(n);
		Descending_Order_2(n);
		Ascending_Order_3(n);
		Descending_Order_3(n);
		
	}
}
