import java.util.Scanner;

public class CheckSubString {
// 4.22 check substring
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a string s1: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter a string s2: ");
		String s2 = input.nextLine();
		
		int index = -1;
		int count = 0;
		boolean matched = false;
		
		for (int i = 0; i < s1.length(); i++){
			if (s1.charAt(i) != s2.charAt(count)){
				count = 0;
		
			}
			
			if (s1.charAt(i) == s2.charAt(count)) {
				if (count == 0)
					index = i;
				count++;
			}
			
			if (count == s2.length()) {
				matched = true;
				break;
			}
		}
		
		if (matched)
			System.out.println("matched at index " + index);
		else
				System.out.println("\"" + s2 +
					"\" is not a substring of \"" + s1 + "\""+ ".");
	}

}
