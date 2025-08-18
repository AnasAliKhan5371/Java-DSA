package Lec_03;
import java.util.*;
public class Pattern_13 {

	public static void main(String[] args) {
		//  *
		//  * *
		//  * * *
		//  * * * *
		//  * * * * *
		//  * * * * 
		//  * * *
		//  * *
		//  *
		//  
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();	//input
		int i=1;				//row counter
		int star=1;				//star counter
		while(i <= 2*n-1)		//row loop 
		{
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");	//print star
				j++;
			}
			if(i<n)				//mirror
				{star++;
				 
				}
			else
			{star--;
				
			}i++;
			System.out.println();
		}

	}

}
