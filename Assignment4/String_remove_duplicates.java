package Assignment4;

public class String_remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        String S = scanner.nextLine();
	        System.out.println(removeConsecutiveDuplicates(S));
	    }

	    public static String removeConsecutiveDuplicates(String s) {
	        StringBuilder sb = new StringBuilder();
	        char currentChar = s.charAt(0);
	        sb.append(currentChar);
	        for (int i = 1; i < s.length(); i++) {
	            if (s.charAt(i) != currentChar) {
	                sb.append(s.charAt(i));
	                currentChar = s.charAt(i);
	            }
	        }
	        return sb.toString();
	    }
	}