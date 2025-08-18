package Lec_23;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println(p1.name + " " + p1.age);
		Person p2 = new Person("Raj ", 21);
		System.out.println(p2.name + " " + p2.age);

	}

}
