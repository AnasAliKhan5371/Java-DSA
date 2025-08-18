package Lec_04;

import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {

	public static void main(String[] args) {
		  //                1 
	      //            2 1   1 2 
	      //        3 2 1       1 2 3 
          //	4 3 2 1           1 2 3 4 
	      //        3 2 1       1 2 3 
	      //            2 1   1 2 
	      //                1 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;		
		int star = 1;
		int space1 = n-1;
		int space2=-1;
		int val=1;
		while (i <= n) { //row loop
			int j= 1;
			int p =val;
			while (j <= space1) //space loop
			{
				System.out.print("  ");
				j++;
			}
			int k= 1;
			
			while (k<= star) //star loop
			{
				System.out.print(p+" ");
				k++;
				if(p>1)
					p--;
			}
			int l= 1;
			
			while (l <= space2) //space loop
			{
				System.out.print("  ");
				l++;
			}
			int m= 1;
			if(i==1||i==n) {
				m=2;
			}
			while (m <= star) //star loop
			{
				System.out.print(p+" ");
				m++;p++;
			}	
			


		 if(i<(n+1)/2) {
			 space1-=2;
			 space2+=2;
			 star++;
			 val++;
		 }
		 else{
			 space1+=2;
			 space2-=2;
			 star--;
			 val--;
		 }
			i++;
			System.out.println();
		}

	}

}
