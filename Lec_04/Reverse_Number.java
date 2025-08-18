package Lec_04;

import java.util.Scanner;

public class Reverse_Number {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int rev=0;

	
	while (n > 0) {
	int rem=n%10;
    if(rem==0)
        rem=5;		//pick last digit
	rev=rev*10+rem;
	n/=10;				//remove last digit
	}
		int r=0;
	while (rev>0) {
	int rem=rev%10;
   		//pick last digit
	r=r*10+rem;
	rev/=10;				//remove last digit
	}System.out.println(r);
}}

