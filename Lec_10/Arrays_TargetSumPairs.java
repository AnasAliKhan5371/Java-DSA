package Lec_10;

import java.util.Scanner;

public class Arrays_TargetSumPairs {
		// sum of 2 nos. in array is 'm'
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int s = sc.nextInt();
		for(int i=0;i<n/2;i++){
			for(int j=0;j<n;j++){
			     if(arr[i]+arr[j]==s) {
			    	 System.out.println(arr[i]+" and "+arr[j]);
			     }
			 }
		 }
	}

}
