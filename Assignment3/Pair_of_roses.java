package Assignment3;
import java.util.*;
public class Pair_of_roses {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        for (int f = 0; f < t; f++) {
	            int n = scanner.nextInt();
	            int[] a = new int[n];
	            for (int i = 0; i < n; i++) {
	                a[i] = scanner.nextInt();
	            }
	            int m = scanner.nextInt();
	            Arrays.sort(a);
	            int x = 0;
	            int y = n - 1;
	            int small = 0;
	            int large = 0;
	            while (x < y) {
	                if (a[x] + a[y] == m) {
	                    small = a[x];
	                    large = a[y];
	                    x++;
	                    y--;
	                } else if (a[x] + a[y] > m) {
	                    y--;
	                } else if (a[x] + a[y] < m) {
	                    x++;
	                }
	            }
	            System.out.println("Deepak should buy roses whose prices are " + small + " and " + large + ".");
	        }
	        System.out.println();
	        scanner.close();
	    }
	}