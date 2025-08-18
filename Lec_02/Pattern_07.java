package Lec_02;

public class Pattern_07 {

	public static void main(String[] args) {
			//  * * * * * 
			//  *       * 
			//  *       *
			//  *       *
			//  * * * * *
			int i=1;  //row counter
			int j=1;  //column pointer
			int n=5;
			int star=n;
			while(i<=n) {     //row loop
				j=1;
				while(j<=star) {  //column loop
					if(i!=1&&i!=n)
						{if(j!=1&&j!=star)
							System.out.print("  ");  //print star
						else
							System.out.print("* ");
						}
					else
						System.out.print("* ");
					j++;
				}
				System.out.println();  //row increment
				i++;
			} 

	}

}
