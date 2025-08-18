package Lec_14;

import java.util.*;

public class Array_Sum_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);//371
		int n = sc.nextInt();
		int[] arr1 = new int [n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] arr2 = new int [m];
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		Sum(arr1,arr2);
	}
	public static void Sum(int[] arr1, int[] arr2) {
		int i=arr1.length-1;
		int j=arr2.length-1;
		int carry=0;
		ArrayList<Integer> ll= new ArrayList<>();
		while(i>=0&&j>=0) {
			int sum=carry+arr1[i]+arr2[j];
			ll.add(sum%10);
			carry=sum/10;
			i--;j--;
		}
		while(i>=0) {
			int sum=carry+arr1[i];
			ll.add(sum%10);
			carry=sum/10;
			i--;
		}
		while(j>=0) {
			int sum=carry+arr2[j];
			ll.add(sum%10);
			carry=sum/10;
			j--;
		}
		if(carry!=0) {
			ll.add(carry);
		}
		for (int k = ll.size()-1; k >=0; k--) {
			System.out.print(ll.get(k)+", ");
		}System.out.println("END");
	}

}
