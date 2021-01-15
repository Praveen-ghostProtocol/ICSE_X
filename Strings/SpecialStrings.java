package Strings;

import java.util.*;
/**
 special words are those which start and end with the same letter 
 WAP to check whether the word is a palindrom or only a special word
 */
public class SpecialStrings
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        boolean userchoice = true;

        while(userchoice)
        {
            System.out.println("Enter a Sentence");
            String input = ob.next().trim().toUpperCase();                
            SpecialPalindromeChecker(input);
            System.out.println("Want to work more?");
            String yesOrNo = ob.next().toUpperCase();
            if(yesOrNo.equalsIgnoreCase("NO"))
            {
                userchoice=false;
            }
        }
        ob.close();
    }
    public static void  SpecialPalindromeChecker(String S)
    {
        String rev="";
        for(int i =0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            rev=ch+rev;
        }
        if(rev.equalsIgnoreCase(S))
        {
            System.out.println(S+" is a palindrome and a special number");
        }
        else if(S.charAt(0)==S.charAt(S.length()-1))
        {
            System.out.println(S+" is a special number");
        }
        else
        {
            System.out.println(S+" is neither a palindrome nor a special number");
        }
    }

}
