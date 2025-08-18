package Lec_04;

import java.util.Scanner;

public class Sum_of_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		while (n != 0) {
		int r=n%10;		//pick last digit
		sum+=r;		
		n/=10;			//remove last digit
		}
		System.out.println(sum);
	}

}

