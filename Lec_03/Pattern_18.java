package Lec_03;
import java.util.*;
public class Pattern_18 {

	public static void main(String[] args) {
		//          *
		//        * * *
		//      * * * * *
		//    * * * * * * *
		//      * * * * *
		//        * * *
		//          *
		Scanner sc = new Scanner(System.in);//n=7
		int n = sc.nextInt();
		int i=1;
		int star=1;
		int space=n/2+1;
		while(i<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}int k=1;
			while(k<=star) {
				System.out.print("* ");
				k++;
				
			}
			if(i<n/2+1) 
				{star+=2;
				space--;
				}
			else
				{star-=2;
				space++;
				}
			i++;
			System.out.println();
		}
	}

}