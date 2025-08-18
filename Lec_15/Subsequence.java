package Lec_15;

public class Subsequence {
	public static void main(String[] args) {
		String s="abc";
		sub(s,"");
		System.out.println(count(s,""));;
	}
	
	
	
	public static void sub(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		sub(ques.substring(1),ans);
		sub(ques.substring(1),ans+ch);
	}
	
	public static int count(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int a1=count(ques.substring(1),ans);
		int a2=count(ques.substring(1),ans+ch);
		return a1+a2;
	}
}
