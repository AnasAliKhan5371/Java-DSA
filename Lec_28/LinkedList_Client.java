package Lec_28;

public class LinkedList_Client {
	public static void main(String[] args) throws Exception {
		LinkedList ll=new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.display();
		ll.addLast(9);
		ll.addLast(8);
		ll.addLast(7);
		ll.display();
		ll.addIndex(11,3);
		ll.display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getIndex(3));
		System.out.println(ll.removeFirst());
		ll.display();
		System.out.println(ll.removeLast());
		ll.display();
		
	}
}
