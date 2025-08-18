package Assignment3;
import java.util.*;
public class Inverse_of_an_array {

static int[] arr;
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        arr=inverse(arr);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] inverse(int[] arr){

        int[] narr = new int[arr.length];

        for(int i = 0;i < arr.length;i++){

            narr[arr[i]] = i;
        }

        return narr;
    }
}
	
  
