package Lec_08;

public class Reversal_Algo {
	public static void main(String[] args) {
		//LEET CODE - QUES. 189
	
	int k=3;
	int[] arr= {1,2,3,4,5,6,7};
	int n=arr.length;
	for(int i=0;i<n;i++){
        System.out.print(arr[i]+",");
    }
	System.out.println();
	rotate(arr,k);	
	for(int i=0;i<n;i++){
        System.out.print(arr[i]+",");
    }
	} 
	 
	 public static void rotate(int[]arr, int k)
       {int n=arr.length;
       k=k%n;
      reverse(arr,0,n-k-1);  //n-k terms reverse
      reverse(arr,n-k,n-1);	//last k terms reverse
      reverse(arr,0,n-1);	//whole array reverse
    
      
       }
       
       public static void reverse(int[] arr,int i,int j) {
			while(i<j) {
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp ;
			i++;
			j--;	
			}
       }
}
