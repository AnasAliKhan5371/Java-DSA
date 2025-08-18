package Lec_09;

public class Insertion_Sort_2 {

	public static void main(String[] args) {
		int[] arr= {1,2,7,8,9,11,-8};
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
		for(int j=1;j<arr.length;j++) {
			insert_last_element(arr,j);
		}
	}
	public static void insert_last_element(int [] arr, int i) {
		
		int item=arr[i];
		int j=i-1;
		while(j>=0&&arr[j]>item){
			    arr[j+1]=arr[j];
			     j--;
			 }
		arr[j+1]=item;
		
	}
}