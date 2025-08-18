package Lec_04;

import java.util.Scanner;

public class Pattern_HollowRombus {

	public static void main(String[] args) {
		//      *****  
		//     *   *
		//    *   *
		//   *   *
		//  *****
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int star = n;
		int space = n-1;
		while (i <= n) {
			
			int j = 1;
			while (j <= space) // space 
			{	
				
				
				System.out.print(" ");
				j++;
			}
			
			int k = 1;
			
			while (k <= star) {		// star
				if(i>1&&i<n) {
					if(k>1&&k<n)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				else
					System.out.print("*");
				
				k++;
			}
		
			i++;space--;
			System.out.println();
		}

	}

}