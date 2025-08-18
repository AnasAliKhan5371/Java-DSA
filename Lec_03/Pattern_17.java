package Lec_03;
import java.util.*;
public class Pattern_17 {

	public static void main(String[] args) {
		//  * * *   * * *
		//  * *       * *
		//  *           *
		//  
		//  *           *
		//  * *       * *
		//  * * *   * * *
		//  
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int star=(n-1)/2;
		int space=1;
		while(i<=n)		//row loop
		{int j=1;
			while(j<=star) //star loop
			{
				System.out.print("* ");
				j++;
			}
			int k=1;
			while(k<=space)  //space loop 
			{
				System.out.print("  ");
				k++;
			}int l=1;
			while(l<=star) 	//star loop
			{
				System.out.print("* ");
				l++;}
			if(i<=n/2) 	//mirror
			{
				star--;
				space+=2;
			}
			else
			{
				star++;
				space-=2;
			}
			i++;
			System.out.println();	//row increment
		}

	}

}
