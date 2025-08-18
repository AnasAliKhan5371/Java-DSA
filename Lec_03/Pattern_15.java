package Lec_03;
import java.util.*;
public class Pattern_15 {

	public static void main(String[] args) {
			//  * * * * *
			//      * * * * 
			//          * * *
			//              * *
			//                  *
			//              * *
			//          * * *
			//      * * * *
			//  * * * * *
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int star =n;
			int i=1;  //row counter
			int j=1;  //star counter
			int k=1;   //space counter
			int space=0;
			
			while(i<=2*n-1) {     //row loop
				k=1;
				while(k<=space) {		//space loop
					System.out.print("  ");	//print space
					k++;
				}j=1;
				while(j<=star) {  		//column loop
					System.out.print("* ");  //print star
					j++;
				}
			if(i<n)					//mirror
				{space+=2;star--;
				}
			else
			{
				space-=2;
				star++;
			}
				i++; 
				
				System.out.println();  //row increment
				
				
		}

	}

}
