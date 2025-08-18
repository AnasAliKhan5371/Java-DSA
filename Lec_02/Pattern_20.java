package Lec_02;

public class Pattern_20 {
	public static void main(String[] args) {
		int n = 7;
		int star = 1;
		int space = n/2;
		int space1 = -1;
		int row = 1;
		
		while(row<=n)
		{
			int i = 1 ;
			while(i<=space)
			{
				System.out.print("  ");
				i++;
			}
			
			int j=1;
			if(row==1 || row==n)
				{
				  j=2;
				}
			while(j <= star)
			{
				System.out.print("* ");
				j++;
			}
			
			int l = 1;
			while(l <= space1)
			{
				System.out.print("  ");
				l++;
			}
			
			int k = 1;
			if(row ==n )
			{
				k=2;
			}
			while(k <= star)
			{
				System.out.print("* ");
				k++;
			}
			
			
			if(row<=n/2)
			{
				space--;
				space1+=2;
			}
			
			else {
				space++;
				space1-=2;
			}
			
			row++;
			System.out.println();
		}
		
	}
}



