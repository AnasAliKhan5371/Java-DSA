package Lec_10;

import java.util.Scanner;

public class Kth_root {

	public static void main(String[] args) {
		//kth root
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(binary(n,k));
	}
	public static int binary(int n, int k) {
		int start=1,end=n,ans=0;
		while(start<=end) {
			int mid=(start+end)/2;
			if(Math.pow(mid, k)<=n) {
				ans=mid;
				start=mid+1;
			}
			
			else {
				end=mid-1;
			}
		}
		return ans;
	}
	}

