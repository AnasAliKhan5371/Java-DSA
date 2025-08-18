package Lec_13;

import java.util.Iterator;

public class String_LexoGraphic_Order {

	public static void main(String[] args) {
		//  compate to () - integer method
		//  ascii values
		//  +ve s1>s2
		//  -ve s2>s1
		/*String s1="komal";
		String s2="kamal";
		System.out.println(s1.compareTo(s2));//14
		String s3="raj";
		String s4="rajesh";
		System.out.println(s3.compareTo(s4));//-3
		String s5="kaju";
		String s6="raju";
		System.out.println(s5.compareTo(s6));//-7
	*/
		String s1="komal";
		String s2="kamal";
		System.out.println(s1.compareTo(s2));
	}
	public static int equal(String s1, String s2) {
		
		if(s1==s2) {
			return 0;
		}
		//find minimum length string for loop
		int min=Math.min(s1.length(), s2.length());
		for(int i=0;i<min;i++) {
			if(s1.charAt(i)!=s2.charAt(i) ){
				return s1.charAt(i)-s2.charAt(i);
			
		}
		}
		return s1.length()-s2.length();
	}
}
