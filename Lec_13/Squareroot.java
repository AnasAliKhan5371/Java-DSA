package Lec_13;
import java.util.*;
public class Squareroot {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
System.out.print(floorSqrt(x));
    }
    static int floorSqrt(int x)
    {
        
        if (x==0 || x==1)
            return x;
 
        
        int i=1;
        int ans=1;
 
        while(ans<=x){
            i++;
            ans=i*i;
        }
        return i-1;
    }
}
