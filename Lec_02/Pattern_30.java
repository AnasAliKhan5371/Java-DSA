package Lec_02;

public class Pattern_30 {

	public static void main(String[] args) {
			//  5 4 3 2 1
			//  5 4 3 2 1
			//  5 4 3 2 1
			//  5 4 3 2 1
			//  5 4 3 2 1
			int i=1;  //row counter
			int j=1;  //column pointer
			int n=5;
			int star=1;
			while(i<=n) {     //row loop
				j=n;
				while(j>=star) {  //column loop
					System.out.print(j);  //print star
					System.out.print(" ");
					j--;
				}
				System.out.println();  //row increment
				i++;
			}

	}

}
