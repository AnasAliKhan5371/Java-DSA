package Lec_07;

public class Array_Reverse {

	public static void main(String[] args) {
		int[] a= new int[]{2,31,4,52,71};
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		reverse(a);		// ADDRESS SWAP
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
			}System.out.println();			
		}
		public static void reverse(int[] a) {
			for(int i=0,j=a.length-1;i<a.length/2;i++,j--) {
			int temp =a[i];
			a[i]=a[j];
			a[j]=temp ;		
	}
	}
}
