/*Problem Statement 1: “Given a string, check if the string is palindrome or not.” A string is 
said to be palindrome if the reverse of the string is the same as the string.*/

import java.util.*;
public class  palindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter the String:");
		str=sc.nextLine();
		int i=0,j=str.length()-1;
		while(i<j){
		   if(str.charAt(i)!=str.charAt(j)){
			System.out.print("String "+ str + " is not a palindrome String");
			return ;	
		   }
			i++;
			j--;
		}
		System.out.print("String "+str +" is  a palindrome String");
	}
}