package Lec_04;

import java.util.Scanner;

public class Inverted_Hourglass {

	public static void main(String[] args) {
		
		
		//  5                   5
		//  5 4               4 5
		//  5 4 3           3 4 5
		//  5 4 3 2       2 3 4 5
		//  5 4 3 2 1   1 2 3 4 5
		//  5 4 3 2 1 0 1 2 3 4 5
		//  5 4 3 2 1   1 2 3 4 5
		//  5 4 3 2       2 3 4 5
		//  5 4 3           3 4 5
		//  5 4               4 5
		//  5                   5
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int star = 1;
		int space = 2*n-1;
		
		while(i<=2*n+1) {
			int val = n;
			int j=1;
			while(j<=star) {	//star loop
				System.out.print(val+" ");
				j++;
				val--;
				
			}
			int k=1;
			while(k<=space) {	//space loop
				System.out.print("  ");
				k++;
				}
			
				
				int l=1;
				if(l==1)
					val++;
				if(i==n+1)
					{l=2;val++;
					}
				while(l<=star) {	//star loop
					System.out.print(val+" ");
				
						val++;l++;
					
			}
			if(i<=n) {
				star++;
				space-=2;
			}
			else {
				star--;
				space+=2;
			}
			i++;
			System.out.println();
			
		}
	}

}


	