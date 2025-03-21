package task;
import java.util.Scanner;

public class Stringvow {
	
	public static void main(String args[]) {
	
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String[] str1= {"a","e","i","o","u","A","E","I","O","U"};
		int cnt=0;
		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//				cnt++;
			for(int j=0;j<str1.length;j++) {
				if(str.charAt(i)==str1[j].charAt(0)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt); 
		
	}

	
}
