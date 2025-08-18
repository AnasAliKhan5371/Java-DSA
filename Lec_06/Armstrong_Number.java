package Lec_06;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//371
		int n = sc.nextInt();
		int c=count_digit(n);
		int b=arm(n,c);
		if(b==n)
		 System.out.println("Armstrong");
		else 
			System.out.println("Not Armstrong");

    }public static int count_digit(int n){
	int c=0;
		while(n>0){
			c++;
			n/=10;
			
		}return c;}
	
	public static int arm(int n,int c){
		int sum=0;
		while(n>0){
			int rem=n%10;
			sum+=Math.pow(rem,c);
			n/=10;
			
		}return sum;
	}

	}


