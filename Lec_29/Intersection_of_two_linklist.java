package Lec_29;

public class Intersection_of_two_linklist {
	//leet code ques - 160
	
	public class ListNode {
		     int val;
		     ListNode next;
		     ListNode(int x) {
		         val = x;
		         next = null;
		     }
		 }
	
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	         ListNode d=headA;
			ListNode dvgf=headB;
	        while(d!=dvgf){
	            if(d==null){
	                d=headB;
	            }
	            else{
	                d=d.next;
	            }
	                if(dvgf==null){
	                    dvgf=headA;
	                }
	                else{
	                    dvgf=dvgf.next;
	                }
	            
	            
	        }return d;
	        }
	}

}
