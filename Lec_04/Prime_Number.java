package Lec_04;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=2;
		int count=0;
		while(i<n) {
			if(n%i==0) {
				count++;break;	//count complete divisions 
			}
		i++;	
		}
		if(count==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}

	}

}
