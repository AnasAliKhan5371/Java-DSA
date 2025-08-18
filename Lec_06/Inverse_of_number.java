package Lec_06;
import java.util.*;
public class Inverse_of_number {

	public static void main(String[] args) {
//		Assume that for a number of n digits, 
//		the value of each digit is from 1 to n and is unique.
//		E.g. 32145 is a valid input number.
//		Inverse of 32145 is 12543. In 32145, “5” is at
//		1st place, therefore in 12543, “1” is at 5th place; 
//		in 32145, “4” is at 2nd place, therefore in 12543,
//		“2” is at 4th place.	
		
		Scanner sc =new Scanner(System.in);//32145
		int n = sc.nextInt();
		int b=inverse(n);
		System.out.println(b);

    }
	public static int inverse(int n){
		int sum=0,pos=1;
		while(n>0){
			int rem=n%10;
			sum+=pos*Math.pow(10,rem-1);
			pos++;
			n/=10;
			
		}return sum;
	}
}