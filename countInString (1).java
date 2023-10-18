/*Problem Statement 2: Given a string, write a program to count the number of vowels, 
consonants, and spaces in that string*/
import java.util.*;
public class countInString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("Enter the String:");
		str = sc.nextLine();
		int vowels = 0, consonants = 0, white_spaces = 0;
		str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				white_spaces++;
			}
			else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' 
						|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vowels++;
			} 
			else {
				consonants++;
			}
		}
		System.out.println("Vowels:" + vowels);
		System.out.println("Consonants:" + consonants);
		System.out.println("White spaces:" + white_spaces);

	}
}
