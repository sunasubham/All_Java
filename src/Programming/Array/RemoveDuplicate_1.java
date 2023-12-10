package Programming.Array;

public class RemoveDuplicate_1 {
	public static void main(String[] args) {
		int n[] = { 10, 90, 50, 60, 40, 90, 10, 50, 90 };
		for(int i=0;i<n.length;i++) {
			int count=1;
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					count++;
					n[j]=0;
				}
			}
			if(count==1 && n[i]!=0)
				System.out.println(n[i]+" : "+count);
		}
	}
}
