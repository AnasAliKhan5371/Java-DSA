package Lec_07;

public class Array_Swap {

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
			swap(a,b);
	for(int i=0;i<a.length;i++) {
				
				System.out.print(a[i]+" ");
				}System.out.println();
				for(int i=0;i<b.length;i++) {
				
				System.out.print(b[i]+" ");
				}
			}
			public static void swap(int[] a,int[] b) {
				int[] c=new int [5];
				for(int i=0;i<a.length;i++) {
				c[i]=a[i];
				a[i]=b[i];
				b[i]=c[i];
				
				}
			
			
		}
	
	}
