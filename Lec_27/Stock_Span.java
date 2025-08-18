package Lec_27;

import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {50,5,3,2,8,7,9,11,3}; 
		Cal_Span(arr);
	}
	public static void Cal_Span(int[] arr) {
		int[] ans=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=i+1;
			}
			else {
				ans[i]=i-st.peek();
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] +"," + ans[i]);
		}
	}


}
