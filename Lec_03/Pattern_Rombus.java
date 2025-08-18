package Lec_03;
import java.util.*;
public class Pattern_Rombus {

	public static void main(String[] args) {
		//      1
		//    2 3 2
		//  3 4 5 4 3
		//    2 3 2
		//      1
		
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int i = 1;
		int star = 1;
		int space = (2*n-1)/2;
		int val = 1;
		while (i <= 2 * n - 1) {
			// space
			int j = 1;
			while (j <= space) {
				System.out.print(" \t");
				j++;
			}
			// star
			int k = 1;
			int p = val;
			while (k <= star) {
				System.out.print(p + "\t");
				if (k <= star / 2) {
					p++;
				} else {
					p--;
				}
				k++;
			}
			// Mirror
			if (i < n) {
				star += 2;
				space--;
				val++;
			} else {
				star -= 2;
				space++;
				val--;
			}
			i++;
			System.out.println();
		}

	}

}