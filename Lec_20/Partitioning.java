package Lec_20;

import java.util.*;

public class Partitioning {

	public static void main(String[] args) {
		// Leet code ques. - 131
		String ques="nitin";
		//String ans="";
		List<List<String>> ans=new ArrayList<>();
		List<String> ll= new ArrayList<>();
		Partition(ques,ll,ans);
		System.out.println(ans);
	}
	public static void Partition(String ques, List<String> ll,List<List<String>> ans ) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			//System.out.println(ll);
			ans.add( new ArrayList<String>(ll));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s=ques.substring(0,i);
			if(isPalindrome(s)==true) {
				ll.add(s);
			Partition(ques.substring(i),ll,ans);
			ll.remove(ll.size()-1);
			}
		}
	}
	public static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i=0,j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;j--;
		}return true;
	}

}
