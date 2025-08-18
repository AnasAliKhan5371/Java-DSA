package Lec_03;
import java.util.*;
public class Pattern_25 {

	public static void main(String[] args) {
		
		 //             1
		//           2  3  4
		//         5 6  7  8  9
		//     10 11 12 13 14 15 16
		//  17 18 19 20 21 22 23 24 25
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();int star =1;
		int i=1;	//row counter
		int j=1;	//star counter
		int k=1;	//space counter
		int space=n-1;
		int val=1;
		while(i<=n) {     //row loop
			k=1;
			while(k<=space) {		//space loop
				System.out.print("\t");	//print space
				k++;
			}j=1;
			while(j<=star) {  		//star loop
				   //print i
				System.out.print(val+"\t"); val++; 
				j++;
			}
			System.out.println();  //row increment
			i++; 
			star+=2;space--;
			
		}
		}
	
	

	}


