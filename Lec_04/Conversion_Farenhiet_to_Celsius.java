package Lec_04;
import java.util.*;
public class Conversion_Farenhiet_to_Celsius {

	public static void main(String[] args) {
	/* Print as output the Celsius conversions. 
		Use the formula C = (5/9)(F – 32)
		E.g. for an input of 0, 100 and 20 the 
		output is-
		0 -17
		20 -6
		40 4
		60 15
		80 26
		100 37  */
		
        Scanner sc = new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
        int step=sc.nextInt();
        printFahrenheitTable(start, end, step);

    }
    	public static void printFahrenheitTable(int start, int end, int step) {
        int i,C;
        for(i=start;i<=end;i=i+step){
            C=((i-32)*5)/9;
            System.out.println(i+"\t"+C);
        }
    }
}
