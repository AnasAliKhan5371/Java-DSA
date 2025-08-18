package Lec_09;

public class Insertion_Sort_1 {

	public static void main(String[] args) {
		int[] arr= {1,2,7,8,9,11,3};
		int n=arr.length;
		for(int i=0;i<n;i++){
		     System.out.print(arr[i]+",");
		 }
		System.out.println();
		insert_last_element(arr,n-1);
		for(int i=0;i<n;i++){
		     System.out.print(arr[i]+",");
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


