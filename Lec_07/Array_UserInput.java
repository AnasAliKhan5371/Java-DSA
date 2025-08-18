package Lec_07;

import java.util.Iterator;
import java.util.Scanner;

import Lec_04.For_Loop;

public class Array_UserInput {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//371
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		display(arr);
	}
	public static void display(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
