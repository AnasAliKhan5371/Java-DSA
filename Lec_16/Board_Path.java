package Lec_16;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		print(n,0,"");
	}
	public static void print(int n,int curr, String ans) {
		if(curr==n) {
			System.out.println(ans);
			return;
		}
		if(curr>n) {
			return;
		}
		print(n,curr+1,ans+1);
		print(n,curr+2,ans+2);
		print(n,curr+3,ans+3);
	}

}
