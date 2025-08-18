package Lec_03;

import java.util.Scanner;
public class Pattern_27 {

	public static void main(String[] args) {
		
		 //         1
		//        1 2 1
		//      1 2 3 2 1
		//    1 2 3 4 3 2 1
		//  1 2 3 4 5 4 3 2 1
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
				if(j<star/2+1)		//mirror
					val++; 
				else
					val--;
				j++;
			}
			star+=2;space--;
			
			System.out.println();  //row increment
			i++; 
			
			
		}
		}
	
	

	}


