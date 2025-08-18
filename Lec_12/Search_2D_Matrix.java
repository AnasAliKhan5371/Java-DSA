package Lec_12;

public class Search_2D_Matrix {

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
	search(arr, item);
	
}
public static void search(int[][] arr,int item) {
	int c=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length; j++) {
			if(arr[i][j]==item)
				c=1;
		}
	}
	if(c==1)
		System.out.println("true");
	else
		System.out.println("false");
}


	}


