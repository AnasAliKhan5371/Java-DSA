package Lec_09;

public class Kadanes_Algo {

	public static void main(String[] args) {
		//LEETCODE QUES - 53
		//MAX SUBARRAY		
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int n=arr.length;
		for(int i=0;i<n;i++){
		     System.out.print(arr[i]+",");
		 }
		System.out.println();
		System.out.println(MaximumSum( arr));
	}
	public static int MaximumSum(int[] arr) {
		int ans=Integer.MIN_VALUE;
		int n=arr.length;int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
			ans=Math.max(ans,sum);
			if(sum<0)
				sum=0;
		 }
		
		return ans;
		}

}


	