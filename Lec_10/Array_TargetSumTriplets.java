package Lec_10;

import java.util.Scanner;

public class Array_TargetSumTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
	}
		int t = sc.nextInt();
		sort(arr);
		triplet(arr,n,t);
	}
	public static void triplet(int[] arr, int n,int t) {
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if (arr[i] + arr[j] + arr[k] == t) {
                        System.out.println(arr[i] + ", " + arr[j]+ " and " + arr[k]);

                                                }
					
			}
		}
	}
	}
	public static void sort(int [] arr) {
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
