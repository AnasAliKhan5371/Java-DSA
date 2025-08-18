package Lec_08;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		//LEET CODE - QUES. 42
		//prfix-suffix concept
		int[] arr= {2,3,4,5,6};			
		int n=arr.length;
		for(int i=0;i<n;i++){
		     System.out.print(arr[i]+",");
		 }
		System.out.println();
		int[] a=product(arr);
		for(int i=0;i<n;i++){
		     System.out.print(a[i]+",");
		 }
	}
	public static int[] product(int[] arr) {
		int n=arr.length;
		//left terms product
		int [] l=new int[arr.length];
		l[0]=1;
		for (int i=1;i<n;i++) {
			l[i]=l[i-1]*arr[i-1];
		}
		//right terms product
		int[] r=new int[arr.length];
		r[n-1]=1;
		for (int i=n-2;i>=0;i--) {
			r[i]=r[i+1]*arr[i+1];
		}
		//step 3
		for (int i=0;i<n;i++) {
		arr[i]=l[i]*r[i];
		}
		return arr;
	}
}
