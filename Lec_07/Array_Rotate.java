package Lec_07;

public class Array_Rotate {

	public static void main(String[] args) {
		 

		int k=3;
		int[] arr= {1,2,3,4,5,6,7};
		rotate(arr,k);	
		} 
		 
		 public static void rotate(int[]arr, int k)
	       {int n=arr.length;
	       k=k%n;
	      
	       while(k>0){
	    	   int temp=arr[n-1];
	       
	           for(int i=n-1;i>=1;i--){
	                ;
	                arr[i]=arr[i-1];
	                
	           }arr[0]=temp;
	           k--;;
	       } 
	       for(int i=0;i<n;i++){
	           System.out.print(arr[i]+",");
	       }
	}}