package Lec_04;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		lcm(n1,n2);
	}
	public static void lcm(int n1, int n2) {
		 int lcm = (n1 > n2) ? n1 : n2;

		    // Always true
		    while(true) {
		      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
		        System.out.print(lcm);
		        break;
		      }
		      ++lcm;
		    }
	}

}
