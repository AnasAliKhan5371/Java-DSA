package Lec_10;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		//binary search
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();}
		int item = sc.nextInt();
		System.out.println(binary(arr,item));
	}
	public static int binary(int[] arr, int item) {
		int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}

}
