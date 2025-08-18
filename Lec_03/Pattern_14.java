package Lec_03;

import java.util.*;

public class Pattern_14 {

	public static void main(String[] args) {
			//          *
			//        * *
			//      * * *
			//    * * * *
			//  * * * * *
			//    * * * * 
			//      * * *
			//        * *
			//          *
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();	//input
			int i=1;  //row counter
			int j=1;  //column pointer
			int space=n-1;
			int star=1;
			while(i<=2*n-1) {     //row loop
				j=1;
				while(j<=space) {		//space loop
					System.out.print("  ");	//print space
					j++;
				}int k=1;
				while(k<=star) {  		//column loop
					System.out.print("* ");  //print star
					k++;
				}
				
				if(i<n) {
				space--;
				star++;}
				else
				{
					space++;
					star--;
				}
				i++;
				System.out.println();  //row increment
			}
	}

}
