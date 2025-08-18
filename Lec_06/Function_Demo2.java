package Lec_06;

public class Function_Demo2 {

	public static void main(String[] args) {
		System.out.println("hello");
		int a=10,b=20;
		int c = add(a,b);
		System.out.println(c);
		System.out.println("bye");
	}
	public static int add(int a,int b) {
		int c;
		c=a+b;
		return c;

	}

}
