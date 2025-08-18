package Lec_33;

public interface StackI {
	public void push(int item);
	public int pop();
	public static final int x=9;
	public static void fun() {
		System.out.println("hey");
	}
	default void fun1() {
		System.out.println("hey");
	}
	private static void fun2() {
		System.out.println("hey");
	}
}
