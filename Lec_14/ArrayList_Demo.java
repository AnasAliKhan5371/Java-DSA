package Lec_14;
import java.util.*;
public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> ll=new ArrayList<>();
		System.out.println(ll);
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		ll.add(1,-9);// index range 0 to size
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(2));// range o to size-1
		System.out.println(ll.remove(3));
		System.out.println(ll);
		//update
		ll.set(2, -3);
		System.out.println(ll);
		//print
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i)+ " ");
			
		}
		int arr[]=new int[5];
		for(int v:arr) {
			System.out.println(v + " ");
		}
		System.out.println();
		for(int v:ll) {
			System.out.println(v +" ");
		}
		
	}
	

}
