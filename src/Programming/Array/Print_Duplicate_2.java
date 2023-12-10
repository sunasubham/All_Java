package Programming.Array;

public class Print_Duplicate_2 {
	public static void main(String[] args) {
		int n[] = { 10, 90, 50, 60, 40, 90, 10, 50, 90 };
		for(int i=0;i<n.length;i++) {
			int count=0;
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					count++;
				}
			}
			if(count==1)
				System.out.println(n[i]);
		}
	}
}
