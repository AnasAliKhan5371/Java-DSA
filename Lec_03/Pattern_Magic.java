package Lec_03;

import java.util.Scanner;
public class Pattern_Magic {

	public static void main(String[] args) {
		//   *********
		//   **** ****
		//   ***   ***
		//   **     **
		//   *       *
		//   **     **
		//   ***   ***
		//   **** ****
		//   *********
		int n=5;
		int i=1;
		int star=n;
		int space=-1;
		while(i<=2*n-1)		//row loop
		{int j=1;
			while(j<=star) //star loop
			{
				System.out.print("*");
				j++;
			}
			int k=1;
			while(k<=space)  //space loop 
			{
				System.out.print(" ");
				k++;
			}int l=1;
			if(i==1 || i==2*n-1)
			{
				l=2;
			}
			while(l<=star) 	//star loop
			{
				System.out.print("*");
				l++;}
			if(i<n) 	//mirror
			{
				star--;
				space+=2;
			}
			else
			{
				star++;
				space-=2;
			}
			
			System.out.println();	//row increment
            i++;
		}

	}

}
