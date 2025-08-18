package Lec_08;

public class Trapping_Rain_Water {

	public static void main(String[] args) {
		//LEET CODE - QUES. 42
		//prfix-suffix concept
		int[] arr= {6,3,2,9,5,7,4};
		int n=arr.length;
		for(int i=0;i<n;i++){
	        System.out.print(arr[i]+",");
	    }
		System.out.println();
		Trapping(arr);
		
	}
	
	public static void Trapping(int[] arr) {
		int n=arr.length;
		//1 step
		int [] l=new int[arr.length];
		l[0]=arr[0];
		
		for (int i=1;i<n;i++) {
			l[i]=Math.max(l[i-1], arr[i]);
		}
		
		//step 2
		int[] r=new int[arr.length];
		r[n-1]=arr[n-1];
		
		for (int i=n-2;i>=0;i--) {
			r[i]=Math.max(r[i+1], arr[i]);
		}
		
		//step 3
		int ans=0;
		
		for (int i=0;i<n;i++) {
		ans=ans+Math.min(l[i], r[i])-arr[i];
		}
		System.out.println(ans);//9
		
	}

}
