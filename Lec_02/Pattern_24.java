package Lec_02;

public class Pattern_24 {

	public static void main(String[] args) {
	    //          1
		//        2 2 2
		//      3 3 3 3 3
		//    4 4 4 4 4 4 4
		//  5 5 5 5 5 5 5 5 5
		
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
			while(j<=star) {  		//star loop
				System.out.print(i);    //print i
				System.out.print(" ");  
				j++;
			}
			System.out.println();  //row increment
			i++; 
			star+=2;space--;
			
		}
		}
	
	}
