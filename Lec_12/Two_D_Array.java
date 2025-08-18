package Lec_12;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int [][]arr=new int[3][4];
		int[][] arr= {{1,2,3},{4,5,6}};
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr);
		for(int i=0;i<2;i++) {
			for(int j=0;j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}

	}

}
