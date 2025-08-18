package Lec_07;

public class Linear_Search {

	public static void main(String[] args) {
//		TODO Auto-generated method stub
//		int[] arr= {2,31,4,52,7,9,66,45};
		int[] arr= new int[]{2,31,4,52,71,9,66,45};
		int item=7;
		System.out.println(check(arr,item));
	}
	public static int check(int[] arr,int item) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) { 
			return i;
			}
			
		}
		
			return -1;
		
	}
}

