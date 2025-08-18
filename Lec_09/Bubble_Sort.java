package Lec_09;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,3,4,2,1};
		int n=arr.length;
		for(int i=0;i<n;i++){
		     System.out.print(arr[i]+",");
		 }
		System.out.println();
		sort(arr);
		
		for(int i=0;i<n;i++){
		     System.out.print(arr[i]+",");
		 }
	}
	public static void sort(int [] arr) {
		int n=arr.length;
		for(int turn=1;turn<n;turn++) {
			for(int i=0;i<n-turn;i++){
			     if(arr[i]>arr[i+1]) {
			    	 int temp=arr[i];	//swap
			    	 arr[i]=arr[i+1];
			    	 arr[i+1]=temp;
			     }
			 }
		}
	}
}
