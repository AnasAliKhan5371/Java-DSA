package Lec_05;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//83=1010011
		int sum=0;
		int count=1;		//power of 10
		while (n > 0) {
		int rem=n%2;		//pick last digit
		
		sum=sum+rem*count;
		count*=10;
		n/=2;				//remove last digit
		}
		System.out.println(sum);
	}

}
