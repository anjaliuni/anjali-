/*Problem Statement 3: Given a String, write a program to remove vowels from a given 
String.*/
import java.util.*;
public class remove_vowel{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the String:");
		str=sc.nextLine();
		str.toLowerCase();
		String str2=str.replaceAll("['aeiou']", "");
		System.out.print(str2);
		}
}
