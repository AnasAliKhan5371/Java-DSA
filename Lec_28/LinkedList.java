package Lec_28;

public class LinkedList {
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
	
	public void addIndex(int item, int k) throws Exception {
		if (k==0) {
			addFirst(item);
		}
		else if(k==size) {
			addLast(item);
		}
		else {
			Node k_1th = GetNode(k - 1);
			Node nn=new Node();
			nn.data=item;
			nn.next = k_1th.next;
			k_1th.next=nn;
			size++;
			
		}
	}
	
	public int getFirst() {
		return head.data;
	}
	
	public int getLast() {
		return tail.data;
	}
	
	public int getIndex(int k) throws Exception {
		return GetNode(k).data;
	}
	
	public int removeFirst() {
		Node temp=head;
		if(size==1) {
			head=null;
			tail=null;
			size--;
		}
		else {
			head=head.next;
		}
		return temp.data;
	}
	
//O(N)
	public int removeLast() throws Exception {
		if(size==1){
			return removeFirst();
		}
		else {
			Node temp=GetNode(size-2);
			int v=tail.data;
			tail=temp;
			tail.next=null;
			size--;
			return v;
		}
	}

	public int removeIndex(int k) throws Exception {
		if(k==0) {
			return removeFirst();
			
		}
		else if(k==size-1) {
			return removeLast();
		}
		else {
			Node kth = GetNode(k);
			Node k_th=GetNode(k-1);
			k_th.next=kth.next;
			kth.next=null;
			size--;
			return kth.data;
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
}
