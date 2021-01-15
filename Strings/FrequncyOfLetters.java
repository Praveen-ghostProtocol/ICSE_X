package Strings;

import java.util.*;
/**
Write a program to input a sentence and count and display the number of times 
each letter has occured in the sentence in alphabetical order

 */
public class FrequncyOfLetters
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        boolean userchoice = true;

        while(userchoice)
        {
            System.out.println("Enter a Sentence");
            String input = ob.next().trim().toUpperCase();                
            FrequencyCalculator(input);
            System.out.println("Want to work more?");
            
            String yesOrNo = ob.next().toUpperCase();
            if(yesOrNo.equalsIgnoreCase("NO"))
            {
                userchoice=false;
            }
        }
        ob.close();
    }

    public static void FrequencyCalculator(String Input)
    {
        char ch;
        int cnt=0;
        for(int i =65;i<90;i++)
        {
            cnt=0;
            ch = (char)i;
            for(int j=0;j<Input.length();j++)
            {
                if(Input.charAt(j)==ch)
                {
                    cnt++;
                }
            }
            if(cnt>0)
            {
                System.out.println(ch+" occured "+cnt+" times");
            }
        }
    }
}
