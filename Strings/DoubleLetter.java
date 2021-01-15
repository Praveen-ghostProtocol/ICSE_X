package Strings;

import java.util.*;
/**
to check and print the number of double letter sequences in a sentence
 */
public class DoubleLetter
{
    public static void main(String[] args)
    {
        boolean userchoice = true;
        Scanner ob = new Scanner(System.in);
        while(userchoice)
        {
            DoubleLetterChecker();
            System.out.println("Want to work more?");
            String yesOrNo = ob.next().toUpperCase();
            if(yesOrNo.equalsIgnoreCase("NO"))
            {
                userchoice=false;
            }
        }
        ob.close();
    }

    public static void DoubleLetterChecker()
    {
        System.out.println("Enter a sentence");
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        int counter=0;
        for(int i =0;i<s.length()-1;i++)
        {

            if(s.charAt(i)==s.charAt(i+1))
            {
                counter++;
            }
        }
        System.out.println("the number of double letter sequences are "+counter);
        ob.close();
    }
}
