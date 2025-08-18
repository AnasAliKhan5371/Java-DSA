package Assignment3;

import java.util.Scanner;

public class VonNeuman {

	public static void main(String[] args) {
		// Decimal to binary
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}int[] arr1 = new int [n];
		
        
        for (int i = 0; i < n; i++) {// Decimal to binary
        	int sum=0;
    		int count=1;
    		int m=arr[i];
    		while (m > 0) {
    		int rem=m%10;		
    		sum=sum+rem*count;
    		count*=2;
    		m/=10;	
    		arr1[i]=sum;
    		}
    		
            }
        for(int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
 
            
	}
	}