package Lec_12;

public class Search_2D_Matrix_1 {
	public static void main(String[] args) {
		// Leetcode - ques. 240
		//	 Search a 2D Matrix II
		
		int [][] arr= {{1,4,7,11,15},
			           {2,5,8,12,19},
			           {3,6,9,16,22},
			           {10,13,14,17,24},
			           {18,21,23,26,30}};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length; j++) {
			System.out.print(arr[i][j] + " ");
		}System.out.println();
	}int item=10;
	System.out.println(search(arr, item));
	
}
public static boolean search(int[][] arr, int item) {
	int i=0,j=arr[0].length-1;
	while(i<arr.length && j>=0) {
		
		if(arr[i][j]==item) {
			return true;
		}
		else if(arr[i][j]>item) {
			j--;
		}
		else {
			i++;
		}
	}return false;
}}