package Lec_13;
import java.util.*;
public class Good_String {

	public static void main(String[] args) {
		// A Good String is a string which
		// contains only vowels (a,e,i,o,u).
		//codeskiller
		//  O(N)
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(good(s));
	}
	public static int good(String s) {
		int ans=0,count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(isvowel(ch)==true) {
				count++;
			}
			else {
				ans=Math.max(ans, count);
				count=0;
			}
			}
			ans=Math.max(ans, count);
			return ans;
		
	}
	public static boolean isvowel(char ch) {
		if(ch=='a'|| ch=='e'|| ch== 'i'|| 
				ch=='o'|| ch=='u') {
			return true;
		}
		return false;
	}

}
