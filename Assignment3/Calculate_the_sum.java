package Assignment3;
import java.util.*;
public class Calculate_the_sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        while (q-- > 0) {
            int x = scanner.nextInt();
            x = x % n;
            int[] temp = Arrays.copyOf(v, v.length);
            
            for (int i = 0; i < n; i++) {
                temp[i] = v[i] + v[(i - x + n) % n];
            }
            
            v = Arrays.copyOf(temp, temp.length);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += v[i];
        }
        System.out.println(sum);
        scanner.close();
    }
}