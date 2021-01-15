package Strings;
import java.util.*;
/**
 Input : Mohan Das Karam Chand Gandhi
 Output : M. D. K. C. Gandhi
 */
public class Short_form_Printer2
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String S = ob.nextLine().trim();
        S=S+" ";
        
        String word="";
        String result="";
        for(int i = 0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(ch!=' ')
            {
                word+=ch;
            }
            else
            {
                result= result + Character.toUpperCase(word.charAt(0))+". ";
                word="";
            }
        }
        word = word.toUpperCase();
        result += word;
        System.out.println(result);
        ob.close();
    }
}
