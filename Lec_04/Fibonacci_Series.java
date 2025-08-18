package Lec_04;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		int a=0;int b=1;
		int star=1;
		while(i<=n) {
			int j=1;
			while(j<=star) {
				System.out.print(a+"\t");
				j++;int c=0;
			c=a+b;
			a=b;
			b=c;
			}
			
			i++;
			star++;
			
			System.out.println();
		}
	}

}
