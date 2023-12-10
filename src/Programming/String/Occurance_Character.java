package Programming.String;

public class Occurance_Character {
	
	public static void approach_1(String str) {
		String temp="";
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			int count=1;
			if(temp.indexOf(ch1)==-1) {
				for(int j=i+1;j<str.length();j++) {
					char ch2=str.charAt(j);
					if(ch1==ch2) {
						count++;
					}
				}
				if(ch1!=' ')
				System.out.println(ch1+" : "+count);
				temp+=ch1;
			}
		}
	}
	public static void approach_2(String str) {
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<str.length();i++) {
				char c=str.toLowerCase().charAt(i);
				if(ch==c)
					count++;
			}
			if(count!=0)
				System.out.println(ch+" : "+count);
		}
	}
	
	public static void main(String[] args) {
		String str="Java is very easy";
		approach_1(str);
		approach_2(str);
	}
}
