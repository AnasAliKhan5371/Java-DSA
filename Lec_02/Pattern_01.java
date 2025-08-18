package Lec_02;

public class Pattern_01 {
	public static void main(String[] args) {
		//  * * * * * 
		//  * * * * * 
		//  * * * * *
		//  * * * * *
		//  * * * * *
		int i=1;  //row counter
		int j=1;  //column pointer
		int n=5;
		int star=n;
		while(i<=n) {     //row loop
			j=1;
			while(j<=star) {  //column loop
				System.out.print("* ");  //print star
				j++;
			}
			System.out.println();  //row increment
			i++;
		}
	}

}
