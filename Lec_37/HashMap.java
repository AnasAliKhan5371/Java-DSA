package Lec_37;
import java.util.ArrayList;

public class HashMap<K,V> {
	
	class Node{
		K key;
		V value;
		Node next;
	}
	ArrayList<Node> ll;
	
	public HashMap(){
		this(4);
		}
	public HashMap(int n) {
		ll=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ll.add(null);
		}
	}
	
}
