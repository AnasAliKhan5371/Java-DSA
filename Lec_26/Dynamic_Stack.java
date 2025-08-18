package Lec_26;
import Lec_24.Stack;

public class Dynamic_Stack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int[] newarr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;

		}
		super.push(item);

	}

	public static void main(String[] args) throws Exception {
		Dynamic_Stack st = new Dynamic_Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.Display();
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.Display();

	}

}