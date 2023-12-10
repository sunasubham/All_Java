package Programming.String;

public class Occurance_Wrod {
	public static void approach_1(String str) {
		String temp="";
		String spl[]=str.split(" ");
		for(int i=0;i<spl.length;i++) {
			int count=1;
			for(int j=i+1;j<spl.length;j++) {
				if(spl[i].equalsIgnoreCase(spl[j])) {
					count++;
					spl[j]="";
				}
			}
			if(spl[i]!="" && spl[i]!=" ")
			System.out.println(spl[i]+" : "+count);
		}
	}
	public static void main(String[] args) {
		String str="Big bang big is a big bang big";
		approach_1(str);
	}
}
