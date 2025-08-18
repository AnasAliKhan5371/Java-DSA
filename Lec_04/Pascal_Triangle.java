package Lec_04;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		int star=1;
		while (i<n) {
			int j=0;
			int val=1;
			while(j<star){
				System.out.print(val+" ");
				val = (val*(i-j))/(j+1);
				j++;
			}
		
		System.out.println();
		star++;
		i++;
}
	}

}
