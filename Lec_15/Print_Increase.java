package Lec_15;

public class Print_Increase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int n=5;
				dec(n);
			}
			public static void dec(int n) {
				if(n==0) {
					
					return;
				}
				dec(n-1);
				System.out.println(n);
				
			}

		}
