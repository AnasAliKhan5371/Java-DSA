package Lec_15;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact(n));
	}
	public static int fact(int n) {
		//PMI base case
		if(n==1) {
			return 1;
		}
		int fn=fact(n-1);//small problem
		return fn*n;
	}

}
