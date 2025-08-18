package Lec_13;

public class String_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="bye";
		String s3=s1+s2;
		String s4= "hello"+"bye";
		String s5=s1.concat(s2);
		int []arr=new int[3];
		System.out.println(arr.length);		//variable
		System.out.println(s4.length());	//method
		System.out.println(s4.charAt(4));
		System.out.println("hello"+ 10 + 20 +"bye");//all added as string
		System.out.println("hello"+ (10 + 20) +"bye");//bodmas first
		System.out.println(10 + 20 +"bye");
		System.out.println(s3);
	}

}
