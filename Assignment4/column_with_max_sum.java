package Assignment4;

public class column_with_max_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();int b=0;
        int[][] a = new int[n][n];
        int maxsum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i][j];
            }
            if (sum > maxsum) {
                maxsum = sum;b=j;
            }
        }System.out.print(b+1);
        System.out.print(" "+maxsum); 
        scanner.close();
    }
}


