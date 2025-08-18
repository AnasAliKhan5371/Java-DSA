package Assignment4;

import java.util.Scanner;

public class Print_upper_triangular_matrix {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//371
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int [n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if (i<=j)
					System.out.print(arr[i][j] + " ");
				else
					System.out.print("0 ");
			}System.out.println();
		}
		

	}

}
