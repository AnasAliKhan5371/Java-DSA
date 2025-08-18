package Lec_05;

import java.util.Scanner;

public class Binary_to_Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//1010011=83
		int sum=0;
		int count=1;		//power of 2
		while (n > 0) {
		int rem=n%10;		//pick last digit
		
		sum=sum+rem*count;
		count*=2;
		n/=10;				//remove last digit
		}
		System.out.println(sum);
	}

}
