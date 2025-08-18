package Lec_10;

import java.util.Scanner;

public class Majority_Element {

	public static void main(String[] args) {
		// element with count more than n/2
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}int m = 0;
        int index = -1; //index of majority element
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
 
            if (count > m) {
                m = count;
                index = i;
            }
        }
        if (m> n / 2)
            System.out.println(arr[index]);
	}
	}