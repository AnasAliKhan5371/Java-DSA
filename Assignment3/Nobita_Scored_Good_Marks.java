package Assignment3;
import java.util.*;
		
public class Nobita_Scored_Good_Marks {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		        int n = scanner.nextInt();
		        ArrayList<Integer> a = new ArrayList<>();
		        
		        for (int i = 0; i < 2 * n; i++) {
		            int x = scanner.nextInt();
		            a.add(x);
		        }

		       
		        for (int i = 0; i < 2 * n; ) {
		            System.out.println(a.get(i) % a.get(i + 1));
		            i = 2 + i;
		        }
		        scanner.close();
		    }
		}


