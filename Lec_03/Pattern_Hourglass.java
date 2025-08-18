package Lec_03;

import java.util.Scanner;

public class Pattern_Hourglass {

	public static void main(String[] args) {
		//  5 4 3 2 1 0 1 2 3 4 5
        //    4 3 2 1 0 1 2 3 4 
		//      3 2 1 0 1 2 3 
		//        2 1 0 1 2 
		//          1 0 1 
		//            0 
		//          1 0 1 
		//        2 1 0 1 2  
		//      3 2 1 0 1 2 3 
		//    4 3 2 1 0 1 2 3 4 
		//  5 4 3 2 1 0 1 2 3 4 5 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int star = 2*n+1;
		int space = 0;
		int val = n;
		while(i<=2*n+1) {
			int k=1;
			while(k<=space) {
				System.out.print("  ");
				k++;
				}
			
				int j=1;int p=val;
			while(j<=star) {
				System.out.print(p+" ");
				if(j<=star/2) {
					p--;
				}
				else {
					p++;
				}
				j++;
			
			}
			if(i<n+1) {
				star-=2;
				space++;val--;
			}
			else {
				star+=2;
				space--;val++;
			}
			i++;
			System.out.println();
			
		}
	}

}
