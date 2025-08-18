package Lec_15;

public class Factorial_Tail_Recursion {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fact(n,1));
	}
	public static int fact(int n, int ans) {
		//PMI base case
		if(n==1) {
			return ans;
		}
		//small problem
		return fact(n-1,ans*n);
	}

}
