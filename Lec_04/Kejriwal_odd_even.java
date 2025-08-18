package Lec_04;
import java.util.*;
public class Kejriwal_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int car ;
		int rem;
		for(int i = 1;i<=n;i++)
		{
			car = sc.nextInt();
	 		int sum1 =0;	//odd
		    int sum2 =0;	//even
		    while(car!=0){
			
			rem=car%10;
			if(rem%2!=0)
			{
				sum1+=+rem;
				
			}
			else if(rem%2==0)
			{
				sum2+=+rem;
			}
			car/=10;
		    }
		if(sum1%3==0 || sum2%4 ==0)
		{
			System.out.println("Yes");
		}
		else 
		{
			System.out.println("No");
		}
		}

	}

}
