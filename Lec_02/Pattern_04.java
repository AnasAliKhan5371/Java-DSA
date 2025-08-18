package Lec_02;

public class Pattern_04 {

	public static void main(String[] args) {
		//          * 
		//        * * 
		//      * * *
		//    * * * *
		//  * * * * *
		int i=1;  //row counter
		int j=1;  //column pointer
		int n=5;
		int space=n-1;
		int star=1;
		while(i<=n) {     //row loop
			j=1;
			while(j<=space) {		//space loop
				System.out.print("  ");	//print space
				j++;
			}int k=1;
			while(k<=star) {  		//column loop
				System.out.print("* ");  //print star
				k++;
			}
			System.out.println();  //row increment
			i++;
			space--;
			star++;
		}
	
	}

}
