/*Problem Statement 5 : Write a program to remove all characters from a string except 
alphabets in a given string */
import java.util.*;
public class remove_characters {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                result += ch; 
            }
        }
        System.out.println("String with only alphabets: " + result);
    }
}
