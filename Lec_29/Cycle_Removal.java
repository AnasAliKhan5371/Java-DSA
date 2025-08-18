package Lec_29;



public class Cycle_Removal {
	class Node{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size=0;
	public void addFirst(int item) { //O(1)
		Node nn=new Node();
		nn.data=item;
		if (size==0) {
			head=nn;
			tail=nn;
			size++;
		}
		else {
			nn.next=head;
			head=nn;
			size++;      
		}
		
	}
	
	public void addLast(int item) {
		if(size==0) {
			addFirst(item);
		}
		else {
			Node nn=new Node();
			nn.data=item;
			tail.next=nn;
			tail=nn;
			size++;
		}
	}
	
	public 	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println(".");
	}
	
	private Node GetNode(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("k glat hai");
		}
		Node temp=head;
		for (int i = 0; i < k; i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	public void createCycle() throws Exception{
		Node nn=GetNode(2);
		tail.next=nn;
	}
	
	public Node hasCycle() {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return slow;
			}
			
		}return null;
	}
	
	public void CycleRemove1() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}
	}

	public void CycleRemove2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		// cycle ki length
		int c = 1;
		Node temp = meet;
		while (temp.next != meet) {
			c++;
			temp = temp.next;
		}
		// ek node ko m distance move kra diya
		Node fast = head;
		for (int i = 0; i < c; i++) {
			fast = fast.next;
		}
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		 fast.next = null;

	}
	public void floyedCycleRemoval() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node slow = head;
		Node fast=meet;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		 fast.next = null;
	}
	public static void main(String[] args) throws Exception {
		Cycle_Removal cl=new Cycle_Removal();
		cl.addLast(10);
		cl.addLast(20);
		cl.addLast(30);
		cl.addLast(40);
		cl.addLast(50);
		cl.addLast(60);
		cl.addLast(70);
		cl.addLast(80);
		cl.createCycle();
		cl.display();
		
	}
}
