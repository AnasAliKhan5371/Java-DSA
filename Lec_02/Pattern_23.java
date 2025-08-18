package Lec_02;

public class Pattern_23 {

	public static void main(String[] args) {

	
	     //          1
		 //        1 1 1
		 //      1 1 1 1 1
		 //    1 1 1 1 1 1 1
		 //  1 1 1 1 1 1 1 1 1
		
		int n=5;int star =1;
		int i=1;	//row counter
		int j=1;	//star counter
		int k=1;	//space counter
		int space=n-1;
		
		while(i<=n) {     //row loop
			k=1;
			while(k<=space) {		//space loop
				System.out.print("  ");	//print space
				k++;
			}j=1;
			while(j<=star) {  		//ONE loop
				System.out.print("1 ");  //print ONE
				j++;
			}
			System.out.println();  //row increment
			i++; 
			star+=2;space--;
			
		}
	
		}
	
	}
