package Lec_03;

import java.util.Scanner;
public class Pattern_26 {

	public static void main(String[] args) {
		
		 //         1
		//        1 2 3
		//      1 2 3 4 5
		//    1 2 3 4 5 6 7
		//  1 2 3 4 5 6 7 8 9
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();int star =1;
		int i=1;	//row counter
		int j=1;	//star counter
		int space=n-1;
		
		while(i<=n) {     //row loop
			int k=1;int val=1;
			while(k<=space) {		//space loop
				System.out.print("\t");	//print space
				k++;
			}j=1;
			while(j<=star) {  		//star loop
				   
				System.out.print(val+"\t"); 
				val++; 
				j++;
			}
			System.out.println();  //row increment
			i++; 
			star+=2;space--;
			
		}
		}
	
	

	}




