package Lec_10;

import java.util.Scanner;

public class First_Bad_Version {

	public static void main(String[] args) {
		//Leetcode - Ques.278
		//TLE
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(firstbad(n,k));
	}
	public static int firstbad(int n, int k) {
		int start=1,end=n,ans=0;
		while(start<=end) {
			int mid=(start+end)/2;
			if(isBadVersion(mid)==true) {
				ans=mid;
				end=mid-1;
			}
			
			else {
				start=mid+1;
			}
		}
		return ans;
	}
	}

