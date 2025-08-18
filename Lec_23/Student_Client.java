package Lec_23;

public class Student_Client {

	public static void main(String[] args) {
	
      Student s = new Student();
      System.out.println(s);
      System.out.println(s.name);
      System.out.println(s.age);
      s.Intro_yourSelf();
      s.name="Kaju";
      s.age=19;
      System.out.println(s.name);
      System.out.println(s.age);
      s.Intro_yourSelf();
      Student s1 = new Student();
      s1.name="Raju";
      s1.age=20;
      s1.Intro_yourSelf();
      s1.SayHey("Ankit");
      Student.MentorName();
	
	}
}
