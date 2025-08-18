package Lec_13;

public class Check_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin";
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j) ){
				return false;
		}	
			i++;
			j--;
	}return true;

}}
