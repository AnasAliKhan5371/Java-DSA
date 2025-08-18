package Lec_13;

public class String_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("hello");
		System.out.println(s1);
		System.out.println(s2==s4);
		System.out.println(s3==s4);//compare address
		System.out.println(s1==s2);
	}

}
