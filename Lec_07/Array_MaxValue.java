package Lec_07;

public class Array_MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[]{2,31,4,52,71,9,66,45};
		int item=7;
		max(arr);
		max1(arr);
	}
	public static void max(int[] arr) {
		int c=0;int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) { 
			max=arr[i];
			}
			
		}
		System.out.println(max);
		
		
	}
	public static void max1(int[] arr) {
		int c=0;int m=Integer.MIN_VALUE;//-2^31
		for(int i=0;i<arr.length;i++) {
			m=Math.max(arr[i], m);
			
		}
		System.out.println(m);
		
		
	}
}
