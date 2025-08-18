package Lec_04;
import java .util.*;
public class Simple_Input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int sum=0,x,i=0;
        int[] arr=new int[9];
        while(sc.hasNext())
        {
         x=sc.nextInt();
         int j=0;
         for(j=0;j<6;j++) {
        	 
         }
         arr[i]=x;
         if(sum+arr[i]<0)
                break;
         i++;
        }
        System.out.println();
        for(int j=0;j<i;j++)
        {
            System.out.println(arr[j]);
        }

    }}
	