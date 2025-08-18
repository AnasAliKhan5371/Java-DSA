package Assignment3;
import java.util.*;
public class Sorting_in_linear_time {

	public static void main(String[] args) {
		/* You will be given an array containing only 0s,
		1s and 2s. you have sort the array in linear time
		that is O(N) where N is the size of the array.
        The first line contains N, which is the size of 
        the array. The following N lines contain 
        either 0, or 1, or 2. */
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Sorting(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}

		}

		public static void Sorting(int[] arr) {
			int left = 0;
			int right = arr.length - 1;
			int mid = 0;
			while (mid <= right) {
				if (arr[mid] == 2) {
					int t = arr[right];
					arr[right] = arr[mid];
					arr[mid] = t;
					right--;
				} else if (arr[mid] == 0) {
					int t = arr[left];
					arr[left] = arr[mid];
					arr[mid] = t;
					left++;
					mid++;
				} else {
					mid++;
				}
			}

		}

	}