package Programming.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n[]= {10,30,40,90,70,50,60,40,20,80};
		System.out.println(Arrays.toString(n));
		System.out.println("Enter the target");
		int target=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<n.length;i++) {
			if(n[i]==target) {
				flag=true;
				System.out.println("this "+target+" number is present in index: "+i);
				break;
			}
		}
		if(flag==false)
			System.out.println("invalid target");
	}
}
