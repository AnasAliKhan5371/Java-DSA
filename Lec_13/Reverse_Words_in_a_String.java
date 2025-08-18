package Lec_13;

import java.util.Scanner;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// Leetcose - ques. 151
		//
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(reverse(s));
	}
	public static String reverse(String s) {
		s=s.trim();
		String[] arr=s.split("\s+");
		String ans="";
		for(int i=arr.length-1;i>=0;i--) {
			ans=ans+arr[i]+" ";
		}
		return ans.trim();
	}

}
