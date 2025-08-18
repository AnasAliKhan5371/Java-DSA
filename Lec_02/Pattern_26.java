package Lec_02;

public class Pattern_26 {

	public static void main(String[] args) {
	    //          1
		//        1 2 3
		//      1 2 3 4 5
		//    1 2 3 4 5 6 7
		//  1 2 3 4 5 6 7 8 9
		
		int n=5;int star =1,i=1,j=1,k=1,space=n-1;
		
		while(i<=n) {     //row loop
			k=1;
			while(k<=space) {		//space loop
				System.out.print("  ");	//print space
				k++;
			}j=1;
			while(j<=star) {  		//star loop
				System.out.print(j);    //print i
				System.out.print(" ");  
				j++;
			}
			System.out.println();  //row increment
			i++; 
			star+=2;space--;
			
		}
	}

}
