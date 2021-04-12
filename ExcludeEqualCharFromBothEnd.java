//Identify the longest String and exclude the same charaters from the both ends.

package assignment.march26_Array_String;

import java.util.Scanner;

public class ExcludeEqualCharFromBothEnd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input String: ");
		String str = scan.nextLine();
		
		str = excludeSameChars(str);
		if(str.length() > 0) {
			System.out.println(str);
		}else {
			System.out.println("Result String is empty.");
		}
		scan.close();
	}

	private static String excludeSameChars(String str) {
		int length = str.length() / 2; 
		int frontIndex = 0, lastIndex = 0;
		for(int i=0; i<length; i++) {
			frontIndex = i;
			lastIndex = str.length() - i - 1;
			if(str.charAt(frontIndex) == str.charAt(lastIndex)) {
				String temp = "";
				for(int j=frontIndex+1; j<lastIndex; j++) {
					temp += str.charAt(j);
				}
				str = temp;
				break;
			}
		}
		return str;
	}
}
