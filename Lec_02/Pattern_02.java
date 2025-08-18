package Lec_02;

public class Pattern_02 {

	public static void main(String[] args) {
		//  * 
		//  * * 
		//  * * * 
		//  * * * * 
		//  * * * * * 
		int i=1;		//row counter
		int n=5;
		int star=1;
		while(i<=n) {	//row loop
			int j=1;	//column counter
			while(j<=star) {	//column loop
				System.out.print("* "); //print star
				j++;
			}
			System.out.println();	//new row
			i++;star++;
		}

	}

}
