package Assignment4;

public class Painter_Partition_Problem_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int[] boards = new int[N];
        for (int i = 0; i < N; i++) {
            boards[i] = scanner.nextInt();
        }

        long left = 0;
        long right = 0;
        for (int i = 0; i < N; i++) {
            right += boards[i];
        }

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canPaint(K, boards, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }

    public static boolean canPaint(int K, int[] boards, long time) {
        int painter = 1;
        long currentTime = 0;
        for (int i = 0; i < boards.length; i++) {
            if (currentTime + boards[i] <= time) {
                currentTime += boards[i];
            } else {
                painter++;
                if (painter > K) {
                    return false;
                }
                currentTime = boards[i];
            }
        }
        return true;
    }
}
