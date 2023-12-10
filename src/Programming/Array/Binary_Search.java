package Programming.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n[]= {10,30,40,90,70,50,60,40,20,80};
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		System.out.println("Enter the value");
		int target=sc.nextInt();
		
		int first=0,last=n.length-1, mid=0;
		boolean flag=false;
		for(int i=0;i<n.length;i++) {
			mid=(first+last)/2;
			if(n[mid]==target) {
				flag=true;
				break;
			}
			else if(n[mid]<target) {
				first=mid+1;
			}
			else if(n[mid]>target) {
				last=mid-1;
			}
		}
		if(flag==true)
			System.out.println(target +" : is present in index of : "+mid);
		else {
			System.out.println("it is a invalid target");
		}
	}
}
