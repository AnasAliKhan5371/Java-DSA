package Lec_09;
public class Selection_Sort_1 {

	public static void main(String[] args) {
		int[] arr= new int[]{4,-1,5,3,2,1};
		int n=arr.length;
		for(int i=0;i<n;i++){
		     System.out.print(arr[i]+",");
		 }
		System.out.println();
		for(int i=0;i<n-1;i++) {
			int min=sort(arr, i);	//min from i to n
			int temp=arr[i];		//swap
	    	 arr[i]=arr[min];
	    	 arr[min]=temp;
		}	
		for(int i=0;i<n;i++){
		     System.out.print(arr[i]+",");
		 }
	}
	public static int sort(int [] arr, int i) {
		int n=arr.length;
		int min=i;
		for(int j=i+1;j<n;j++){
			     if(arr[j]<arr[min]) {
			    	 min=j;
			     }
			 }
		return min;
	}
}
