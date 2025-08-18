package Lec_10;

import java.util.Scanner;

public class Squares_of_sorted_array {

	public static void main(String[] args) {
		// square an array and sort it
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		
		for(int i=0;i<n;i++){		//square the array
		     arr[i]=arr[i]*arr[i];
		 }sort(arr);
		 for(int i=0;i<n;i++){		//square the array
		    System.out.print(arr[i]);
		 }
	}
	public static void sort(int [] arr) { //sorting	
		int n=arr.length;
		for(int turn=1;turn<n;turn++) {
			for(int i=0;i<n-turn;i++){
			     if(arr[i]>arr[i+1]) {
			    	 int temp=arr[i];	//swap
			    	 arr[i]=arr[i+1];
			    	 arr[i+1]=temp;
			     }
			 }
		}
	}


	}
	