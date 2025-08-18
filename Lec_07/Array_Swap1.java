package Lec_07;

public class Array_Swap1 {

	public static void main(String[] args) {
		 	int[] a= new int[]{2,31,4,52,71};
			int[] b= new int[]{9,66,45,7,99};
			for(int i=0;i<a.length;i++) {
				
				System.out.print(a[i]+" ");
			}
			System.out.println();
			for(int i=0;i<b.length;i++) {
				
				System.out.print(b[i]+" ");
			}
			System.out.println();
			swap(a,b);		// ADDRESS SWAP
				for(int i=0;i<a.length;i++) {
				
				System.out.print(a[i]+" ");
				}System.out.println();
				for(int i=0;i<b.length;i++) {
				
				System.out.print(b[i]+" ");
				}
			
			}
			public static void swap(int[] a,int[] b) {
				 
				int[]c=a;
				a=b;
				b=c;
				
			
			
		}
	
	}
