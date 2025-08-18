package Assignment4;

public class Aggressive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        int C = scanner.nextInt();
	        int[] stalls = new int[N];
	        for (int i = 0; i < N; i++) {
	            stalls[i] = scanner.nextInt();
	        }
	        Arrays.sort(stalls);

	        int low = 1;
	        int high = stalls[N - 1] - stalls[0];
	        int ans = 0;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (canPlaceCows(stalls, C, mid)) {
	                ans = mid;
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        System.out.println(ans);
	    }

	    public static boolean canPlaceCows(int[] stalls, int C, int minDist) {
	        int count = 1;
	        int prev = stalls[0];
	        for (int i = 1; i < stalls.length; i++) {
	            if (stalls[i] - prev >= minDist) {
	                count++;
	                prev = stalls[i];
	            }
	            if (count == C) {
	                return true;
	            }
	        }
	        return false;
	    }
	}