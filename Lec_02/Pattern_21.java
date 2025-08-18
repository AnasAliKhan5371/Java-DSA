package Lec_02;

public class Pattern_21 {

	public static void main(String[] args) {
		//  *               *
		//  * *           * *
		//  * * *       * * *
		//  * * * *   * * * *
		//  * * * * * * * * *
		
		int n=5;
		int star =1;
		int i=1;	//row counter
		int j=1;	//star counter
		int k=1;	//space counter
		int space=2*n-3;
		
		while(i<=n) {     //row loop
			j=1;
			while(j<=star) {  		//star loop
				System.out.print("* ");	//print star
				j++;
				}
				k=1;
			while(k<=space) {		//space loop
				System.out.print("  ");	//print space
				k++;
			
			}
			j=1;
			if(i == n)
				j=2;
			while(j<=star) {  		//star loop
				System.out.print("* ");	//print star
				j++;
				}
			
			System.out.println();  //row increment
			i++; 
			space-=2;star++;
		}
	}

}
