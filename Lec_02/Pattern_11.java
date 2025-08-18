package Lec_02;

public class Pattern_11 {

	public static void main(String[] args) {
		 //         *
		//        *   *
		//      *   *   *
		//    *   *   *   *
		//  *   *   *   *   *
		
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
				if(j%2==0)
					System.out.print("  ");  //print space
				else
					System.out.print("* ");	//print star
				j++;
			}
			System.out.println();  //row increment
			i++; 
			star+=2;space--;
		}
	}

}
