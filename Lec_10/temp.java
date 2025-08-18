package Lec_10;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}int a=0;
        for(int i=1;i<=n;i++) {
			a+=Math.pow(10,i);
		}
        	int sum=inverse(a);System.out.println(sum);
        	 for(int i=n;i>0;i--) {
     			
        		 arr[i]=sum%10;
        		 sum/=10;;
     		}
        	 for(int i=1;i<n;i++) {
     			System.out.print(arr[i]);
     		}

        	 
            
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