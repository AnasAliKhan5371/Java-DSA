package Assignment4;
import java.util.*;
public class Kth_root {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int test = scanner.nextInt();
	        for (int i = 0; i < test; i++) {
	            long n = scanner.nextLong();
	            int k = scanner.nextInt();
	            System.out.println(square_root(n, k));
	        }
	        scanner.close();
	    } 
	    public static int square_root(long n, int k) {
	        long s = 0;
	        long e = n;
	        int ans = -1;
	        while (s <= e) {
	            long mid = (s + e) / 2;
	            if (Math.pow(mid, k) == n) {
	                return (int) mid;
	            } else if (Math.pow(mid, k) < n) {
	                ans = (int) mid;
	                s = mid + 1;
	            } else {
	                e = mid - 1;
	            }
	        }
	        return ans;
	    }

	   
	}