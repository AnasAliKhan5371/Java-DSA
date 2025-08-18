package Lec_16;

public class Count_SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String s="abc";
				print(s,"");
				System.out.println(c);
			}
	static int c=0; //global
	
			public static void print(String ques , String ans) {
				if(ques.length()==0) {
					c++;
					System.out.println(ans);
					return;
				}
				char ch=ques.charAt(0);
				print(ques.substring(1),ans);
				print(ques.substring(1),ans+ch);
			}
			public static int count(String ques , String ans) {
				if(ques.length()==0) {
					c++;
					System.out.println(ans);
					return 1;
				}
				char ch=ques.charAt(0);
				int a1=count(ques.substring(1),ans);
				int b1=count(ques.substring(1),ans+ch);
				return a1+b1;
			}

		}
