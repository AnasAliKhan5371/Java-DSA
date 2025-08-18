package Lec_09;

public class Max_Subarray_1 {

	public static void main(String[] args) {
		//LEETCODE QUES - 53
		//TLE
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
		int n=arr.length;
		for(int i=0;i<n;i++){
			int sum=0;
		
			for(int j=i;j<n;j++){
				sum+=arr[j];
				ans=Math.max(ans,sum);
		 }
		}
		return ans;
		}

}
