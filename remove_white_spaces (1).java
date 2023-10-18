/*Problem Statement 4: Given a string, write a program to remove all the whitespaces from 
the string. */
import java.util.*;
public class remove_white_spaces {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            String str;
            System.out.println("Enter the String:");
            str=sc.nextLine();
            String str2=str.replaceAll("\\s", "");
            System.out.print(str2);
        }
}
