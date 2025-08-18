package Lec_02;

public class Pattern_06 {

	public static void main(String[] args) {
		//  * * * * *
		//      * * * * 
		//          * * *
		//              * *
		//                  *
		int n=5;int star =n;
		int i=1;  //row counter
		int j=1;  //star counter
		int k=1;   //space counter
		int space=0;
		
		while(i<=n) {     //row loop
			k=1;
			while(k<=space) {		//space loop
				System.out.print("  ");	//print space
				k++;
			}j=1;
			while(j<=star) {  		//column loop
				System.out.print("* ");  //print star
				j++;
			}
			System.out.println();  //row increment
			i++; 
			space+=2;star--;
			
			
	}
	}
}
