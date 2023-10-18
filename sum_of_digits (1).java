/*Problem Statement 6:  Given a string, calculate the sum of numbers in a string (multiple consecutive digits 
are considered one number)*/
import java.util.*;
public class sum_of_digits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int sum = 0,num = 0;
    for(int i=0;i<str.length();i++)
    {
        char ch = str.charAt(i);
        if(Character.isDigit(ch))
        {
            if(num!=0)
            {
                num *= 10;
            }
            num += Character.getNumericValue(ch);
        }
        else
        {
            sum += num;
            num = 0;
        }
    }
    sum += num;
    System.out.println(sum);
    }
}
