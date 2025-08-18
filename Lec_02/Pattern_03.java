package Lec_02;

public class Pattern_03 {

	public static void main(String[] args) {
		//  * * * * * 
		//  * * * * 
		//  * * * 
		//  * * 
		//  *        
		int n=5;  
		int j=1;  //column pointer
		int space=0;
		int star=n;
		int i=1;  //row counter
		while(i<=n) {     //row loop
			j=1;
			while(j<=star) {  		//column loop
				System.out.print("* ");  //print star
				j++;
			}int k=1;
			
			
			System.out.println();  //row increment
			i++;
			star--;
			space++;
		}
	}

}
