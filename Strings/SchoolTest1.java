package Strings;
import java.util.*;
public class SchoolTest1
{
    public static void mai()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a non-palindrome word");
        String input = ob.next().trim();
        char ch;
        String rev="",result="";
        
        for(int i =0;i<input.length();i++)
        {
            ch=input.charAt(i);
            rev=ch+rev;
            
        }
        result =""+input+rev;
        System.out.println(result);
        ob.close();
    }
}
